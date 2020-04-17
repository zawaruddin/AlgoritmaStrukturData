
public class Tanah {
    public int panjang, lebar, jumlah;
    public Tanah() {

    }

    public Tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }
    int luasTanah(){
        return panjang*lebar;
    }
}
