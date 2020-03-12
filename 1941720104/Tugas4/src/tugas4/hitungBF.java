/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class hitungBF{
    public void BF(int n){
        int a = 0, b = 1, c = 0;
        for(int i = 0; i <= n; i++){
            System.out.println(c + " ");
            c = a + b;
            b = a;
            a = c;
        }
    }
    
    public int dc(int n ){
        if(n  == 0 || n == 1){
            return n;
        }
        
        else{
            return (dc(n - 1) + dc(n - 2));
        }
    }
    
    public void DC(int n){
        int a = 0;
        for(int i = 0; i < n; i++){
            a += dc(i);
            System.out.println(dc(i) + " ");
        }
    }
}
//Jumlah Operasi: 1 + (n * 1 * 1 * 1 * 1) + 1 + (2 * n) + 1 + (n * 1 * 1)
//              : 1 + n + 1 + (2 ^ n) + 1 +n
//Notasi BigO   : 3 + 2n + 2 ^ n Operasi
//              : O(2 * n)