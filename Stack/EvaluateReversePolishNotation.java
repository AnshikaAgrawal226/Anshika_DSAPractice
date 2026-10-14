package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
        int i =0;
        while(i<tokens.length){
            String ch = tokens[i];
            //if(ch=='+'||ch=='-'||ch=='*'||  ch=='/'){
            //}
            if(ch.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b+a);
            }
            else if(ch.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
            else if(ch.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(b*a);
            }
            else if(ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
                int x = Integer.parseInt(ch);
                st.push(x);
            }
            i++;
        }
        return st.peek();
    }
}
