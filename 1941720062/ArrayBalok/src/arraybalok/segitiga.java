package arraybalok;

/**
 *
 * @author Faris Ikhlasul H
 */
public class segitiga {
    public int alas;
    public int tinggi;
    public int b;
    public int c;
    
    public segitiga(int a , int t,int j,int k){
        alas = a;
        tinggi = t;
        b = j;
        c = k;
        
    }
    public double HitungLuas(){
        return 0.5*alas*tinggi;
    }
    public int HitungKeliling(){
        return alas+b+c;
    }
}
