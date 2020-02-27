/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingguke3;

/**
 *
 * @author khoirul
 */
    class tugas5 {
    public int j1, j2, j3, j4, suara[], n;
    
    tugas5(int n){
        this.n = n;
        this.suara = new int[n];
    }
    
    int pemilihan(int a){
        if(a == n){
            return 0;
        }
        else {
            if(suara[a] == 1){
                j1+=1;
            }
            else if(suara[a] == 2){
                j2+=1;
            }
            else if(suara[a] == 3){
                j3+=1;
            }     
            else if(suara[a] == 4){
                j4++;
            } 
         return pemilihan(a+1);
        }
    }
}
