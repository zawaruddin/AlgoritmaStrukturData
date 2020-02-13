/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class segitiga {
    public static void main(String[] args) {
        segitiga[] ppArray = new segitiga[15];
                }
    public int alas;
    public int tinggi;
    public int a;
    public int b;
    
    public segitiga(int a, int t,int x,int y){
        alas=a;
        tinggi=t;
        a = x;
        b=y;
    }
 public double hitungLuas(){
    return alas*tinggi/2;
}
public double hitungKeliling(){
      return alas+a+b;        
}
  
}




        

