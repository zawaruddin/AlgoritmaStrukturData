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
public class MahasiswaMain {
    MahasiswaMain next,tail;
    String nama,almt;
    int nim;
    public static Scanner str=new Scanner(System.in);
    
    public void input(){
        System.out.print("Masukkan nim\t: ");
        nim=str.nextInt();
        nama=str.nextLine();
        System.out.print("Masukkan nama\t: ");
        nama=str.nextLine();
        System.out.print("Masukkan alamat\t: ");
        almt=str.nextLine();
        next=null;
    }
    
    public void view(){
        System.out.println("|| "+nim+" || "+nama+" || "+almt+" || ");
    }
    
    public static void main(String[] args) {
        int menu=0;
        MahasiswaLinkedList mhs=new MahasiswaLinkedList();
        do{
            System.out.println("=================<< Menu >>=================");
            System.out.println("1.Add\n2.View\n3.Delete\n4.Exit ");
            System.out.print("Pilih 1/2/3/4 : ");
            menu=str.nextInt();
            switch(menu){
                case 1:
                mhs.add();
                break;
                case 2:
                mhs.view();
                break;
                case 3:
                System.out.println("---------------------");
                System.out.println("a. Delete First\nb. Delete Last\nc. Clear");
                System.out.print("Pilih a/b/c\t: ");
                        String jawab=str.next();
                        if(jawab.equalsIgnoreCase("a")){
                            mhs.removeFirst();
                        }else if(jawab.equalsIgnoreCase("b")){
                            mhs.removeLast();
                        }else if(jawab.equalsIgnoreCase("c")){
                            mhs.clear();
                        }else{
                            System.out.println("Maaf inputan anda tidak sesuai");
                        }
                 break;
                case 4:
                    System.exit(0);
            }
        }while(menu==1||menu==2||menu==3||menu==4);
    }   
}
