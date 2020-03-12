package pertemuan4;

/**
 *
 * @author khoirul
 */
public class contohBigO {
    public static void contohBigO(int[] angka){
        System.out.println("Pairs: ");
        int n=angka.length;
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; i++){
                System.out.println(angka[i]+"-"+angka[j]);
            }
        }     
        for (int i=0; i<n; i++){
            for (int j=0; j<n; i++){
                System.out.println(angka[i]+"-"+angka[j]);
            }
        }    
    }
}
