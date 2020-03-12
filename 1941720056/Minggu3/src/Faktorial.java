public class Faktorial {
    public int nilai;                   
    
    public int faktorialBF(int n){
        int faktor = 1;                         //O(1)
        int i=1;                                //O(1)
        while(i<=n){                            //O(n)
            faktor = faktor * i;                //O(1)
            i++;  }                             //O(1)
        return faktor;                          //O(1)
    }
    public int faktorialDC(int n){
        if(n==1){
            return 1;                           //O(1)    
        }else{
            int faktor = n * faktorialDC(n-1);  //O(n)
            return faktor;                      //O(1) 
        }
    }
    
    // Maka banyaknya operasi   
    // = 1+1+(n*1*1)+1+1+(n*1)
    // = 2+n+2+n
    // = 4+2n operasi
    // Jadi Notasi Big O = O(n)+O(n)  
    //                   = 2*O(n) 
}
