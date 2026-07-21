package DSA_JAVA_Practice;

public class CountingSort {
    public static void countingSortArray(int[] arr){
        if (arr == null || arr.length == 0) return;
        
        int maxVal = arr[0];
        for(int val : arr){
            if(val > maxVal){ //  Fixed: Changed '<' to '>' to find the maximum
                maxVal = val;
            }
        }
        
        int[] count = new int[maxVal+1];
        for(int num : arr){
            count[num]++;
        }
        
        int index = 0;
        for(int i = 0; i <= maxVal; i++ ){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
    
    public static void main(String[] args){
        int[] arr = {2, 3, 0, 2, 3, 2};
        countingSortArray(arr);

        System.out.print("Sorted Array : ");
        for(int value : arr){
            System.out.print(value + " "); // Added space for clean formatting
        }
        System.out.println();
    }
}