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
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
  
    public Balok(int p, int l, int t){
    panjang =p;
    lebar =l;
    tinggi=t;
    }
    
    public int hitung_volume(){
    return panjang * lebar * tinggi ;
    }
    
    
}
