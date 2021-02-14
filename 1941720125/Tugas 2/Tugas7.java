/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas7 {
     public int nilail, nilai2; 
     
     public Tugas7() {
     
     } 
public Tugas7 (int n1, int n2, int jml){
nilail = n1; 
nilai2 = n2; 
}
     void nilaiTerbaik () { 
            if (nilail > nilai2) { 
             System.out.println ("Nilai : "+nilail);
            }
            else { System.out.println ("Nilai : " + nilai2); 
        }
            }
}