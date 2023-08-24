public class Lecture_2 {

    public static void main(String[] args) {
        int i = 5;
        int countEven=0;
        int countOdd=0;
        while(i<=20){

            if(countEven==5)
                break;
            if(isEvenNumber(i)) {
                countEven++;
            }else{
                countOdd++;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Number of Even Numbers: " + countEven);
        System.out.println("Number of ODD Numbers: " + countOdd);
    }

    public static boolean isEvenNumber(int parameter){
        return parameter%2==0;
    }
}
