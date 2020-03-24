
package TugasPertemuan7;

public class Tugas2 {
    public int[][]data;
    public  int jumdata;
    
    
    public Tugas2(int [][]Data,int jmldata){
        jumdata=jmldata;
        data=new int [Data.length][Data[0].length];
        for (int i = 0; i <data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j]=Data[i][j];
            }
        }
    }
    public int[] FindSeqSearch(int cari){
        int posisi[] = {-1,-1};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==cari){
                    posisi[0]=i;
                    posisi[1]=j;
                }
            }
        }
        return posisi;
    }
    
    public void tampilData(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    public void tampilPosisi(int x,int []pos){
        if (pos[0]!=-1 && pos[1]!=-1){
            System.out.println("data "+x+" ditemukan pada baris ke ["+(pos[0]+1)+"] kolom ke["+(pos[1]+1+"]"));
        }
        else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}
