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
public class Jajargenjang {
    public int tinggi,panjang,sisiMiring;
    
    public int hitungLuas(){
        return panjang*tinggi;
    }
    public int hitungKeliling(){
        return 2*(panjang+sisiMiring);
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        Jajargenjang [] jj=new Jajargenjang[5];
        for(int i=0;i<5;i++){
            jj[i]=new Jajargenjang();
            System.out.println("Jajar Genjang ke-"+(i+1));
            System.out.print("Masukkan alas\t\t: ");
            jj[i].panjang=arif.nextInt();
            System.out.print("Masukkan tinggi\t: ");
            jj[i].tinggi=arif.nextInt();
            System.out.print("Masukkan sisi miring\t: ");
            jj[i].sisiMiring=arif.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("ajar genjang ke-"+(i+1)+"\nLuas\t\t: "+jj[i].hitungLuas()+
                    "\nKeliling\t: "+jj[i].hitungKeliling());
        }
    }
}