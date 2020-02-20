/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class pacmanMain {
    public static void main(String[] args){
    Scanner irul = new Scanner(System.in);
        pacman PCM = new pacman();
        System.out.print("Masukkan koordinat x: ");
        PCM.x = irul.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        PCM.y = irul.nextInt();
        System.out.print("Masukkan width: ");
        PCM.width = irul.nextInt();
        System.out.print("Masukkan height: ");
        PCM.height = irul.nextInt();
        
        PCM.moveLeft();
        PCM.moveRight();
        PCM.moveUp();
        PCM.moveDown();
    }
}
