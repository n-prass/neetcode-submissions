class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int pivot = ((end - start) / 2) + start;
            int current = nums[pivot];
            if (current == target) {
                return pivot;
            }
            if (target > current) {
                start = pivot + 1;
            }
            if (target < current) {
                end = pivot - 1;
            }
        }
        if (nums[start] == target) {
            return start;
        }

        return -1;
    }
}
