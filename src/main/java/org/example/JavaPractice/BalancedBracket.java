package org.example.JavaPractice;

import java.util.Calendar;
import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String inputstring) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = inputstring.toCharArray();
        for (char ch : charArray) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // If the character is a closing bracket
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Check if the stack is empty or the top of the stack does not match
                if (stack.isEmpty()) {
                    return false; // Unbalanced as there's no corresponding opening bracket
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false; // Unbalanced as the types of brackets do not match
                }
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        String name = "{}";
        boolean result = isBalanced(name);
        if (result)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");
        }

    }
}