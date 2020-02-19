package TugasJobsheet2;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class TugasPacManMain {
    static Scanner faris = new Scanner(System.in);
    static void salah() {
        System.out.println("Koordinat Tidak Terbaca !!!");
        input();
    }
    static void input() {
        TugasPacMan P = new TugasPacMan();
        P.width = 10;
        P.height = 10;
        System.out.println("Game PacMan : ");
        System.out.println("W = bergerak ke atas");
        System.out.println("S = bergerak ke bawah");
        System.out.println("A = bergerak ke kiri");
        System.out.println("D = bergerak ke kanan");
        System.out.print("Masukkan Huruf Yang Telah Ditentukan : ");
        P.select = faris.nextLine().toLowerCase();
        switch (P.select) {
            case "w":
                if ((P.y - 1) < 0) {
                    salah();
                } else {
                    P.moveUp();
                }
                break;
            case "s":
                if ((P.y + 1) >= P.width) {
                    salah();
                } else {
                    P.moveDown();
                }

                break;
            case "a":
                if ((P.x - 1) < 0) {
                    salah();
                } else {
                    P.moveLeft();
                }
                break;
            case "d":
                if ((P.x + 1) >= P.height) {
                    salah();
                } else {
                    P.moveRight();
                }
                break;
            default:
                System.out.println("Masukkan Input Yang Tepat");
        }
        P.cetakPosisi();
        System.out.println("Titik Koordinat adalah (" + P.x + " , " + P.y + ")");
        input();
    }
    public static void main(String[] args) {
        input();
    }
}