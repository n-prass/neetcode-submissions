class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tracker = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (tracker.containsKey(nums[i])) {
                result[0] = tracker.get(nums[i]);
                result[1] = i;
                break;
            }
            tracker.put(target - nums[i], i);
        }
        return result;
    }
}
