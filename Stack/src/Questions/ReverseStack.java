package Questions;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            int temp = tempStack.pop();
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        // while(!stack.isEmpty()){
        //     System.out.println(stack.peek());
        //     stack.pop();
        // }
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
