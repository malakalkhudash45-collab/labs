package Assignment_2;

import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }

            temp.push(current);
        }
        return temp;
    }
}