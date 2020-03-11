package minggu4;

public class Fibonacci {
    public int angka;
    
    public void hitungFiboBF(){
        int a=0,b=1;
        for(int i=0;i<angka;i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;
        }
    }
    public int hitungFiboDC(int n){
        if(n<=0 || n<=1){
            return n;
        }else{
            return hitungFiboDC(n-2)+hitungFiboDC(n-1);
        }
    }
}
