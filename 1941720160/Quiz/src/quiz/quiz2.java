/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author khoirul
 */
public class quiz2 {
 
 public static void main(String[] args) {
 int[] nilai = {20, 11, 53, 21, 35, 4, 82, 9, 22};
 int max = 0;
 int min = 1000;
 for (int a = 0; a < nilai.length; a++) {
      if (nilai[a] > max) {
          max = nilai[a];
      } else if (nilai[a] < min) {
          min = nilai[a];
      }
 }
 System.out.println("Nilai Maksimum : " + max);
 System.out.println("Nilai Minimun  : " + min);
 }
}

