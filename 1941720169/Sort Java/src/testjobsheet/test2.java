/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjobsheet;

/**
 *
 * @author Windows
 */
public class test2 {

    static private String expression;
    private MyStack<Character> stack = new MyStack<Character>();

//Constructor
    public PrefixTranslator(String infixExpression) {
        expression = infixExpression;
    }//End of constructor

    public String translate() {
        //Declare Method Variables
        String input = "";
        String output = "";
        char character = ' ';
        char nextCharacter = ' ';

        for (int limit = expression.length(); limit > 0; limit--) {
            character = expression.charAt(limit);

            if (isOperator(character)) {
                output = output + character + " ";
            } else if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                while (!stack.top().equals('(')) {
                    output = output + stack.pop() + " ";
                }
                stack.pop();
            } else {
                if (Character.isDigit(character) && (limit + 1) < limit && Character.isDigit(expression.charAt(limit + 1))) {
                    stack.push(character);
                    stack.push(expression.charAt(limit + 1));
                } else if (Character.isDigit(character)) {
                    stack.push(character);
                } else {
                    output = output + character;
                }
            }
        }//End of for

        while (!stack.isEmpty()) {
            output = output + stack.pop() + " ";
        }

        return output;
    }//End of translate method

//Check priority on characters
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0;
        }
    }//End of priority method

    public boolean isOperator(char element) {
        if (element == '*' || element == '-' || element == '/' || element == '+') {
            return true;
        } else {
            return false;
        }
    }
    

}
