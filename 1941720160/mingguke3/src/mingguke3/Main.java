/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingguke3;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class Main {
    public static void main(String[] args){
        Scanner irul= new Scanner(System.in);
        Scanner why= new Scanner(System.in);
        
        System.out.println("====PROGRAM PERHITUNGAN RATA- RATA DC====");
        System.out.print("> Masukkan jumlah mahasiswa : ");
        int n= irul.nextInt();
        
        tugas6 arr = new tugas6(n);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("> Masukkan nama mahasiswa" + (i+1) + " :");
            arr.namaMhs[1]=why.nextLine();
            System.out.print("> Masukkan nilai :");
            arr.rata[1] = irul.nextInt();
            System.out.println();   
        }
        for(int i=0; i<arr.jmlh; i++){
            System.out.println("nilai "+ arr.namaMhs[i]+" :"+ arr.rata[i]);
            
        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa :"+String.format("%.2f",arr.rataDC(arr.rata,0,arr.jmlh)));            
        }
        }
