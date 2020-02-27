/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author Windows 10
 */
public class ContohBigO {
    public static void contohBigO(int angka[]){             
        System.out.println("Pairs: ");                          //O(1)
        int n = angka.length;                                   //O(1)
        
        for(int a=0; a<n; a++){                                 //O(n)
            for(int b=0; b<n; b++){                             //O(n)
                System.out.println(angka[a]+"-"+angka[b]);      //O(1)
            }
        }
        for(int a=0; a<n; a++){                                 //O(n)
            for(int b=0; b<n; b++){                             //O(n)
                System.out.println("hai");                      //O(1)
            }
        }
    }
    
}
