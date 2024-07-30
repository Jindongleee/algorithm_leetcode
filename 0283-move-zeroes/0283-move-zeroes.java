import java.util.*;

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int front=-1;
//         int rear=-1;
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         for(int i=0;i<nums.length;i++){
//             rear++;
//             if(nums[rear]!=0)
//                 arr.add(nums[rear]);
            
//         }

//         for(int i=0;i<nums.length;i++){
//             front++;
//             if(nums[front]==0)
//                 arr.add(nums[front]);
//         }

//         for(int i=0;i<arr.size();i++){
//             nums[i]=arr.get(i);
//         }
//     }

// }

// import java.util.*;

// class Solution {
//     public void moveZeroes(int[] nums) {
//         int insertPos = 0;

//         // 0이 아닌 요소들을 앞으로 이동
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nums[insertPos] = nums[i];
//                 insertPos++;
//             }
//         }

//         // 나머지 자리를 0으로 채움
//         while (insertPos < nums.length) {
//             nums[insertPos] = 0;
//             insertPos++;
//         }
//     }
// }

//
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            if (nums[i] != 0) { //배열의 요소가 0이 아니라면 값을 담고 인덱스 증가 
                nums[index++] = nums[i];
            }
        }
        //index부터 끝까지 0을 채워준다
        for(int i = index; i<nums.length; i++){
            nums[index++] = 0;
        }
    }
}


