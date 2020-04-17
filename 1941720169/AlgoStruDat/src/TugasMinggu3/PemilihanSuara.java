package TugasMinggu3;

public class PemilihanSuara {

    public String nama[];
    public int suara[], jmlKandidat, noUrut[], jmlSuara[];

    PemilihanSuara(int a, int b) {
        this.jmlKandidat = a;
        this.nama = new String[a];
        this.noUrut = new int[a];
        this.jmlSuara = new int[b];
        this.suara = new int[b];
    }

    public int[] hitungPemilihan(int n, int l, int r) {
        if (r == l) {
            int a[]={0};
            return a;
        } else {
            int setengah = jmlKandidat / 2;
            //int a = hitungPemilihan(n, l, setengah-1);
            
            for (int i = 1; i <= setengah; i++) {
                System.out.println("i: "+i+"no Urut: " + noUrut[i-1]+" N: "+n);
                if (n == noUrut[i-1]) {
                    jmlSuara[i-1]++;
                    suara[i]=0;
                }
            }
            for (int i = setengah; i < jmlKandidat; i++) {
                System.out.println("i: "+i+"nourut: " + noUrut[i-1]+" n: "+n);
                if (n == noUrut[i]) {
                    jmlSuara[i]++;
                    suara[i]=0;
                }
            }
            return jmlSuara;
        }
    }
}
