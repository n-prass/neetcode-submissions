class Solution {
    public boolean isValid(String s) {
        Set<Character> openSet = Set.of('(', '{', '[');
        Map<Character, Character> closeMap = Map.of(')', '(', '}', '{', ']', '[');
        Set<Character> closeSet = closeMap.keySet();

        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openSet.contains(c)) {
                stack.add(c);
            } else if (closeSet.contains(c)
                && (stack.isEmpty() || !stack.removeLast().equals(closeMap.get(c)))) {
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
