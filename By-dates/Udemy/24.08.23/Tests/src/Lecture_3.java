public class Lecture_3 {

    public static void main(String[] args) {

        System.out.println(SumDigit(123));
        System.out.println(SumDigit(1));
        System.out.println(SumDigit(-1 ));
        System.out.println(SumDigit(0));
        System.out.println(SumDigit(102030));
    }

    public static int SumDigit(int number){
        if(number<=0)
            return -1;

        int sum = 0;
        while(number>=1){
            sum += number % 10;
            number /=10;
        }
        return sum;
    }
}
