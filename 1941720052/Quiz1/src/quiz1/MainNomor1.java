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
public class MainNomor1 {

    public static void main(String[] args) {                        //~
        Nomor1 nmr = new Nomor1();                                  //O(1)
        System.out.print("Nama : ");                                //O(1)
        for (int a = 0; a < nmr.nama.length; a++) {                 //O(n)=O(11)
            System.out.print(nmr.nama[a]);                          //O(1)
        }
        System.out.println();                                       //O(1)

        nmr.cekNama();                                              //O(1)
        for (int a = 0; a < nmr.check.length; a++) {                //O(n)=O(7)
            System.out.println(nmr.check[a] + " : " + nmr.jml[a]);  //O(1)
        }

    }

}
//Intruksi      = 1+1+(11*1)+1+1+(7*1)
//              = 2 + 11 + 2 + 7
//              = 21
//Notasi Big O  = 2*O(n) = O(11*1)+O(7*1)
//                       = 11 + 7 = 18
