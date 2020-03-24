package TugasPertemuan7;

public class mainTugas1 {
    public static void main(String[] args) {
        int []data= {40,10,90,50,70,20,100,30};
        Tugas1 search = new Tugas1 (data,8);
        
        System.out.println("isi array : ");
        search.tampilData();
        
        int cari=30;
        System.out.println("Menggunakan sequintial search");
        int posisi = search.FindSeqSearch(cari);
        
        search.tampilPosisi(cari, posisi);
        System.out.println("=============================");
        System.out.println("Binary Search ");
        System.out.println("setelah data urut :");
        search.Sort();
        search.tampilData();
        posisi=search.FindBinarySearch(cari, 0, data.length-1);
        search.tampilPosisi(cari, posisi);
    }
}
