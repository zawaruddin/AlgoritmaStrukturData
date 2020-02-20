package jobsheet2tugas;

/**
 *
 * @author khoirul
 */
public class Kampus {
    int nilai1, nilai2;

    int nilaiTerbaik() {
        int max;
        if (nilai2 < nilai1) {
            max = nilai1;
        } else {
            max = nilai2;
        }
        return max;
    }
}
