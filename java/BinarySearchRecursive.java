public class BinarySearchRecursive{
    int binarySearch(int arr[], int l, int r, int x){
        if(r>=l){
            int mid = l + (r-l)/2;

            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid] > x){
                binarySearch(arr, l, mid-1, x);
            }
            binarySearch(arr, mid+1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearchRecursive bsr = new BinarySearchRecursive();
        int arr[] = {10,20,35,50,60};
        int x = 40;
        int res = bsr.binarySearch(arr,0,arr.length-1,x);
        if(res == -1){
            System.out.println("Element not present in array");
        }
        else{
            System.out.println("Element present in index " + res);
        }
    }
}
