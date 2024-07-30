import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max;
        StringBuilder arr = new StringBuilder();
        String answer;
        if (word1.length() > word2.length())
            max = word1.length();
        else
            max = word2.length();

        for (int i = 0; i < max; i++) {
            if (i < word1.length())
                arr.append(word1.charAt(i));
            if (i < word2.length())
                arr.append(word2.charAt(i));
        }
        answer = arr.toString();
        return answer;
    }
}
