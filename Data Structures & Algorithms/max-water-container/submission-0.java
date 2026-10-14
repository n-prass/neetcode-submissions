class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, result = 0;

        while (left < right) {
            int sum = Math.min(heights[left], heights[right]) * (right - left);
            if (result < sum) {
                result = sum;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
