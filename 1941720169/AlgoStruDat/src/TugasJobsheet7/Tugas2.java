package TugasJobsheet7;

public class Tugas2 {

    public int data[][];
    public int jumData;

    public Tugas2(int Data[][]) {
        data = new int[Data.length][Data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public int[] FindSeqSearch(int cari) {
        int posisi[] = {-1,-1};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == cari) {
                    posisi[0] = i;
                    posisi[1] = j;
                    break;
                }
            }
        }
        
        return posisi;
    }

    public void tampilData() {
        for (int i = 0; i < data.length; i++) {
            System.out.print("|");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+"\t|");
            }
            System.out.println("");
        } 
    }
}
