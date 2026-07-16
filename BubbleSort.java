package DSA_JAVA_Practice;

public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {9,4,6,3,1};
        //int[] arr = {1,3,4,5,2};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            Boolean swapping = false; //use best for Best-case time complexity o(n) otherwise it is o(n^2)
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapping = true;
                }
            }
            //Best-case senario
            if(!swapping){
                break;
            }
        }

        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}