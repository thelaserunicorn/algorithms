public class SelectionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int A[] = {25,67,32,50,90,102,0,18,47,-20,-30};
        obj.sort(A);
        System.out.println("Sorted Array:");
        obj.printArray(A);
    }
}


