import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public HashMap<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        
        if (digits.length() == 0) {
            return answer;
        }
        
        backtracking(digits, 0, answer, new StringBuilder());
        return answer;
    }

    public void backtracking(String digits, int index, List<String> answer, StringBuilder str) {
        if (index == digits.length()) {
            answer.add(str.toString());
            return;
        }
        
        String value = phone.get(digits.charAt(index));
        for (int i = 0; i < value.length(); i++) {
            str.append(value.charAt(i));
            backtracking(digits, index + 1, answer, str);
            str.deleteCharAt(str.length() - 1);
        }
    }
    
}
