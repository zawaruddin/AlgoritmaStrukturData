/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class PengurutanTiket {
     Tiket list[]=new Tiket[5];
     int idx;
     
      void tambah(Tiket m){
        if(idx<list.length){
            list[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
      
        void tampil(){
        for(Tiket m : list){
            m.tampil();
        System.out.println("--------------------------");
        }
    }
        
        
    void bubbleShort(){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 1; j < list.length-i; j++) {
                if(list[j].harga>list[j-1].harga){
                    Tiket tmp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=tmp;
                }
            }
        }
    }
    
    void selectionSort(){
         for (int i = 0; i < list.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < list.length; j++) {
                if(list[j].harga<list[idxMin].harga){
                    idxMin=j;
                }
            }
            Tiket tmp=list[idxMin];
            list[idxMin]=list[i];
            list[i]=tmp;
        }
    }
}
