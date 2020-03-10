package sort;

public class Selection { 

    public int[] Selection(int[] list) {
        int minIndex, minValue;
        int k = list.length;
        for (int i = 0; i < k - 1; i++) {
            minIndex = i;
            minValue = list[i];
            for (int j = i + 1; j < k; j++) {
                if (list[j] < minValue) {
                    minIndex = j;
                    minValue = list[j];
                    swap(i, minIndex, list);
                    print(list);
                }
            }
        }
        return list;
    }

    public void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void print(int[] arr){
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
