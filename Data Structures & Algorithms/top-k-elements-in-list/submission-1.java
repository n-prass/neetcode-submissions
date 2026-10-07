class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();

        // 1. Create a count map of each number
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        // 2. Create a arry or list sorting the counter keys based on values
        Integer[] orderedDesc = counter.keySet()
                                    .stream()
                                    .sorted((x, y) -> counter.get(y) - counter.get(x))
                                    .toArray(Integer[]::new);
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = orderedDesc[i];
        }

        return result;
    }
}
