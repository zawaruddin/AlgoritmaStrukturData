/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Windows 10
 */
public class Nomor1 {                                                           //~
    char nama[] = {'l', 'u', 'l', 'u', 'k',' ', 'm', 'u', 'f', 'i', 'd', 'a'};  //O(1)
    char check[] = {'a', 'f', 'i', 'k', 'l', 'm', 'u'};                         //O(1)
    int jml[] = new int[check.length];                                          //O(1)
    

    public void cekNama() {                                                     //~
        for (int a = 0; a < nama.length; a++) {                                 //O(n)=O(11)
            for (int b = 0; b < check.length; b++) {                            //O(n)=O(7)
                int x = 0;                                                      //O(1)
                if (nama[a] == check[b]) {
                    jml[b] += 1;                                                //O(1)
                } else {
                    jml[x] += 0;                                                //O(1)
                }
            }

        }
    }
}
//Intruksi      = 1+1+1+(11*7*1)+1+1
//              = 3 + 77 + 2
//              = 82
//Notasi Big O  = O(n) : (11*7*1) = 77
 

/**
 * @param args the command line arguments
 */
