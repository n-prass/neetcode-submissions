class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap of string and list of string
        // create a linked list from the strng array
        //start deleting node and compare with next if match insert to set and delete node 

        Map<String, List<String>> results = new HashMap<>();
        LinkedList<String> linkedStrings = new LinkedList<>(Arrays.asList(strs));
        ListIterator<String> it = linkedStrings.listIterator();

        while(it.hasNext()){
            String value = it.next();
            String sortValue = sort(value);

            if(results.containsKey(sortValue)){
                results.get(sortValue).add(value);
            } else {
                List<String> values = new ArrayList<>();
                values.add(value);
                results.put(sortValue, values);
            }
            it.remove();
        }

        return new ArrayList(results.values());

    }

    private String sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
