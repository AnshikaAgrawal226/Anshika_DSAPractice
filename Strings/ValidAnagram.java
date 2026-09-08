package Strings;

import java.util.HashMap;
//HasMap solution
//Complexity: O(k);
/* 
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            HashMap<Character,Integer>map = new HashMap<>();
            for(int i =0; i<s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                else{
                    map.put(s.charAt(i),1);
                }
            }

            HashMap<Character,Integer>map1 = new HashMap<>();
            for(int i =0; i<t.length(); i++){
                if(map1.containsKey(t.charAt(i))){
                    map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
                }
                else{
                    map1.put(t.charAt(i),1);
                }
            }

            return map.equals(map1);


        }
        else{
            return false;
        }
        
        
    }
}
    */


//optimised solution
//using frequency array
//Time complexity:O(n)
//Space complexity:O(1);
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count!= 0){
                return false;
            }
            
        }
        return true;
        
    }
}
