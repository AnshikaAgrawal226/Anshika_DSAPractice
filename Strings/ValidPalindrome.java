package Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
        //s= s.replaceAll("[0-9]", "");
        s= s.replaceAll("[^A-Za-z0-9]","");
        s= s.toLowerCase();
        int start =0;
        int end = s.length()-1;
        if(start==end){
            return true;
        }
        while(start<end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
