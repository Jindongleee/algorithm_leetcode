class Solution {
    public String reverseWords(String s) {
        //word & space seperating 
        //trim = 좌우 공백 제거
        s=s.trim();
        // 중간에 연속된 공백 제거
        s=s.replaceAll("\\s+"," ");

        String[] word=s.split(" ");
        String[] answer=new String[word.length];

        for(int i=0;i<word.length;i++){
            answer[i]=word[(word.length-1)-i];
        }

        return String.join(" ",answer);
    }
}