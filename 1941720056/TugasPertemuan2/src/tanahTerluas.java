public class tanahTerluas {
    public int luasTanah;
    public int panjang;
    public int lebar;
    
    tanahTerluas(){
        
    }
    
    tanahTerluas(int lt,int pj, int lb){
        luasTanah = lt;
        panjang = pj ;
        lebar = lb;
    }
    
    int luasTanah(int pj,int lb){
        int luas = pj * lb;
        return luas;
    }
    
    int palingLuas(int x,int y){
     int terluas;
      if (x>y){
          terluas = x;
      }else {
          terluas = y;
      }
    return terluas;
    }

    
}