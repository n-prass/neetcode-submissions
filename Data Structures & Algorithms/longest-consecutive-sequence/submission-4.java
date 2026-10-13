class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        nums = Arrays.stream(nums).sorted().toArray();

        int previous = 1, current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                current++;
            } else if(nums[i] - nums[i - 1] == 0){
                continue;
            }
            else {
                previous = Math.max(previous, current);
                current = 1;
            }
        }

        return Math.max(previous, current);
    }
}
