package Tugas;

public class fibonanci {

    public int n;
    
  public void bruteForce(int a){
       int x=1,y=0;                                 //O(1)
       for (int i = 0; i <=a; i++) {                //O(n)
           System.out.print(n+" ");                 //O(1)
           n=y+x;                                   //O(1)
           x=y;                                     //O(1)
           y=n;                                     //O(1)
       }
    }
    
    public void dc(int a){
        int x=0;                                    //O(1)
        for (int i = 0; i <n; i++) {                //O(n)
            x =+ DivideConquer(i);                  //O(1)
            System.out.print(DivideConquer(i)+" "); //O(1)
        }
    }
    public int DivideConquer(int a){
        int x=0;
        if(a<=0 || a<=1 ){
            return a;                                   //O(1)
        }else {
            return DivideConquer(a-2)+DivideConquer(a-1);//O(2^n)
        }
    }
    // Maka Banyak Operasi 
    // = 1+(n*1*1*1*1)+1+(n*1*1)+1+(2^n)
    // = 1+n+1+n+1+(2^n)
    // = 3+2n+2^n operasi
    // Maka untuk Notasi Big O 
    // = O(2^n)
    
       }
    

