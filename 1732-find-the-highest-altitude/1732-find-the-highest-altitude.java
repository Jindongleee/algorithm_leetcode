//solution 1
class Solution {
    public int largestAltitude(int[] gain) {
         int first_altitude = 0;

        int max_altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            first_altitude += gain[i];
            if (first_altitude > max_altitude)
                max_altitude = first_altitude;
        }

        return max_altitude;
    }
}

//---------------------------------

// //solution 2
// class Solution {
//     public int largestAltitude(int[] gain) {
//         int sum = 0;
//         int maxSum = 0;

//         //배열 순회
//         for(int i = 0; i < gain.length; i++){
//             sum += gain[i]; //net altitude 구하기
//             if(maxSum <= sum) //최고지점 찾아야 하므로 비교
//                 maxSum = sum;
//         }

//         return maxSum;
//     }
// }