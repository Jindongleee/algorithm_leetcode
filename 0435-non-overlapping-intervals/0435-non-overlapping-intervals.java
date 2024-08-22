class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        //두 열간의 차이 최소
        int count=0;
        
        //정렬
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int std = intervals[0][1];

        for(int i=1;i<intervals.length;i++){

            if(std>intervals[i][0])
                    count++;
            else 
                std=intervals[i][1];
        }

        return count;        
    }
}