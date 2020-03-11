package sort;

public class Bubble {

    public int arr[] = {22,33,45,17,33};

    public void bubble(int arr[]) {
        int n = arr.length;
        int k;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                k = j + 1;
                if (arr[j] > arr[k]) {
                    swap(j, k, arr);
                }
            }
            print(arr);
        }
    }

    public void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
