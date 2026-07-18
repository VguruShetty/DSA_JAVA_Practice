package DSA_JAVA_Practice;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {2,6,1,9,3};
        int n = arr.length;
        
        QuickSort(arr, 0, n-1);

        System.out.print("Sorting array : ");
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
    public static void QuickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }            
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
