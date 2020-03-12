 import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);                                                                             //O(1)
        long mulai,berakhir;
        
        System.out.println("======================================");                                                       //O(1)            
        System.out.print("Maskkan jumlah elemen yang ingin dhitung : ");                                                    //O(1)
        int elemen = retno.nextInt();                                                                                       //O(1)
        
        Faktorial [] fk = new Faktorial [elemen];                                                                           //O(1)
        for (int i = 0; i < elemen; i++) {                                                                                  //O(n)
            fk[i] = new Faktorial ();                                                                                       //O(1)
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");                                                        //O(1)
            fk[i].nilai = retno.nextInt();
        }
        
        mulai = System.nanoTime();                                                                                          //O(1)
        System.out.println("=====================================");                                                        //O(1)
        System.out.println("Hasil Faktorial dengan Brute Force");                                                           //O(1)
        for (int i = 0; i < elemen; i++) {                                                                                  //O(n)
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));            //O(1)
        }
        berakhir = System.nanoTime();                                                                                       //O(1)
        System.out.println("Durasi yang dibutuhkan selama pemrosesan : "+ ((berakhir-mulai)/1000000.0)+ " millsecond");     //O(1)
       
        
        mulai = System.nanoTime();                                                                                          //O(1)
        System.out.println("=====================================");                                                        //O(1)
        System.out.println("Hasil Faktorial dengan Divide and Conquer");                                                    //O(1)
        for (int i = 0; i < elemen; i++) {                                                                                  //O(n)
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));            //O(1)
        }
        berakhir = System.nanoTime();                                                                                       //O(1)
          System.out.println("Durasi yang dibutuhkan selama pemrosesan : "+ ((berakhir-mulai)/1000000.0)+ " millsecond");   //O(1)   
        System.out.println("=====================================");                                                        //O(1)
    }  
}
// maka Banyaknya operasi 
// = 1+1+1+1+1+(n*1*1)+1+1+1+(n*1)+1+1+1+1+1+(n*1)+1+1+1
// = 5+n+3+n+5+n+3
// = 16+3n operasi
// jadi notasi Big O = O(n)+O(n)+O(n)
//                   = 3*O(n) 