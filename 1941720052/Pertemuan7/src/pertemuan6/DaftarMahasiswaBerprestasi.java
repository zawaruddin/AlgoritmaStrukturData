/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Windows 10
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx<ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("=============================");
        }
    }
    void bubbleSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                    //dibawah ini proses swap atau penukaran
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<ListMhs.length; j++){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertSort(){
        int i,j;
        for(i=1; i<ListMhs.length; i++){
            Mahasiswa temp = new Mahasiswa();
            temp = ListMhs[i];
            j = i;
            while((j > 0)&&(ListMhs[j-1].ipk > temp.ipk)){
                ListMhs[j] = ListMhs[j-1];
                j--;
            }
            ListMhs[j] = temp;
        }
    }
    
    
}
