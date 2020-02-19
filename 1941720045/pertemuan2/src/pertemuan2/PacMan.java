/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class PacMan {
    public int x,y,width,height;
    
    public void moveLeft(int M){
    int g = M - 1;
    x = g;   
    }
    public void moveRight(int M){
    int g = M + 1;
    x = g; 
    }
    public void moveUp(int v){
    int f = v - 1;
    y = f;
    }
    public void moveDown(int v){
    int f = v + 1;
    y = f;
    }
    public void printPosition(){
        System.out.println("Koordinat Terbaru : "+x+", "+y);
    }
    public static void main(String[] args) {
    Scanner arif=new Scanner (System.in);
    PacMan pm=new PacMan();
        System.out.print("Masukkan width(lebar) : ");
                  pm.width = arif.nextInt();
                  System.out.print("Masukkan height(panjang) : ");
                  pm.height = arif.nextInt();
                  System.out.print("Masukkan koordinat x(mendatar) : ");
                  pm.x = arif.nextInt();
                  System.out.print("Masukkan koordinat y(vertikal) : ");
                  pm.y = arif.nextInt();

                  if ((pm.x > 0 && pm.x < pm.width) && (pm.y > 0 && pm.y <
                  pm.height)) {
                          pm.moveLeft(pm.x);
                          pm.moveUp(pm.y);
                          pm.printPosition();
                  }
    }
}