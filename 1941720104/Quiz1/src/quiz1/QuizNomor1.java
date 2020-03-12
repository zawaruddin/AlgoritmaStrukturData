/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Daffa Cahyo
 */

public class QuizNomor1 {

    /**
     * @param args the command line arguments
     */                                                         
    String nama;                                                

    static void menghitungChar(String nama) {                   
        char[] huruf = new char[nama.length()];                 // O(1)
        int[] jumlahHuruf = new int[nama.length()];             // O(1)
        int jumlahHurufBerbeda = 1;                             // O(1)
        huruf[0] = nama.charAt(0);                              // O(1)
        jumlahHuruf[0] = 1;                                     // O(1) 

        for (int i = 1; i < nama.length(); i++) {               // O(n)
            boolean sudahMuncul = false;                         
            for (int j = 0; j < jumlahHurufBerbeda; j++) {      // O(n)
                if (nama.charAt(i) == huruf[j]) {               
                    sudahMuncul = true;                         // O(1)
                    jumlahHuruf[j] += 1;                        // O(1)
                }                                               
            }                                                   
            if (!sudahMuncul) {                                 
                huruf[jumlahHurufBerbeda] = nama.charAt(i);     // O(1)
                jumlahHuruf[jumlahHurufBerbeda] = 1;            // O(1) 
                jumlahHurufBerbeda++;                           // O(1) 
            }                                                   
        }                                                       
        System.out.println("\nHasil :");
        for (int i = 0; i < jumlahHurufBerbeda; i++) {          // O(n)
            System.out.println("Huruf " + huruf[i] + " : " + jumlahHuruf[i] + " abjad");
        }                                                      
    }                                                          
}                                                               