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
public class MainNasabah {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        int antrian,pilih;
        String nm,no_rek;
        Nasabah nsh=new Nasabah();
  
        System.out.print("Masukkan maksimal antrian: ");
        antrian=arif.nextInt();
        
        QueueNasabah Q=new QueueNasabah(antrian);
     
        do{
            System.out.println("=========== <<MENU>> ===========");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Peek\n"
                + "5. Peek Rear\n6. Peek Position\n7. Print Nasabah");
            System.out.println("--------------------------------");
            System.out.print("Silahkan pilih menu : ");
            pilih=arif.nextInt();
           switch(pilih){
            case 1:
                System.out.println("--------------------------------");
                System.out.print("Masukkan Nama\t: ");
                nm=arif.next();
                System.out.print("Masukkan Nomer Rekening: ");
                no_rek=arif.next();
                Nasabah data2=new Nasabah(no_rek,nm);
                
                Q.enqueue(data2);
                break;
            case 2:
                Nasabah dataKeluar=Q.dequeue();
                if(dataKeluar!=null){
                    System.out.println("Data yang keluar adalah: ");
                    dataKeluar.print();
                }
                break;
            case 3:
               System.out.println("||\tNama Nasabah\t||\tNo Rekening\t||");
               Q.print();
                break;
            case 4:
                Q.peek();
                break;
            case 5:
                Q.peekRear();
                break;
            case 6:
                System.out.println("--------------------------------");
                System.out.print("Nama Nasabah\t: ");
                String nasabah=arif.next();
                System.out.print("Nomer Rekening\t: ");
                String nr=arif.next();
                data2=new Nasabah(nr,nasabah);
                Q.peekPosition(data2);
                break;
            case 7:
                System.out.println("Masukkan nomer antrian: ");
                int posisi=arif.nextInt();
                Q.printNasabah(posisi);
                break;
        }
          
        }
        while (pilih==1||pilih==2||pilih==3||pilih==4||pilih==5||pilih==6||pilih==7);  
    }
}