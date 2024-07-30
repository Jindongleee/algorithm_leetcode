import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //오름차순
        Arrays.sort(nums);

        return nums[nums.length-k];

    }
}