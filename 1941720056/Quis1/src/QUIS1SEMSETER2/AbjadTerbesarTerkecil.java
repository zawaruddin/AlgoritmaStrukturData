
package QUIS1SEMSETER2;
import java.util.Scanner;
public class AbjadTerbesarTerkecil {
   char max,min,maxx,minn;
     
    public void minmax(String nama){
        min = nama.charAt(0);                                                   //O(1)
        max = nama.charAt(0);                                                   //O(1)
        for (int i = 0; i < nama.length(); i++) {                               //O(n)                              
            if (nama.charAt (i)!= ' '){
                if(nama.charAt(i)<min){
                    min = nama.charAt(i);                                       //O(1)
                                                                     
            }else if (nama.charAt(i)>max){                          
                max = nama.charAt(i);                                           //O(1)                                                   
            }
          }
        }
    }
   public char hasilmin(){
        return minn;                                                            // O(1)
    }
    public char hasilmax(){
        return maxx;                                                            // O(1)
    }
    public void max_min(String nama,int indeks_awal,int indeks_akhir) {
        int indeks_tengah;
        char max2,min2 = 0;
        
        if(indeks_awal == indeks_akhir){
            maxx = nama.charAt(indeks_awal);                                    // O(1)           
            minn = nama.charAt(indeks_akhir);                                   // O(1)
        
        }else {
            indeks_tengah =  (indeks_awal + indeks_akhir)/2;                    // O(1)   
            max_min(nama,indeks_awal,indeks_tengah);                            // O(1)
            max2=maxx;                                                          // O(1)
            min2=minn;                                                          // O(1)
            
            max_min(nama,indeks_tengah + 1, indeks_akhir );                     
              if (max2 !=' ' && min2 !=' '){
                  if (maxx<max2){
                      maxx = max2;                                              // O(1)
                  }else if (minn>min2){
                      minn = min2;                                              // O(1)
                  }
              }
           
        }
        
        // maka banyak operasi tersebut 
        // = 1+1+(19*1*1)+1+1+1+(2^6*1*1)+1+1+1+1
        // = 2+19+3+64+4
        // = 92 operasi
        // maka notasi bigO = O(2^k)
}
}
