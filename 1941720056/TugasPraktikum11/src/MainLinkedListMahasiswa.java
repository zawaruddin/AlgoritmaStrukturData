import java.util.Scanner;
public class MainLinkedListMahasiswa {
    public static void menu(){
        String dataMenu[]={
            "Add Fisrt Mahasiswa","Add Mahasiswa","Add Last Mahsiswa","Remove","Search","Print","Clear"
        };
        System.out.println("=====================");
        System.out.println("    MENU MAHASISWA   ");
        System.out.println("=====================");
        for (int i = 0; i <dataMenu.length ; i++) {
             System.out.println((i+1)+"."+dataMenu[i]);
        }
        System.out.println("------------------------------------");
        System.out.print("Pilih : ");
    }
    public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
        Scanner fajar = new Scanner (System.in);
        LinkedListMahasiswa data = new LinkedListMahasiswa();
        int pilih,index;
        String nim,nama,alamat;
        
        do {
            menu();
            pilih = retno.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("        ADD FIRST MAHASISWA         ");                    
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan nim      : ");
                    nim=retno.next();
                    System.out.print("Masukkan nama     : ");
                    nama = fajar.nextLine();
                    System.out.print("Masukkan alamat   : ");
                    alamat = fajar.nextLine();
                    System.out.println();
                    try {
                        data.addFirst(nim,nama,alamat);
                    }catch (Exception e){
                         System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    System.out.println("            ADD MAHASISWA          ");                    
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan nim      : ");
                    nim=retno.next();
                    System.out.print("Masukkan nama     : ");
                    nama = fajar.nextLine();
                    System.out.print("Masukkan alamat   : ");
                    alamat = fajar.nextLine();
                    System.out.println();
                    try {
                        data.addFirst(nim,nama,alamat);
                    }catch (Exception e){
                         System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    System.out.println("          ADD LAST MAHASISWA        ");                    
                    System.out.println("------------------------------------");
                    System.out.print("Masukkan nim      : ");
                    nim=retno.next();
                    System.out.print("Masukkan nama     : ");
                    nama = fajar.nextLine();
                    System.out.print("Masukkan alamat   : ");
                    alamat = fajar.nextLine();
                    System.out.println();
                    try {
                        data.addFirst(nim,nama,alamat);
                    }catch (Exception e){
                         System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("          REMOVE        ");                    
                    System.out.println("------------------------");
                    System.out.print("Hapus data ke-:" );
                    index = retno.nextInt();
                    try {
                        data.remove(index);
                    }catch (Exception e){
                         System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    data.print();
                        System.out.println("-----------------------------");
                        System.out.println("     Cari Data Mahasiswa     ");
                        System.out.println("-----------------------------");
                            System.out.print("Masukan NIM yang ingin anda cari :");
                            String nimcari = retno.next();
                            
                            data.carikey(nimcari);
                            
                        break;
                case 6:
                    data.print();
                    break;
                case 7:
                    data.clear();
                    break;
            }
        }while (pilih >=1 && pilih <=7);
    }
}
