/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Faktorial {
    public int nilai;
    public int faktorialBF(int n){
        int fakto = 1;
        for(int i = 1; i <= n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }
    public int faktorialDC(int n){
        if(n==1){
            return 1;
        }
        else
        {
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
