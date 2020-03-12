/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Pangkat {
    public int nilai,pangkat;
         
    public int pangkatBF(int a,int n){
        int hasil=1;
        for(int i=0;i<n;i++){
        hasil=hasil*a;
        }
        return hasil;
    }
    public int pangkatDC(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            if(n%2==1)
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            else
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    public static void main(String[] args) {
        Scanner arif=new Scanner (System.in);
        System.out.println("Silahkan pilih menu perhitungan");
        System.out.println("1). Brute Force\n2). Devide and Conquer");
        System.out.print("Pilih 1/2 : ");
        int pilih=arif.nextInt();
        System.out.println("============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen=arif.nextInt();
        Pangkat [] png=new Pangkat[elemen];
        
        for(int i=0;i<elemen;i++){
            png[i]=new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai=arif.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat=arif.nextInt();
        }
        switch(pilih){
        case 1:
        System.out.println("============================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for(int i=0;i<elemen;i++){
        System.out.println("nilai"+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "
                    +png[i].pangkatBF(png[i].nilai, png[i].pangkat));  
        } break;
        case 2:
        System.out.println("============================================");
        System.out.println("Hasil Pangkat dengan Devite and Conquer");
        for(int i=0;i<elemen;i++){
        System.out.println("Nilai"+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "
                +png[i].pangkatDC(png[i].nilai, png[i].pangkat));    
            } 
        break;
        default:
            System.out.println("Erorr!!");
            System.exit(0);
       }
    }
}