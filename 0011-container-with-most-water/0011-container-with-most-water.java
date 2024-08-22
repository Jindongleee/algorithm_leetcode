class Solution {
    public int maxArea(int[] height) {
        // HashSet<Integer> arr = new HashSet<>();
        // int maxWater;
        // int firstWater=(height.length-1)*Math.min(height[0],height[height.length-1]);
        // //하나의 for문으로
        // for(int i=0;i<height.length;i++)
        //     for(int j=i+1;j<height.length;j++){
        //         maxWater = (j-i)*Math.min(height[i],height[j]);
        //         if(maxWater>firstWater)
        //             firstWater=maxWater;
        //     }

        // return firstWater;

        int left=0;
        int right=height.length-1;
        int cmp=0;
        int max = (right-left)*Math.min(height[left],height[right]);

        while(left<right){
            if(height[left]>height[right])
                right--;
            else if(height[left]<=height[right])
                left++;

            cmp=(right-left)*Math.min(height[left],height[right]);

            max=Math.max(cmp,max);
        }

        return max;
    }
}