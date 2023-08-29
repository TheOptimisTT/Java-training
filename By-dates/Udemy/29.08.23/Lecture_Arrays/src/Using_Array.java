import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Using_Array {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray =  new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(forthArray));
        Arrays.sort(forthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(forthArray));
        System.out.println();
        System.out.println();

        String[] sArray = {"Able","Jane","Mark","Ralph","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("Found Mark in a list");
        }
        System.out.println();

        int[] s1 = {1,2,3,4,5};
        //int[] s2 = {1,2,3,4,5};//equal
        //int[] s2 = {5,2,3,4,1};/.not
        int[] s2 = {1,2,3,4,5,6};//not
        if(Arrays.equals(s1,s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
    public static int[] getRandomArray(int len){
        Random random  = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100); //0-99
        }
        return newInt;
    }
}
