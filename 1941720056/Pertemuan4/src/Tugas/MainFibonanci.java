
package Tugas;
import java.util.Scanner;
public class MainFibonanci {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);             //O(1)
        
        System.out.print("Masukkan jumlah angka : ");       //O(1)
        int n = retno.nextInt();                            //O(1)
        fibonanci fbn = new fibonanci();                    //O(1)
       
        System.out.println("Brute Force : ");               //O(1)
        fbn.bruteForce(n);                                  //O(1)
        System.out.println();                               //O(1)
        System.out.println("DivideConquer: ");              //O(1)
        fbn.dc(n);                                          //O(1)
       
    }
    // Maka banyaknya Operasi 
    // = 1+1+1+1+1+1+1+1+1
    // = 9 operasi
    //Notasi Big O = 0(1)
}
