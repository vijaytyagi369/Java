package sortingAlgo;

public class bSort {
    public static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
     public static void bubbleSort(int[] array){
        boolean isSorted=false;
        int lastSorted=array.length-1;
        while (!isSorted){
            isSorted=true;
            for (int i = 0; i <lastSorted ; i++) {
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                    isSorted=false;
                }
            }
            lastSorted--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Array To Be Sorted ");
        int[] arr={5,4,3,2,1};
        bubbleSort(arr);
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
