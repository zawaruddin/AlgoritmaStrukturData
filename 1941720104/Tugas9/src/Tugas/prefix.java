/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class prefix {

    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Input ekspresi matematika: ");
        Q = daffa.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        prefix pref = new prefix(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }

    public int n;
    public int top;
    public char[] stack;

    public prefix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push(')');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c
                == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int presedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == ')') {
                push(c);
            }
            if (c == '(') {
                while (stack[top] != ')') {
                    P = P + pop();
                }
                char temp = pop();
            }
            if (IsOperator(c)) {
                while (presedence(stack[top]) >= presedence(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
