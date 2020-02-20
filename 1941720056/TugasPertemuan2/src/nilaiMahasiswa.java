public class nilaiMahasiswa {
    public int nilai1;
    public int nilai2;
    
    nilaiMahasiswa(){
    }
    
    nilaiMahasiswa(int n1,int n2){
        nilai1 = n1;
        nilai2 = n2;
    }
    
    int nilaiTerbaik(int n1, int n2){
        int terbaik;
        if (n1>n2){
            terbaik = n1;
        }else {
            terbaik = n2;
        }
        return terbaik;
    }
}
