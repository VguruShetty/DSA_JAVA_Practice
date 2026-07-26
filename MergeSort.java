package DSA_JAVA_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
        int[] unsortedArr = {3, 7, 6, -10, 1, 23, 5, 55, -13};
        int[] sortedArr = MergeSorting(unsortedArr);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArr));
    }
     public static int[] MergeSorting(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] LeftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
        int[] sortedLeft = MergeSorting(LeftArr);
        int[] sortedRight = MergeSorting(rightArr);
        return merge(sortedLeft, sortedRight);
     }
     public static int[] merge(int[] leftArr, int[] rightArr){
        int[] result = new int[leftArr.length + rightArr.length];
        int i=0, j=0, k=0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] < rightArr[j]){
                result[k++] = leftArr[i++];
            }
            else{
                result[k++] = rightArr[j++];
            }
        }
        while(i < leftArr.length){
            result[k++] = leftArr[i++];
        }
        while(j < rightArr.length){
            result[k++] = rightArr[j++];
        }
        return result;
     }
 }