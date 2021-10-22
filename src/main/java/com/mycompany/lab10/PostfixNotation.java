package com.mycompany.lab10;

import java.util.Collections;
import java.util.Stack;

public class PostfixNotation {

    private final String exp;

    public PostfixNotation(String exp) {
        this.exp = exp;
    }
    
    public int evalPostfix()
    {
        // base case
        if (exp == null || exp.length() == 0) {
            System.exit(-1);
        }
 
        // create an empty stack
        Stack<Integer> stack = new Stack<>();
        // traverse the given expression
        boolean a = true;
        for (char c: exp.toCharArray())
        {
            
            // if the current character is an operand, push it into the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // if the current character is an operator
            else {
                System.out.println(stack);
                if (a){ 
                    reverse(stack);
                    a = false;
                }
                
                // remove the top two elements from the stack
                int x = stack.pop();
                int y = stack.pop();
 
                // evaluate the expression 'x op y', and push the
                // result back to the stack
                if (c == '+') {
                    stack.push(y + x);
                }
                else if (c == '-') {
                    stack.push(y - x);
                }
                else if (c == '*') {
                    stack.push(y * x);
                }
                else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
        // last element to be pop and will be the final answer
        return stack.pop();
    }
    
    public static void reverse(Stack<Integer> stack) {
        stack.sort(Collections.reverseOrder());
        System.out.println("After reverse");
        System.out.println(stack);
    }
}
