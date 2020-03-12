package QUIS1SEMSETER2;
import java.util.Scanner;
public class HitungJumlahHuruf {
      String nama;
      
      static void HitungNilai(String nama){
          char [] abjad = new char [nama.length()];                         // O(1)
          int sumAbjad[] = new int [nama.length()];                         // O(1)
          
          abjad[0]=nama.charAt(0);                                          // O(1)
          sumAbjad[0]=1;                                                    // O(1)
          int jmlh=1;                                                       // O(1)
          
          for (int i = 1; i < nama.length(); i++) {                         // O(n)
              boolean same= false;                                          // O(1)
                if(nama.charAt(i)!= ' '){
                    for (int j = 0; j < jmlh; j++) {                        // O(n)
                        if(nama.charAt(i)==abjad[j]){
                        same = true;                                        // O(1)                                  
                        sumAbjad[j] += 1;                                   // O(1)
                    }
                }
                if (!same){
                    abjad[jmlh]=nama.charAt(i);                              // O(1)
                    sumAbjad[jmlh] = 1;                                      // O(1)
                    jmlh++;                                                  // O(1)
                }
          }
          }
          System.out.println("===================================");         // O(1)
          for (int i = 0; i < jmlh; i++) {                                   // O(n)
              System.out.println("Huruf "+ abjad[i]+" : "+sumAbjad[i]);      // O(1)
          }
      }
      
        
    }
//maka banyak operasi =
// = 1+1+1+1+1+(19*1*13)+(13*1*1)+(13*1*1*1)+1+(13*1)
// = 5+247+13+13+13
// = 291 operasi

// jadi notasi bigO = O(n^2)

