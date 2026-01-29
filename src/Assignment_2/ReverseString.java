package Assignment_2;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String text) {
        Stack<Character> stack = new Stack<>();

        // push characters into stack
        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String result = "";

        // pop characters from stack
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}