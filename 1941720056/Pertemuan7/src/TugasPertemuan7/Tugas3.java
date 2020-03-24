package TugasPertemuan7;

public class Tugas3 {
    public int [] data;
    public int jumdata;
    public int terbesar;
   Tugas3 (int [] Data, int jmlData){
        jumdata=jmlData;
        data = new int [jmlData];
        for (int i = 0; i < jumdata; i++) {
            data[i] = Data[i];
        }
    }
    
    public int findData(int cari,int left,int right){
        int  mid;
        if(right>=left){
            mid = (left+right)/2;
            if(data[mid]==cari){
                terbesar = data[mid];
                return mid;
            }else if (data[mid]<cari){
                return findData(cari,left,mid-1);
            }else{
                return findData(data[mid],mid+1,right);
            }
        }
        return-1;
    }
    
    
    public void tampildata(){
        for (int i = 0; i < jumdata; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
    
    public void tampilposisi(int x , int pos ){
        if (pos != -1){
            System.out.println("Data: "+x+" diemukan pada indeks ke-"+pos);
        }else{
            System.out.println("Data: "+x+ " tidak ditemukan");
        }
    }
    
    public void terbesarTerkecil(int data[]){
        for (int i = 1; i <jumdata; i++) {
            int temp;
            temp = data[i];
            int j=i;
            while((j>0)&&(data[j-1]>temp)){
                data[j]=data[j-1];
                j--;
            }
            data[j]=temp;
        }
    }
}
