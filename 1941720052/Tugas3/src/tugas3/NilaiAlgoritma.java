/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Windows 10
 */
public class NilaiAlgoritma {
    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    int hitungTotalNilai(int a, int b, int c, int d){
        int total = (a*30/100)+(b*20/100)+(c*20/100)+(d*30/100);
        return total;
    }
    
}
