class Solution {
    public String reverseTheWord(String s){
        String rev = "";
        for(char ch : s.toCharArray()){
            rev = ""+ch+rev;
        }
        return rev;
    }
    public String reverseWords(String s) {
        String ans = "";
        for(String str : s.split(" ")){
            ans += " "+ reverseTheWord(str)  ;
        }
        return ans.trim();
    }
}
