public class Solution {

    // public int longestCommonSubsequence(String text1, String text2) {

    //     Stack<Character> stack = new Stack<>();
    //     char[] arr1 = text1.toCharArray();
    //     char[] arr2 = text2.toCharArray();

    //     int a1L = arr1.length;
    //     int a2L = arr2.length;

    //     if(a1L>a2L){
    //         for(int i=0;i<a2L;i++){
    //             for(int j=0;j<a1L;j++){
    //                 if(arr2[i]==arr1[j]){
    //                     stack.push(arr2[i]);
    //                 }
    //             }
    //         }

    //     }
    //     else{
    //         for(int i=0;i<a1L;i++){
    //             for(int j=0;j<a2L;j++){
    //                 if(arr2[i]==arr1[j]){
    //                     stack.push(arr1[i]);
    //                 }
    //             }
    //         }
    //     }
    //     return stack.size();

    // }

    public int longestCommonSubsequence(String text1, String text2) {
        // 문자열을 char 배열로 변환
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        int a1L = arr1.length;
        int a2L = arr2.length;

        // DP 배열 생성
        int[][] dp = new int[a1L + 1][a2L + 1];

        // dp 배열 채우기
        for (int i = 1; i <= a1L; i++) {
            for (int j = 1; j <= a2L; j++) {
                // 같은 문자인 경우 이전 값 + 1
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 다른 경우, 위쪽이나 왼쪽 중 큰 값 선택
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp 배열의 마지막 값이 LCS 길이
        return dp[a1L][a2L];
    }

    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();

    //     // DP 배열 생성. dp[i][j]는 text1[0..i-1]와 text2[0..j-1]의 LCS 길이를 나타냄.
    //     int[][] dp = new int[m + 1][n + 1];

    //     // DP 배열 채우기
    //     for (int i = 1; i <= m; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             // 두 문자가 같으면 이전 단계의 값에 +1을 더함
    //             if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
    //                 dp[i][j] = dp[i - 1][j - 1] + 1;
    //             } else {
    //                 // 두 문자가 다르면 위쪽 또는 왼쪽의 값 중 큰 값을 선택
    //                 dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
    //             }
    //         }
    //     }

    //     // DP 배열의 마지막 값이 LCS의 길이
    //     return dp[m][n];
    // }

    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();

    //     // 두 문자열을 char 배열로 변환
    //     char[] arr1 = text1.toCharArray();
    //     char[] arr2 = text2.toCharArray();

    //     // DP 배열 생성. dp[i][j]는 chars1[0..i-1]와 chars2[0..j-1]의 LCS 길이를 나타냄.
    //     int[][] dp = new int[m + 1][n + 1];

    //     // DP 배열 채우기
    //     for (int i = 1; i <= m; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             // 두 문자가 같으면 이전 단계의 값에 +1을 더함
    //             if (arr1[i - 1] == arr2[j - 1]) {
    //                 dp[i][j] = dp[i - 1][j - 1] + 1;
    //             } else {
    //                 // 두 문자가 다르면 위쪽 또는 왼쪽의 값 중 큰 값을 선택
    //                 dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
    //             }
    //         }
    //     }

    //     // DP 배열의 마지막 값이 LCS의 길이
    //     return dp[m][n];
    // }

}