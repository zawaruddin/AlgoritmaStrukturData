
package TugasPertemuan6;

public class SortTiket {
    int index ;
    Tiket listTiket [] = new Tiket [4];
    
    void bubbleSort(){ // ascending
        for (int i = 0; i < listTiket.length; i++) {
            for (int j = 1; j < listTiket.length; j++) {
                if (listTiket [j].price<listTiket[j-1].price){
                    Tiket temp = listTiket[j];
                    listTiket[j]= listTiket [j-1];
                    listTiket[j-1]= temp;
                }
            }
        }
        
    }
    
    void selectionSort(){//descending
        for (int i = 0; i < listTiket.length-1; i++) {
            int indexMin=i;
            for (int j = i+1; j < listTiket.length; j++) {
                if(listTiket[j].price>listTiket[indexMin].price){
                indexMin=j;
            }
            }
            Tiket temp = listTiket[indexMin];
            listTiket[indexMin] = listTiket[i];
            listTiket[i]=temp;
        }   
    }
    
    void tambah (Tiket[] tkt){
        if (index<listTiket.length){
            listTiket[index]=tkt[index];
            index++;
        }else {
            System.out.println("Data Sudah penuh !");
        }
    }
    
    void tampilkan (){
        for (Tiket tk : listTiket) {
            tk.tampil();
        }
    }
    
}
