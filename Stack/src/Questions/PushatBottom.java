package Questions;

import java.util.Stack;

public class PushatBottom {
    public static void pustAtBottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
        } else {
            int top = st.pop();
            pustAtBottom(data, st);
            st.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(12);
        st.push(18);
        System.out.println( "before push " +st);

        pustAtBottom(10, st);
        System.out.println( " after push "+st);
        System.out.println("top element is " + st.peek());
    }
}
