package Strings;
import java.util.List;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int start =0;
        int end = s.length()-1;
        char[] str = s.toCharArray();
        List<Character> list = List.of('a','e','i','o','u','A','E','I','O','U');
        while(start<end){
            if(list.contains(str[start]) == false){
                start++;
            }
            if(list.contains(str[end]) == false){
                end--;
            }
            if(list.contains(str[start]) && list.contains(str[end])){
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;

                start++;
                end--;
            }
        }
        s= new String(str);
        return s;

    }
}
