/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class InfixPostfix {
       int n,top;
       char stack[];

    public InfixPostfix(int total) {
        this.n = total;
        this.top = -1;
        this.stack = new char[n];
        push('(');
    }
    
     public void push(char c){
        top++;
        stack[top]=c;
    }
    
    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    
    public boolean isOperand(char c){
        if ((c >='A' && c <='Z')||(c >='a' && c <='z') || (c >='0' && c <='9')|| c==' ' || c =='.'){
        return true;
        }else {
            return false;
        }
    }
    
    public boolean isOperator(char c){
        if(c=='^'||c=='%'||c=='/'||c=='*'||c=='-'||c=='+'){
            return true;
        }else{
            return false;
        }
    }
    
    public int presedence(char c){
        switch(c){
        case '^': return 3;
        case '%': return 2;
        case '/': return 2;
        case '*': return 2;
        case '-': return 1;
        case '+': return 1;
        default : return 0;
        }
    }
    
       public String postfix(String z){
             String P="";
             for (int i = 0; i < n; i++) {
                  char c=z.charAt(i);
                if(isOperand(c)){
                  P=P+c;
                }
                 if (c=='('){
                   push(c);
                }
                 if(c==')'){
                    while(stack[top]!='('){
                    P=P+pop();
                }
                char temp=pop();
                }
                if (isOperator(c)){
                    while(presedence(stack[top])>=presedence(c)){
                    P=P+pop();
            }
            push(c);
        }
    }
    return P;
}
       public static void main(String[] args) {
        Scanner arif=new Scanner (System.in);
        String P,Q;
        System.out.print("infix : ");
        Q=arif.nextLine();
        Q=Q.trim();
        Q=Q+")";
        int total=Q.length();
        
        Postfix post=new Postfix(total);
        P=post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}