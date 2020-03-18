
package TugasPertemuan6;

public class DaftarLiga {
    LigaInggris listLiga [] = new LigaInggris[20];
    int index;
    
    void tambah (LigaInggris LI){
        if (index<listLiga.length){
            listLiga[index] = LI;
            index++;
        }else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(LigaInggris LI : listLiga){
            LI.tampil();
        }
    }
    
    void insertionSortAscending(){
        for (int i = 1; i < listLiga.length; i++) {
            LigaInggris temp = listLiga[i];
            int j=i;
            while((j>0)&&(listLiga[j-1].poin>temp.poin)){
                listLiga[j]=listLiga[j-1];
                j--;
            }
            listLiga[j]= temp;
        }
    }
    
    void insertionSortDescending(){
        for (int i = 1; i < listLiga.length; i++) {
            LigaInggris temp = listLiga[i];
            int j=i;
            while((j>0)&&(listLiga[j-1].poin<temp.poin)){
                listLiga[j]=listLiga[j-1];
                j--;
            }
            listLiga[j]= temp;
        }
    }
}
