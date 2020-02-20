/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
import java.util.Scanner;
public class Tugas4Main {
    public static void main(String[] args){
    Scanner ananda = new Scanner(System.in);
        Tugas4 PACMAN = new Tugas4();
        System.out.print("Masukkan koordinat x: ");
        PACMAN.x = ananda.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        PACMAN.y = ananda.nextInt();
        System.out.print("Masukkan width: ");
        PACMAN.width = ananda.nextInt();
        System.out.print("Masukkan height: ");
        PACMAN.height = ananda.nextInt();        
        PACMAN.moveLeft();
        PACMAN.moveRight();
        PACMAN.moveUp();
        PACMAN.moveDown();
    }
}


