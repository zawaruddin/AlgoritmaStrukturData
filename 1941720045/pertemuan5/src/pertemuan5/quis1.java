/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
import java.util.Scanner; 
public class quis1 {
    char kecil,besar;
    public void kecilbesarBF(String nama) {
    kecil=nama.charAt(0);
    besar=nama.charAt(0);
    
        for (int i = 0; i <nama.length(); i++) {
            if(nama.charAt(i) != ' '){
            if(nama.charAt(i)<kecil){
                kecil=nama.charAt(i);
            }
            else if(nama.charAt(i)>besar){
                besar=nama.charAt(i);
        }
        }
        }
    }
    
    public void kecilbesarDC(String nama,int indexAwal,int indexAkhir){
        int tengah;
        char kecil2,besar2;
        
        if (indexAwal==indexAkhir) {
            besar2=nama.charAt(indexAwal);
            kecil2=nama.charAt(indexAkhir);
            
        } else {
            tengah=(indexAwal+indexAkhir)/2;
            kecilbesarDC(nama, indexAwal, tengah);
            besar2=besar;
            kecil2=kecil;
            kecilbesarDC(nama, tengah+1, indexAkhir);
            
            if (besar2 != ' ' && kecil2 != ' ') {
                if(besar<besar2){
                    besar=besar2;
                }if(kecil<kecil2){
                    kecil=kecil2;
                
            }
        }
    }
}  

    public static void main(String[] args) {
        quis1 q=new quis1();
        String kalimat="Hosnol Arifin";
        int panjangKalimat, jumlahHuruf = 1;
        Scanner input = new Scanner(System.in); 
        char[] arrHuruf = kalimat.toCharArray();
        panjangKalimat = arrHuruf.length;
        
        for(int i = 0; i < panjangKalimat; i++){
        for(int j = 0; j < panjangKalimat; j++){ 
        if(arrHuruf[i]!=' '){ 
            if(i!=j&&(arrHuruf[i]==arrHuruf[j])){ 
               jumlahHuruf++; 
               arrHuruf[j]=' '; 
           }
            if(j==panjangKalimat-1){ 
                System.out.println("Jumlah huruf '"+arrHuruf[i]+"' = "+jumlahHuruf); 
                    jumlahHuruf=1; 
                }
            }
        }
    }
        System.out.println("\n========== << BRUTE FORCE >> ==========");
        q.kecilbesarBF("Hosnol Arifin");
        System.out.println("abjad besar: "+q.besar);
        System.out.println("abjad kecil: "+q.kecil);
        
         System.out.println("====== << DEVIDE AND CONQUER >> ======");
         q.kecilbesarDC("Hosnol Arifin", 0, 11);
         System.out.println("abjad besar: "+q.besar);
         System.out.println("abjad kecil: "+q.kecil);
}
}