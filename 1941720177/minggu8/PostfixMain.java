/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class PostfixMain {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika:");
        Q = src.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        PostFix post = new PostFix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+ P);
    }
}
