/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Windows 10
 */
public class Faktorial {
    
public int nilai;                                //~
    
    public int faktorialIBF(int n){
        int fakto = 1;                          //O(1)      
        for(int a=1; a<=n; a++){                //O(n)
            fakto = fakto*a;                    //O(1)
        }
        return fakto;                           //O(1)
    }
    public int faktorialDC(int n){
        if(n ==1){                                  
            return 1;                           //O(1)
        } else{                                 
            int fakto = n*faktorialDC(n-1);     //O(n)
            return fakto;                       //O(1)
        }
    } 
}
