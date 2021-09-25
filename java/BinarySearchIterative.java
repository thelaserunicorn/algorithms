public class BinarySearch {
    int binarySearch(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid] > x){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
            return -1;
    }
    
    public static void main(String args[]){
        BinarySearch search = new BinarySearch();
        int arr[] = {10,20,34,50,60};
        int x = 34;
        int res = search.binarySearch(arr,x);
        System.out.println(res);
    }
}
