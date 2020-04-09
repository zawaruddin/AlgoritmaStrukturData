/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;
import java.util.Scanner;
/**
 *
 * @author Rasyedrenaldi
 */
public class QueueMain {
       public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek Front");
        System.out.println("5. Peek Rear");
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Scanner dhimas = new Scanner (System.in);

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = dhimas.nextInt();

        Queue Q = new Queue(n);
        int pilih;
        do{
            menu();
            pilih = dhimas.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = dhimas.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: "+ dataKeluar);
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
            }
        }while(pilih ==1||pilih==2||pilih==3||pilih==4||pilih==5);
    }
}
