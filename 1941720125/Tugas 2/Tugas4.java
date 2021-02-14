/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas4 {
    int x, y, width, height;
    void moveLeft() {
        if (x > 0 && x <= width) {
            int move = x - 1;
            System.out.println("Setelah melakukan moveLeft: " + move);
        } else {
            System.out.println("Hasil moveLeft Koordinat x melebihi width");
        }
    }void moveRight() {
        if (x > 0 && x <= width) {
            int move = x + 1;
            System.out.println("Setelah melakukan moveRight: " + move);
        } else {
            System.out.println("Hasil moveRight Koordinat x melebihi width");
        }
    }void moveUp() {
        if (y > 0 && y <= height) {
            int move = y - 1;
            System.out.println("Setelah melakukan moveUp: " + move);
        } else {
            System.out.println("Hasil moveUp Koordinat y melebihi height");
        }
    }void moveDown() {
        if (y > 0 && y <= height) {
            int move = y + 1;
            System.out.println("Setelah Melakukan moveDown: " + move);
        } else {
            System.out.println("Hasil moveDown Koordinat y Melebihi Height");
        }
    }
}

