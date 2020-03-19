
package TestSearching;

public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        Searching pencarian = new Searching (data,8);
        System.out.println ("isi Array : ");
        pencarian.TampilData();
        
        int cari=30;
        int posisi=1;
        System.out.println("menggunkan sequential search");
        posisi = pencarian.FindSeqSearch(cari);
        
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("====================");
        System.out.println("menggunakan binary search ");
        posisi= pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.Tampilposisi(cari, posisi);
    }
}
