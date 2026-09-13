package Strings;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        List<Character> list = List.of('a', 'e','i','o','u');
        List<Character> l = new ArrayList<>();
        int start =0; 
        int end =0;
        int count =0;
        int maxcount =0;
        while(end<s.length()){
            l.add(s.charAt(end));
            if(list.contains(s.charAt(end))){
                count++;
            }
            
            if(l.size()>k){
                if(list.contains(s.charAt(start))){
                    count--;
                }
                l.remove(0);
                start++;
            }
            if(l.size()==k){
                maxcount = Math.max(count, maxcount);
            }
            end++;
        }
        return maxcount;
    }
}
