package DSA_JAVA_Practice;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {2,5,3,8,1};
        int n = arr.length;

        for(int i = 1; i < n; i ++){
            int index = i;
            int currentval = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentval) {
                arr[j+1] = arr[j];
                index = j;
                j--;
            }
            arr[index] = currentval;
        }
        System.out.print("Sorting Array : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
