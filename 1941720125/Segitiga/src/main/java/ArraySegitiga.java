/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class ArraySegitiga {
    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0]=new segitiga(10,4,10,10);
        sgArray[1]=new segitiga(20,10,20,20);
        sgArray[2]=new segitiga(15,6,15,15);
        sgArray[3]=new segitiga(25,10,25,25);
        
        for(int i=0;i<4;i++){
            System.out.println("Luas segitiga ke-"+i+": "+ sgArray[i].hitungLuas());
        }
        System.out.println("=====================================");
        for(int i = 0;i<4;i++){
            System.out.println("Keliling segitiga ke-"+i+": "+sgArray[i].hitungKeliling());
        }
    }
}
