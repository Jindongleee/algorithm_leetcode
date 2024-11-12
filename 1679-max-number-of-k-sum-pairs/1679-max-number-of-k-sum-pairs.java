import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // 배열을 정렬합니다.
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                left++; // 합이 작으면 왼쪽 포인터를 오른쪽으로 이동
            } else {
                right--; // 합이 크면 오른쪽 포인터를 왼쪽으로 이동
            }
        }

        return operations;
    }
}