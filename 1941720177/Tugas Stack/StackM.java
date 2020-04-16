/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

import java.util.Scanner;

/**
 *
 * @author Rasyed
 */
public class StackM {

    int id, tahun;
    String judul;
    StackM next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan id buku      : ");
        id = in.nextInt();
        System.out.print("Masukkan judul        : ");
        judul = str.nextLine();
        System.out.print("Masukkan tahun terbit : ");
        tahun = in.nextInt();
        next = null;
    }

    public void view() {
        System.out.println("Id buku      : " + id);
        System.out.println("Judul        : " + judul);
        System.out.println("Tahun terbit : " + tahun);
    }

    public static void main(String[] args) {
        int menu = 0;
        StackMod st = new StackMod();
        while (menu != 4) {
            System.out.print("1.push\n2.pop\n3.view\n4.exit\n ");
            System.out.println("==============================");
            System.out.print("Masukkan Pilihan : ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    StackM baru = new StackM();
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
                    System.out.println("keluar . . .");
                    break;
                default:
                    System.out.println("salah . . .");
                    break;
            }
            System.out.println(" ");
        }
    }
}
