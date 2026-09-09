package Strings;

public class PalindromicSubStrings {
    public int countSubstrings(String s) {
        int count=0;
        
        for(int i =0; i<s.length(); i++){
            String str = "";
            for(int j= i; j<s.length(); j++){
                str = s.charAt(j)+ str;
                if(palindrome(str)){
                    count++;
                }
            }
            
        }
        return count;
    }
    public boolean palindrome(String str){
        if(str.length()==1){
            return true;
        }
        int start =0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
