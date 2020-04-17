package sort;

public class SelectionMain {
    
    public static void main(String[] args) {
        int arr[] = {6,5,3,1,8 ,7 , 2 ,4};
        Selection sl = new Selection();
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        sl.Selection(arr);
    }
}
