import java.util.Arrays;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        int[] unsortedArr = intRandom(10);
        System.out.println(Arrays.toString(unsortedArr));
        Arrays.sort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));
        System.out.println(Arrays.toString(sort(unsortedArr)));
    }
    public static int[] intRandom(int size){
        Random random = new Random();
        int[] myArray = new int[size];
        for (int i=0;i<size;i++){
            myArray[i]= random.nextInt(100);
        }
        return myArray;
    }
    public static int[] sort(int[] arr){
        int[] sortedArr = Arrays.copyOf(arr,arr.length);

        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[arr.length-1-i];
        }
        return sortedArr;
    }
}
