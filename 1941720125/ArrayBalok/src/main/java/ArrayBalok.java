/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class ArrayBalok {
    public static void main(String[] args) {
        Balok[]blArray=new Balok[3];
    blArray[0]= new Balok(100,30,12);
    blArray[1]= new Balok(120,40,15);
    blArray[2]= new Balok(210,50,25);
             
      for(int i=0;i<3;i++){   
          System.out.println("Volume balok ke " + i + ": " +blArray[i].hitungVolume());
    }
} 
}

