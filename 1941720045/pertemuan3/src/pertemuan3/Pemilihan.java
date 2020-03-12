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
public class Pemilihan {
    public int suara,jumlahSuara=0,jumlahKandidat=4;
    public static int control=0,nilai=1,accept=0,accept2=0;
    public String kandidat;
    
    public static int array[]=new int [10000];
    
    public static int hitungDC(int a,int b,int c, int d,int e){
        if(nilai==5){
            nilai=1;
        }
            if(nilai==1&&b>0){
                array[control]=nilai;
                control++;
                nilai++;
                return hitungDC(a, b-1, c, d, e);
            }
            else if(nilai==2&&c>0){
                array[control]=nilai;
                control++;
                nilai++;
                return hitungDC(a, b, c-1, d, e);
        }
            else if(nilai==3&&d>0){
                array[control]=nilai;
                control++;
                nilai++;
                return hitungDC(a, b, c, d-1, e);
        }
            else if(nilai==4&&e>0){
                array[control]=nilai;
                control++;
                nilai++;
                return hitungDC(a, b, c, d, e-1);
        }
            else if(b==0&&c==0&&d==0&&e==0){
                if(array[accept]==array[accept+1]&&accept+1<a){
                return array[accept];
                }
                else if(accept+2<a){
                accept+=2;
                return hitungDC(a, b, c, d, e);
                }
                else{
                return 0;
                }
        }
        else{
            nilai++;
            return hitungDC(a, b, c, d, e);
        }
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        Pemilihan ph=new Pemilihan();
        //System.out.print("Jumlah kandidat = ");
      // ph.jumlahKandidat=arif.nextInt();
        Pemilihan[] PH= new Pemilihan[ph.jumlahKandidat];
        for (int i = 0; i < ph.jumlahKandidat; i++) {
            PH[i]=new Pemilihan();
            System.out.print("Nama Kandidat ke-"+(i+1)+" = ");
            PH[i].kandidat=arif.nextLine();
        }
        System.out.println("");
        for (int i = 0; i < ph.jumlahKandidat; i++) {
            System.out.print("Jumlah suara kandidat ke-"+(i+1)+" = ");
            PH[i].suara=arif.nextInt();
            ph.jumlahSuara+=PH[i].suara;
        }
        int hasil=ph.hitungDC(ph.jumlahSuara, PH[0].suara, PH[1].suara, PH[2].suara, PH[3].suara);
        if(hasil==0){
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
        }
        else{
            System.out.println("Ketua BEM adalah = "+PH[hasil-1].kandidat);
        }
    }
}
