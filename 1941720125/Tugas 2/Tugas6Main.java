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
public class Tugas6Main {
    public static void main(String[]args){
        Scanner ananda = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Tanah: ");
        int A = ananda.nextInt();
        Tugas6[] arrTanah = new Tugas6[A];
        System.out.println("");
        
        for(int i=0;i<arrTanah.length;i++){
            arrTanah[i]= new Tugas6();
            System.out.println("Tanah ke-"+(i+1));
            System.out.println("Panjang : ");
            arrTanah[i].panjang=ananda.nextInt();
            System.out.println("Lebar :");
            arrTanah[i].lebar = ananda.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrTanah.length;i++){
        System.out.println("Luas Tanh ke "+(i+1)+": "+arrTanah[i].luasTanah());
    }
}
}
