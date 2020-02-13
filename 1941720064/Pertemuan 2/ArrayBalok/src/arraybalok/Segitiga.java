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
public class Segitiga {
    public double alas;
    public double tinggi;
    public double setengah;
    public double sisi;
  
    public Segitiga(double a,double t,double s,double o){
    alas =a;
    tinggi=t;
    setengah=s;
    sisi=o;
    }
    
    public double hitung_luas(){
    return setengah*alas * tinggi ;
    }
    public double hitung_keliling(){
    return alas+tinggi+alas+tinggi ;
    }
}
