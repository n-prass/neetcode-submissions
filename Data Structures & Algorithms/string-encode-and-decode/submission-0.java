class Solution {
    private static final String DELIMITER = "@";
    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String s : strs) {
            builder.append(s.length()).append(DELIMITER).append(s);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf(DELIMITER, i);
            Integer length = Integer.valueOf(str.substring(i, j));
            j = j + 1;
            result.add(str.substring(j, j + length));
            i = j + length;
        }
        return result;
    }
}
