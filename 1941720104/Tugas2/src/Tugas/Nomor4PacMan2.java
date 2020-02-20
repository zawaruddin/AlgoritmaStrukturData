/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class Nomor4PacMan2 {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Nomor4PacMan c = new Nomor4PacMan();
        System.out.print("Masukkan koordinat x: ");
        c.x = daffa.nextInt();
        System.out.print("Masukkan koordinat y: ");
        c.y = daffa.nextInt();
        System.out.print("Masukkan width: ");
        c.width = daffa.nextInt();
        System.out.print("Masukkan height: ");
        c.height = daffa.nextInt();

        c.moveLeft();
        c.moveRight();
        c.moveUp();
        c.moveDown();
    }
}
