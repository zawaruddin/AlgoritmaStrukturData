import java.util.Scanner;
public class arrayTerbesar {
    
        public static void main(String[] args) {
        Scanner retno = new Scanner (System.in);
    
        System.out.println("Masukkan jumlah tanah : ");
        int n = retno.nextInt();
        
        tanahTerluas[]arrTrls = new tanahTerluas[n];
        
        for (int i = 0; i < n; i++) {
            arrTrls[i]=new tanahTerluas();
            System.out.println("-----------------");
            System.out.println("Tanah ke-"+i);
            System.out.println("-----------------");
            System.out.print("Masukkan Panjang : ");
            arrTrls[i].panjang = retno.nextInt();
            System.out.print("Masukkan lebar : ");
            arrTrls[i].lebar = retno.nextInt();
            
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            
            arrTrls[i].luasTanah = arrTrls[i].luasTanah(arrTrls[i].panjang,arrTrls[i].lebar);
            System.out.println("Luas Tanah : "+i+" :"+arrTrls[i].luasTanah(arrTrls[i].panjang,arrTrls[i].lebar) );
           
        }
         int h = 0;
            for (int i = 1; i < n; i++) {
                 
                arrTrls[i].luasTanah = arrTrls[i].palingLuas(arrTrls[i-1].luasTanah,arrTrls[i].luasTanah);
                h = arrTrls[i].luasTanah;
            }
            int i;
            for ( i = 0; i >= 0; i++) {
               if(arrTrls[i].luasTanah == h){
                   break;
               }
            }
            System.out.println();
            System.out.println("Tanah terluas : Tanah "+i);
        }
}
