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
public class Tugas7Main {
    public static void main(String[]args){       
        Scanner ananda = new Scanner(System.in);    
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jml =ananda.nextInt();
        Tugas7[]arrNilai=new Tugas7[jml];
        
        for(int i=0;i<arrNilai.length;i++){
            arrNilai[i]= new Tugas7();
            System.out.println("Mahasiswa "+(i+1)+" ");
            System.out.print("Masukkan nilai 1 : ");
            arrNilai[i].nilail=ananda.nextInt();
            System.out.print("Masukkan nilai 2 : ");
            arrNilai[i].nilai2=ananda.nextInt();
        }
        System.out.println("");
        for(int i=0;i<arrNilai.length;i++){
            System.out.println("Nilai terbaik Mahasiswa ke"+(i+1)+": ");
        arrNilai[i].nilaiTerbaik();
        }
    }
}

