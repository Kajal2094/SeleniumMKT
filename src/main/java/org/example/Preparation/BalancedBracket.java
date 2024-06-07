package org.example.Preparation;

import java.util.Stack;

public class BalancedBracket {
   public static boolean isBalanced (String input) {
       Stack <Character> stack = new Stack<>();
       char [] charArray = input.toCharArray();
       for (char ch : charArray)
       {
           if(ch == '(' || ch == '[' || ch == '{')
           {
               stack.push(ch);
           }
           else if (ch == ')' || ch == ']' || ch == '}')
           {
               if (stack.isEmpty())
               {
                   return false;
               }
               char top = stack.pop();
               if ((ch == ')' && top != '(') ||
                       (ch == ']' && top != '[') ||
                       (ch == '}' && top != '{'))
               {
                   return false;
               }
           }
       }

       return stack.isEmpty();
   }


    public static void main(String[] args) {
        String name = "(]h,te.([)<)]ysf%><ga(})";
boolean result = isBalanced(name);
if (result)
{
    System.out.println("Balanced");
}
else {
    System.out.println("Not balanced");
}
    }
}
