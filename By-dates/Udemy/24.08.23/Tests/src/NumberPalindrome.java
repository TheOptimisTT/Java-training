public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(201));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(-201));
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(0));
    }
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int i = number;

        if(i<=0) {
            i *= -1;
        }

        while(i>=1) {
            int lastDigit = i % 10;
            reverse = (reverse*10) + lastDigit;
            i/=10;
        }
        System.out.println(reverse);

        return Math.abs(reverse) == Math.abs(number);
    }
}
