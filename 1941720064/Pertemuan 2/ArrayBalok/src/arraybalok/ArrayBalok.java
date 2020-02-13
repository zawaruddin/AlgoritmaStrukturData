/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybalok;

/**
 *
 * @author Abdulloh Aqil
 */
public class ArrayBalok {

    /**
     * @param args the command line arguments
     */
    //segitiga
    public static void main(String[] args) {
        Segitiga[] b1Array = new Segitiga[4];
        b1Array[0] = new Segitiga(10,4,10,4);
        b1Array[1] = new Segitiga(20,10,20,10);
        b1Array[2] = new Segitiga(15,6,15,6);
        b1Array[3] = new Segitiga(25,10,25,10);
        
       for (int i =0 ; i<4 ;i++){
            System.out.println("Keliling Segitiga ke "+" "+i+":"+b1Array[i].hitung_keliling());
        }
    }
    
}

