package Strings;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        if(s.length()==1|| s.length()==0){
            return true;
        }
        int start =0; 
        int end = s.length()-1;
        
        
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                //remove element at index start
                String s1= s.substring(0,start)+ s.substring(start+1);
                boolean ans1 =palindrome(s1);

                //remove element at end index
                String s2 = s.substring(0,end)+ s.substring(end+1);
                boolean ans2=palindrome(s2);

                if(ans1 || ans2){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
    public boolean palindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}
