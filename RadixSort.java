package DSA_JAVA_Practice;

public class RadixSort {
    public static void main(String[] args){
        int[] arr = {170, 45, 75, 90, 802, 24, 6, 66};
        System.out.print("Original array : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        
        int[][] redixArray = new int[10][arr.length];
        int[] counts = new int[10];
        int maxVal = findMax(arr);
        int exp = 1;
        while(maxVal/exp > 0){
            for(int val : arr){
                int redixIndex = (val / exp) % 10;
                redixArray[redixIndex][counts[redixIndex]] = val;
                counts[redixIndex]++;
            }
            int pos = 0;
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < counts[i]; j++){
                    arr[pos] = redixArray[i][j];
                    pos++;                    
                }
                counts[i] = 0;
            }
            exp *=10;
        }

        System.out.print("After sorted array : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static int findMax(int[] arr){
        int maxVal = arr[0];
        for(int val : arr){
            if(val > maxVal){
                maxVal = val;
            }
        }
        return maxVal;
    }
}
