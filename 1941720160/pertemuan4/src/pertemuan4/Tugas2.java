package pertemuan4;

/**
 *
 * @author khoirul
 */
public class Tugas2 {
    public int angka;                     
    
    public void hitungFiboBF(){     //Brute Force
        int a=0;                         //O(1)
        int b=1;                        //O(1)
        
        for(int i=0;i<angka;i++){           //O(n)
            System.out.print(a+" ");
            a=a+b;                          //O(1)
            b=a-b;                          //O(1)
                                //TOTAL OPERASI = 1+1+O(n)+1+1
        }
    }
    public int hitungFiboDC(int n){     // Devide And Conquer
        if(n<=0 || n<=1){
            return n;                   //O(2) karena per if nilainya 1 disitu di hitung ada 2 if jadi total O(2)
        }else{
            return hitungFiboDC(n-2)+hitungFiboDC(n-1); // O(n)
                                        //TOTAL OPERASI = 1+1+O(n)
        }
    }
}
