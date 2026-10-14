class Solution {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0, left = 0, right = height.length - 1, result = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (leftMax <= height[left]) {
                    leftMax = height[left];
                } else {
                    int water = leftMax - height[left];
                    result = water > 0 ? result + water : result;
                }
                left++;
            } else {
                if (rightMax <= height[right]) {
                    rightMax = height[right];
                } else {
                    int water = rightMax - height[right];
                    result = water > 0 ? result + water : result;
                }
                right--;
            }
        }
        return result;
    }
}
