/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Tanah {
    public int panjang,lebar,jumlah, max=0, tanah;
    
    public int luasTanah(){
        return panjang*lebar;
    }
    public static void main(String[] args) {
        Tanah tn=new Tanah();
        Scanner arif=new Scanner (System.in);
        System.out.print("Jumlah Tanah\t: ");
        tn.jumlah=arif.nextInt();
        Tanah[]nh=new Tanah[tn.jumlah];
    
        for(int i=0;i<tn.jumlah;i++){
            nh[i]=new Tanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang\t: ");
            nh[i].panjang=arif.nextInt();
            System.out.print("lebar\t: ");
            nh[i].lebar=arif.nextInt();
        }
         for(int i=0;i<tn.jumlah;i++){
            System.out.println("Luas Tanah "+(i+1)+" "+nh[i].luasTanah()); 
         }
         //for(int i=0;i<tn.jumlah;i++){
            // if(tn.max<nh[i].luasTanah()){
               //  tn.max=nh[i].luasTanah();
                // tn.tanah=i+1;
             //}
        // }
        // System.out.println("");
         //System.out.println("Tanah terluas: Terluas "+tn.tanah);
    }
}