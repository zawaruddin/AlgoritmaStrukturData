package tugas4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daffa Cahyo
 */
public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n){
        int fakto = 1;
        int i = 1;
        while(i <= n){
            fakto = fakto * i;
            i++;
        }
        
        return fakto;
    }
    
    public int faktorialDC(int n){
        if(n == 1){
            return 1;
        }
        
        else{
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
//Jumlah Operasi: 1 + 1 + (n * 1 * 1) + 1 + 1 + (n * 1)
//              : 2 + n + 2 + n
//              : 4 + 2n Operasi
//Notasi BigO   : O(n) + O(n)
//              : 2 * O(n)