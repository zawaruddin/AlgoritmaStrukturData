
public class Tanah {
    public int panjang;
    public int lebar;
    
    Tanah(){
        
    }
    Tanah (int pj,int lb){
        panjang = pj ;
        lebar = lb;
    }
    
    int luasTanah(int pj,int lb){
        return pj * lb;
    }
}
