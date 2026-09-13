package Strings;

import java.util.HashMap;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
            else{
                map1.put(s.charAt(i),1);
            }
        }
        for(int i =0; i<t.length(); i++){
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
            else{
                map2.put(t.charAt(i),1);
            }
        }
        
        char x= 'z';
        
        for(int i =0; i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i))==1){
                    map1.remove(t.charAt(i));
                }
                else{
                    map1.put(t.charAt(i),map1.get(t.charAt(i))-1);
                }
                if(map2.get(t.charAt(i))==1){
                    map2.remove(t.charAt(i)); 
                }
                else{
                    map2.put(t.charAt(i),map2.get(t.charAt(i))-1);
                    
                }
                
            }
        }
        for(char ch : map2.keySet()){
            x= ch;
        }
        return x;
    }
}
