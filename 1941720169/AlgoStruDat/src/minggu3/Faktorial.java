package minggu3;

public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1, i=1;
        int total=0;
//        for (int i = 1; i <= n; i++) {
//            fakto = fakto * i;
//        }
//        do{
//            fakto = fakto*i;
//            i++;
//        }while(i<=n);
        while(i<=n){
            fakto = fakto*i;
            //total=total+fakto;
            i++;
        }
        System.out.println(total);
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
        
    }

}
