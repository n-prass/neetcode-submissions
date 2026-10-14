class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < position.length; i++) {
            indexMap.put(position[i], i);
        }
        Arrays.sort(position);
        List<Double> stack = new ArrayList<>();
        for (int i = position.length - 1; i >= 0; i--) {
            int p = position[i];
            int s = speed[indexMap.get(p)];
            double time = (double) (target - p) / s;

            if (stack.isEmpty() || time > stack.getLast()) {
                stack.add(time);
            }
        }
        return stack.size();
    }
}
