/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Ligainggris {
    String nama;
    int point;
    int main;
    int selisihGol;

    public Ligainggris(String nama,int main, int selisihGol, int point) {
        this.nama = nama;
        this.point = point;
        this.main = main;
        this.selisihGol = selisihGol;
    }
    
    void tampil(){
        System.out.println(""+nama+""+main+"\t\t"+selisihGol+"\t\t"+point);
    }
    
      static void insertionSort(Ligainggris[] array, boolean ascending) {
        int i, j;
        for (i = 1; i < array.length; i++) {
            Ligainggris temp;
            temp = array[i];
            j = i;
            if (ascending == true) {
                while ((j > 0) && (array[j - 1].point > temp.point)) {
                    array[j] = array[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (array[j - 1].point < temp.point)) {
                    array[j] = array[j - 1];
                    j--;
                }
            }
            array[j] = temp;
        }
    }   
}