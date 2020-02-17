import java.util.Scanner;
public class BarangMain {
    Scanner dhimas = new Scanner(System.in);
    public static void main(String[] args) {
        Barang br = new Barang();
        br.nama = "dhimas";
        br.jumlah = 1;
        br.hargaSatuan = 10000;
        System.out.print("");
        int hargaTotal = br.hitungHargaTotal();
        int diskon = br.hitungDiskon(hargaTotal);
        System.out.println(hargaTotal);
        System.out.println(diskon);
        System.out.println(br.hitungHargaBayar(hargaTotal, diskon));
    }
}
