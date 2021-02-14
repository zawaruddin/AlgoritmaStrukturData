/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
import java.util.Scanner;
public class Tugas8Main {
   public static void main(String[]args){
        Scanner ananda = new Scanner(System.in);
        int terluas=0,a,x=0;
        
        System.out.println("Masukkan Jumlah Tanah : ");
        a = ananda.nextInt();
        Tugas8[]arrTanah=new Tugas8[a];
        System.out.println("");        
        for(int i=0;i<arrTanah.length;i++){
            arrTanah[i]=new Tugas8();
            System.out.println("Tanah ke" + (i + 1));
            System.out.print("Panjang :");
            arrTanah[i].panjang=ananda.nextInt();
            System.out.print("Lebar :");
            arrTanah[i].lebar=ananda.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrTanah.length;i++){
            System.out.println("Luas Tanah ke "+(i+1)+": "+arrTanah[i].LuasTanah()); 
        } for(int i=0;i<arrTanah.length;i++){
            if(arrTanah[i].LuasTanah()>terluas){
                terluas=arrTanah[i].LuasTanah();
                x=i;
            }
        }
        System.out.println("Tanah Terluas : Tanah ke "+(x+1)+"dengan luas "+terluas);
   }
}
