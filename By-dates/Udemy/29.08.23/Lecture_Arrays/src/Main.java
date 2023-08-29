import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray =  new int[10];
        myIntArray[5]=50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println(arrayLength);
        System.out.println("last = " + firstTen[arrayLength-1]);

        int[] newArray;
        //newArray = new int[]{5,4,3,2,1};
        newArray = new int[5]; // all 0
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length-i;
        }
        for (int j : newArray) {
            System.out.printf(j + " ");
        }

        System.out.println(Arrays.toString(newArray));
    }
}
