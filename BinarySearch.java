public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,3,6,9,13,59};
        int targetVal = 13;
        int result = BinarySearching(arr, targetVal);
        if(result != -1){
            System.out.println("Value " + targetVal + " found at index " + result);
        }else{
            System.out.println("Value not found in array");
        }
    }
    public static int BinarySearching(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}
