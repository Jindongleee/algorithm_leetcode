//solution 1
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         // 첫 번째 k개 요소의 합으로 maxSum과 currentSum 초기화
//         int currentSum = 0;
//         for (int i = 0; i < k; i++) {
//             currentSum += nums[i];
//         }
//         int maxSum = currentSum;

//         // 슬라이딩 윈도우 기법을 사용하여 최대 합을 찾기
//         for (int i = k; i < nums.length; i++) {
//             currentSum += nums[i] - nums[i - k]; // 윈도우를 오른쪽으로 이동
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//         }

//         return maxSum / (double) k;
//     }
// }

// //solution 2
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxAvgWindow = sum / k;

        for(int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            maxAvgWindow = Math.max(maxAvgWindow, sum / k);
        }

        return maxAvgWindow;
    }
}
