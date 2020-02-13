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
public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] b1Array = new Balok[3];
        
        b1Array[0] = new Balok(100,30,12);
        b1Array[1] = new Balok(120,40,15);
        b1Array[2] = new Balok(210,50,25);
        
        for(int a=0; a<3; a++){
            System.out.println("Volume balok ke-"+a+": "+b1Array[a].hitungVolume());
            
        }
    }
    
}
