package Strings;

public class ReverseWordsInString {
    class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        s =s.replaceAll("\\s+", " ");
        //s= s.reverse();
        s = new StringBuilder(s).reverse().toString();
        s = s + ' ';
        int start=0;
        int end =0;
        char[] arr = s.toCharArray();
        for(int i =0; i<arr.length;i++){
            if(arr[i] ==' '){
                end = i-1;
                while(start<end){
                    //char[] arr = 
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;

                }
                start = i+1;
                end = i+1;

            }

        }
        s =  new String(arr);
        s = s.strip();
        return s;
    }
}
}
