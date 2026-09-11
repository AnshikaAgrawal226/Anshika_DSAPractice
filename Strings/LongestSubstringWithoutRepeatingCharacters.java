package Strings;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        int end =0;
        int maxlength  =0;
        while(end<s.length()){
            while(str.contains(String.valueOf(s.charAt(end)))){
                maxlength = Math.max(maxlength,str.length());
                str = str.substring(1);

            }
            str = str+(s.charAt(end));
            
            end++;
        }
        maxlength = Math.max(maxlength,str.length());
        return maxlength;
    }
}
