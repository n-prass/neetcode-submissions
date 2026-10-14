class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] result = new int[length];

        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.getLast()]) {
                int prevDay = stack.removeLast();
                result[prevDay] = i - prevDay;
            }
            stack.add(i);
        }
        return result;
    }
}
