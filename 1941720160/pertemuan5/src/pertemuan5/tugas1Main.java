package pertemuan5;

/**
 *
 * @author khoirul
 */
public class tugas1Main {
    public static void main(String[] args) {
        String[] tujuan = { "Solo-Surabaya", "Surabaya-Makasar", "Jayapura-Semarang", "Jakarta-Yogyakarta",
                "Aceh-Palu" };
        float[] bagasi = { 2.5f, 1.5f, 3.5f, 4.0f, 3.0f };
        int[] durasi = { 50, 35, 95, 45, 70 };
        int[] harga = { 450000, 550000, 700000, 650000, 800000 };

        tugas1[] tkt = new tugas1[5];
        for (int i = 0; i < tkt.length; i++) {
            tkt[i] = new tugas1(tujuan[i], bagasi[i], durasi[i], harga[i]);
        }

        System.out.println("Sebelum Sorting : ");
        for (int i = 0; i < tkt.length; i++) {
            tkt[i].tampil();
        }
        System.out.println("===============================");
        System.out.println("Setelah Sorting Metode Bubble Sort : ");
        tugas1.bubbleSort(tkt);
        for (int i = 0; i < tkt.length; i++) {
            tkt[i].tampil();
        }
        System.out.println("===============================");
        System.out.println("Setelah Sorting Metode Selection Sort : ");
        tugas1.selectionSort(tkt);
        for (int i = 0; i < tkt.length; i++) {
            tkt[i].tampil();
        }

    } 
}
}
