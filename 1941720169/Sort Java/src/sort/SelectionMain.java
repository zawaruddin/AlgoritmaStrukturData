package sort;

public class SelectionMain {
    
    public static void main(String[] args) {
        int arr[] = {10,50,25,1,3};
        Selection sl = new Selection();
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        sl.Selection(arr);
    }
}
