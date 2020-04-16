/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class PacManMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        PacMan pm = new PacMan();
        System.out.print("Masukkan koordinat x: ");
        pm.x = luluk.nextInt();
        System.out.print("Masukkan koordinat y:  ");
        pm.y = luluk.nextInt();
        System.out.print("Masukkan width: ");
        pm.width = luluk.nextInt();
        System.out.print("Masukkan height: ");
        pm.height = luluk.nextInt();
        
        pm.moveLeft();
        pm.moveRight();
        pm.moveUp();
        pm.moveDown();
    }
    
}
