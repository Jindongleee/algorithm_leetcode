class Solution {
    public String reverseWords(String s) {
        //word & space seperating 
        s=s.trim();
        s=s.replaceAll("\\s+"," ");

        String[] word=s.split(" ");
        String[] answer=new String[word.length];

        for(int i=0;i<word.length;i++){
            answer[i]=word[(word.length-1)-i];
        }

        return String.join(" ",answer);
    }
}