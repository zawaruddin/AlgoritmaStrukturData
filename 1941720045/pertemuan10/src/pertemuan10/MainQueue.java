/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class MainQueue {
    public static void main(String[] args) {
        int pilih,data,posisi;
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n=sc.nextInt();
        
        Queue Q=new Queue(n);
        do{
            Q.menu();
            pilih=sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk =sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan data yang ingin dicari: ");
                    data=sc.nextInt();
                    Q.peekPosition(data);
                    break;
                case 7:
                    System.out.print("Masukkan nomer antrian: ");
                    posisi=sc.nextInt();
                    Q.peekAt(posisi);
            }
            
        }while (pilih==1||pilih==2||pilih==3||pilih==4||pilih==5||pilih==6||pilih==7);
    }
}
