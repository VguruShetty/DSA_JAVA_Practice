package DSA_JAVA_Practice;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {9, 2, 5, 7, 3};
        int n = arr.length;

        for(int i = 0; i < n -1; i ++){
            int minIndex = i;
            for(int j = i +1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            } 
            //Shifting value 
            // int minVal = arr[minIndex];
            // for(int k = minIndex; k >i; k--){
            //     arr[k] = arr[k-1];
            // }
            // arr[i] = minVal;
            //Swapping Value
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array : ");
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
