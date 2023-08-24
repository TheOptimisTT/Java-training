public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber<10 || firstNumber>99 || secondNumber < 10 || secondNumber > 99)
            return false;

        for (int i=firstNumber; i>0;){
            for (int j = secondNumber; j>0;){
                if(i%10 == j %10)
                    return true;
                j/=10;
            }
            i/=10;
        }
        return false;
    }
    public static boolean hasSharedDigit2(int x,int y) {
        if((x > 99) || (x < 10) || (y > 99) || (y < 10))
            return false;
        else
            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));

    }
}
