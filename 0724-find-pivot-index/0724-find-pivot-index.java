class Solution {
    // public int pivotIndex(int[] nums) {
        //인덱스 찾기 (해당 인덱스를 기준으로 좌합 우합이 동일해야함)
    //     int index=nums.length/2;

    //     while(index!=0 && index!=nums.length-1){
    //         int leftSum=0;
    //         int rightSum=0;

    //         for(int i=0;i<index;i++)
    //             leftSum+=nums[i];
    //         for(int i=nums.length-1;i>index;i--)
    //             rightSum+=nums[i];

    //         if(leftSum>rightSum)
    //             index--;
    //         else if(leftSum<rightSum)
    //             index++;
    //         else if(leftSum==rightSum)
    //             return index;
    //     }

    //     if(index==0){
    //         int rightSum=0;
            
    //         for(int i=nums.length-1;i>index;i--)
    //             rightSum+=nums[i];
            
    //         if(rightSum==0)
    //             return index;
    //     }

    //     else if(index==nums.length-1){
    //         int leftSum=0;

    //         for(int i=0;i<index;i++)
    //             leftSum+=nums[i];
            
    //         if(leftSum==0)
    //             return index;
    //     }

    //     return -1;
    // }
    
    // public int pivotIndex(int[] nums) {    
    //     int index=0;
    //     while(index<nums.length){
    //         int rightSum=0;
    //         int leftSum=0;

    //         if(index==0){
    //             for(int i=nums.length-1;i>0;i--)
    //                 rightSum+=nums[i];
                
    //             if(rightSum==0)
    //                 return index;
    //             else
    //                 index++;
    //         }

    //         else if(index==nums.length-1){
    //             for(int i=0;i<index;i++)
    //                 leftSum+=nums[i];
                
    //             if(leftSum==0)
    //                 return index;
    //             return -1;
    //         }

    //         else{
    //              for(int i=0;i<index;i++)
    //                 leftSum+=nums[i];

    //              for(int i=nums.length-1;i>index;i--)
    //                 rightSum+=nums[i];

    //             if(rightSum==leftSum)
    //                 return index;
    //             else
    //                 index++;
    //         }
    //     }

    //     return -1;
    // }

    //누적합을 배열로 -> 특정 구간에 대한 합
    public int pivotIndex(int[] nums) {
        int total =0;
        int leftSum=0;
        int rightSum=0;
        
        for(int num:nums){
            total+=num;
        }

        for(int i=0;i<nums.length;i++){
            rightSum=total-nums[i]-leftSum;
            if(rightSum==leftSum)
                return i;
            leftSum+=nums[i];
        }

        return -1;
    }
}