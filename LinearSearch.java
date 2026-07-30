
import java.lang.*;;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {3, 7,2,9,5};
        int targetVal = 9;
        int result = LinearSearching(arr, targetVal);
        if(result != -1){
            System.out.println("Value " + targetVal + " Found at index "+ result);
        }else{
            System.out.println("Value " + targetVal + " not found");
        }
    }   
    public static int LinearSearching(int[] arr, int targetVal){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == targetVal){
                return i;
            }
        }
        return -1;
    }
}
