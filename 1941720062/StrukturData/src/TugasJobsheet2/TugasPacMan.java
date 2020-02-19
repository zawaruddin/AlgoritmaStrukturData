package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasPacMan {

    public static int x = 0, y = 0, width, height;
    public static String select;

    public static void moveLeft() {
        x -= 1;
    }
    public static void moveRight() {
        x += 1;
    }
    public static void moveUp() {
        y -= 1;
    }
    public static void moveDown() {
        y += 1;
    }
    public static void cetakPosisi() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                if (i == y && j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
