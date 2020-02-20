import java.util.Scanner;
public class arrayPeminjaman {
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Scanner fajar = new Scanner (System.in);
        
        Peminjaman[] arrPj = new Peminjaman[3];
        
        for (int i = 0; i < 3; i++) {
            arrPj[i]= new Peminjaman();
            System.out.println("--------------------");
            System.out.println("Data Penyewa ke-"+i);
            System.out.println("--------------------");
            System.out.print("ID Member : ");
            arrPj[i].ID = retno.nextInt();
            System.out.print("Nama Member : ");
            arrPj[i].namaMember = fajar.nextLine();
            System.out.print("Nama Game : ");
            arrPj[i].namaGame = fajar.nextLine();
            System.out.print("Lama peminjaman (hari):");
            arrPj[i].lamaPinjam = retno.nextInt();
            System.out.print("Harga Sewa : ");
            arrPj[i].hargaSewa = retno.nextInt();
            
        }
        System.out.println("==============================");
        for (int i = 0; i < 3; i++) {
           System.out.println("Penyewa ke-"+i);
            System.out.println("ID : "+arrPj[i].ID);
            System.out.println("Nama Member : "+arrPj[i].namaMember);
            System.out.println("Nama Game : "+arrPj[i].namaGame);
            System.out.println("Lama peminjaman : "+arrPj[i].lamaPinjam);
            System.out.println("Harga Sewa : "+arrPj[i].hargaSewa);
            System.out.println("Harga bayar : "+arrPj[i].hargaBayar(arrPj[i].lamaPinjam, arrPj[i].hargaSewa));
            System.out.println("-------------------------------------");
            
            
        }
       
    }
}
