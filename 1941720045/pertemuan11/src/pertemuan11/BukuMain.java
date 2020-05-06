/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class BukuMain {
    BukuMain next;
    int id,tahun;
    String judul;
    public static Scanner arif=new Scanner(System.in);
    
    public void input(){
        System.out.print("Masuukkan Id\t\t: ");
        id=arif.nextInt();
        judul=arif.nextLine();
        System.out.print("Masukkan judul buku\t: ");
        judul=arif.nextLine();
        System.out.print("Masukkan tahun terbit\t: ");
        tahun=arif.nextInt();
        next=null;
    }
    
    public void view(){
        System.out.println("Id Buku\t\t: "+id);
        System.out.println("Judul Buku\t: "+judul);
        System.out.println("Tahun terbit\t: "+tahun);
    }
    
    public static void main(String[] args) {
        int menu;
        BukuLinkedList st=new BukuLinkedList();
        
        do{
            System.out.println("=========<< MENU >>=========");
            System.out.println("1.PUSH\n2.POP\n3.VIEW\n4.EXIT");
            System.out.println("============================");
            System.out.print("Pilih 1/2/3/4\t: ");
            menu=arif.nextInt();
            
            switch(menu){
                case 1:
                   BukuMain baru=new BukuMain();
                   baru.input();
                   st.push(baru);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.view();
                    break;
                case 4:
                    System.exit(0);
            }
        } while(menu==1||menu==2||menu==3||menu==4);
    }
}
