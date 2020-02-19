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
public class nilaiTerbaik {
    public int nilai1,nilai2,jumlahMahasiswa;
    
    public int cek(){
        if(nilai1>nilai2){
            return nilai1;
        }
        else{
            return nilai2;
        }
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner (System.in);
        nilaiTerbaik nt=new nilaiTerbaik();
        System.out.print("Jumlah Mahasiswa\t: ");
        nt.jumlahMahasiswa=arif.nextInt();
        nilaiTerbaik[] ttn=new nilaiTerbaik[nt.jumlahMahasiswa];
        for(int i=0;i<nt.jumlahMahasiswa;i++){
            ttn[i]=new nilaiTerbaik();
            System.out.println("Mhs "+(i+1));
            System.out.print("Nilai 1\t: ");
            ttn[i].nilai1=arif.nextInt();
            System.out.print("Nilai 2\t: ");
            ttn[i].nilai2=arif.nextInt();
        }
        for (int i=0;i<nt.jumlahMahasiswa;i++){
            System.out.println("Nilai terbaik Mhs "+(i+1)+" "+ttn[i].cek());
        }
    }
}