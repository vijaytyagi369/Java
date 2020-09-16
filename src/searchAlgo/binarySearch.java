package searchAlgo;

public class binarySearch {
    int binarySearchRe(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearchRe(arr, l, mid - 1, x);
            return binarySearchRe(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        binarySearch obj=new binarySearch();
        int[] arr={1,2,3,4,5,6,70};
        int indexOfEle= obj.binarySearchRe(arr,0,arr.length,4);
        System.out.println(indexOfEle);
    }


}
