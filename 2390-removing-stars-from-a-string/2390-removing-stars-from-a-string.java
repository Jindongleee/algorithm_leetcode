import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<String> str = new Stack<>();
        StringBuilder arr = new StringBuilder();
        //String arr = "";
        for(int i=0;i<s.length();i++){
            str.push(Character.toString(s.charAt(i)));
            if(s.charAt(i)=='*'){
                str.pop();
                str.pop();
            }
            //arr+=str.get(i);
        }

        for(int i=0;i<str.size();i++){
            arr.append(str.get(i));
        }

    return arr.toString();
    //return arr;
    }
}