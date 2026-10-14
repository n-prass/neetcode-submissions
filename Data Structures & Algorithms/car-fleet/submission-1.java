class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < position.length; i++) {
            indexMap.put(position[i], i);
        }
        Arrays.sort(position);
        int fleetCount = position.length;
        double previousTime = 0d;
        for (int i = position.length - 1; i >= 0; i--) {
            int p = position[i];
            int s = speed[indexMap.get(p)];
            double time = (double) (target - p) / s;

            if (time <= previousTime) {
                fleetCount--;
            } else {
                previousTime = time;
            }
        }
        return fleetCount;
    }
}

/*
4 : 10-4 / 2 = 3
*/