package Strings;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        //creating frequency array for s1
        for(int i =0;i<s1.length(); i++){
            char ch = s1.charAt(i);
            arr[ch-'a']++;
        }

        //Creating frequency array for s2
        int[] freq = new int[26];

        int start =0;
        for(int i =0; i<s2.length();i++){
           freq[s2.charAt(i)-'a']++;

           if(i-start+1 >s1.length()){
                freq[s2.charAt(start)-'a']--;
                start++;
           }

           if(i-start+1 ==s1.length()){
                if(Arrays.equals(arr,freq)){
                    return true;
                }
           }
        }
        return false;
    }
}