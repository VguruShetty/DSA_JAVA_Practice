package DSA_JAVA_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
        int[] unsortedArr = {5, 10, 90, 50, 80, 2, 1, 3};
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
        System.out.print("1st loop array : ");
        for(int l : result){
            System.out.print(l + " ");
        }
        while(i < leftArr.length){
            result[k++] = leftArr[i++];
        }
        System.out.print("2nd loop array : ");
        for(int l : result){
            System.out.print(l + " ");
        }
        while(j < rightArr.length){
            result[k++] = rightArr[j++];
        }
        System.out.print("3rd loop array : ");
        for(int l : result){
            System.out.print(l + " ");
        }
        return result;
     }
 }