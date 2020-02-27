import java.util.Scanner;
public class ArrayPemilihanSuara {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("  Pemilihan Presiden BEM Polinema thn 2020  ");
        System.out.println("--------------------------------------");
        
        
        PemilhanSuara bem = new PemilhanSuara ();
        PemilhanSuara [] arrPS = new PemilhanSuara [4];
		
        for (int i = 0; i < 4 ; i++) {
            arrPS[i] = new PemilhanSuara();
            System.out.print("Nama Kandidat ke-" + (i+1) + " : ");
            arrPS[i].namaKandidat = retno.nextLine();
        }
         System.out.println("--------------------------------------");
        for (int i = 0; i < 4 ; i++) {
            System.out.print("Jumlah Suara kandidat ke -" + (i+1) + " : ");
            arrPS[i].suara = retno.nextInt();
            bem.jumlahSuara += arrPS[i].suara;
	}
        System.out.println("--------------------------------------");
        
        
             int hasil = PemilhanSuara.hitung(bem.jumlahSuara , arrPS[0].suara ,arrPS[1].suara,arrPS[2].suara);
            
        
        if (hasil == 0) {
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
	}else{
            System.out.println("Ketua BEM yang terpilih adalah " + arrPS[hasil-1].namaKandidat);
	}
       
	
    }

   
}
