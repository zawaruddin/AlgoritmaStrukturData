/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Windows 10
 */
public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga();
        sgArray[0].alas = 10;
        sgArray[0].tinggi = 4;
        
        sgArray[1] = new Segitiga();
        sgArray[1].alas = 20;
        sgArray[1].tinggi = 10;
        
        sgArray[2] = new Segitiga();
        sgArray[2].alas = 15;
        sgArray[2].tinggi = 6;
        
        sgArray[3] = new Segitiga();
        sgArray[3].alas = 25;
        sgArray[3].tinggi = 10;
        
        for(int a=0; a<4; a++){
            System.out.println("Segitiga ke-"+a);
            System.out.println("Memiliki Alas: "+sgArray[a].alas+" dan tinggi: "+sgArray[a].tinggi);
            System.out.println("Luas Segitiga ke-"+a+" = "+sgArray[a].hitungLuas(sgArray[a].alas,sgArray[a].tinggi));
            System.out.println("Keliling Segitiga ke-"+a+" = "+sgArray[a].hitungKeliling());
            System.out.println();
        }
    }
    
    
}
