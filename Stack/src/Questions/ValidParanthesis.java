package Questions;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isParanthesis(String s){
        if(s ==null || s.length() == 0){
            return true;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else
                if(ch == ')' && !st.isEmpty() && st.peek() == '('){
                    st.pop();
            } else
                if(ch == '}' && !st.isEmpty() && st.peek() == '{'){
                    st.pop();
            }else
                if(ch == ']' && !st.isEmpty() && st.peek() == '['){
                    st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();
        
    }
    public static void main(String[] args) {
        String s = "()[]{}(";

        System.out.println(isParanthesis(s));

    }
}
