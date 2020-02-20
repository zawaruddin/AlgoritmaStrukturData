import java.util.Scanner;
public class ArrayBelanja {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Scanner fajar = new Scanner (System.in);
        Belanja[]arrBlj = new Belanja [4];
        
        for (int i = 0; i < 4; i++) {
            arrBlj[i] = new Belanja();
            System.out.println("---------------------");
            System.out.println("Barang ke-"+i);
            System.out.println("---------------------");
            System.out.print("Masukkan nama barang : ");
            arrBlj[i].nama = retno.nextLine();
            System.out.print("Masukkan jumlah barang : ");
            arrBlj[i].jumlah = fajar.nextInt();
            
        }
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            //arrBlj[i]= new Belanja();
            System.out.println("Barang ke-"+i);
            System.out.println("Nama Barang : "+arrBlj[i].nama);
            System.out.println("Jumlah barang : "+arrBlj[i].jumlah);
            System.out.println("Harga Satuan : "+arrBlj[i].cekHargaBarang(arrBlj[i].nama));
            arrBlj[i].hargaTotal=arrBlj[i].hitungHargaTotal(arrBlj[i].cekHargaBarang(arrBlj[i].nama),arrBlj[i].jumlah);
            System.out.println("Harga total : "+arrBlj[i].hargaTotal);
            System.out.println("Diskon pembelian : "+arrBlj[i].Diskon(arrBlj[i].hargaTotal));
            System.out.println("Total Bayar : "+arrBlj[i].hitungHargaBayar(arrBlj[i].hargaTotal,arrBlj[i].Diskon(arrBlj[i].hargaTotal)));
            System.out.println("=================================================================");
            
        }
    }
}
