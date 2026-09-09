package Strings;

import java.util.Stack;

public class ValidParantheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //int x = 0;
        //int top =-1;
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('|| c=='['){
                stack.push(c);
                //x++;
                //top++;
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top=='(' && c!=')' ||top =='{' && c!='}' || top =='[' && c!=']'){
                    return false;
                    
                }
                
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}