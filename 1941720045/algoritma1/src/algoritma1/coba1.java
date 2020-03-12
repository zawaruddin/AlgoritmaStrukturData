/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma1;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class coba1 {
     String name;
     int marks;
     char section;

    public static void main(String[] args) {
        coba1[]student=new coba1[2];
        student[0].name="haha";
         student[0].marks=92;
        student[0].section='a';
          for (int i = 0; i < student.length; i++) {
              System.out.println(student[i].name+" ");
        }
    }
  
}
