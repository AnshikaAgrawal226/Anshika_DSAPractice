package Strings;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlength=0;
        int start =0;
        for(int i =0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)) ){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
            //now, characters to be replaced will be equal to the length of substring - frequency of most frequent character
            int maxfreq = 0;
            for(char ch :map.keySet()){
                if(map.get(ch)>maxfreq){
                    maxfreq = map.get(ch);
                }
            }
            
            int replace = (i-start+1)- maxfreq;

            while(replace>k){
                
                if(map.get(s.charAt(start))==1){
                    map.remove(s.charAt(start));
                }
                else{
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);
                }
                start++;
                for(char ch :map.keySet()){
                    if(map.get(ch)>maxfreq){
                        maxfreq = map.get(ch);
                    }
                }
                
                replace = (i-start+1)- maxfreq;
                
            }
            maxlength = Math.max(maxlength,i-start+1);
        }
        return maxlength;
    }
}
