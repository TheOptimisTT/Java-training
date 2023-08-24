public class NumberToWords {
    public static void main(String[] args) {

//        System.out.println(getDigitCount(0)); //1
//        System.out.println(getDigitCount(123)); // 3
//        System.out.println(getDigitCount(-12)); //-1
//        System.out.println(getDigitCount(5200)); //4
//
//        System.out.println(reverse(-121)); //-121
//        System.out.println(reverse(1212)); //2121
//        System.out.println(reverse(1234)); //4321
//        System.out.println(reverse(100)); //1

        numberToWords(900); //Nine Zero Zero
        numberToWords(1010); //One Zero One Zero
        numberToWords(1000); //One Zero Zero Zero
        numberToWords(4); //Four


//*Not working as intended needs a fix @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



    }
    public static void numberToWords(int number){
        String finalAnswer = "";
        number = reverse(number);
        if(number<0)
            System.out.println( "Invalid Value");
        while(number>9){
            finalAnswer += (checker(number%10) + " ");
            number/=10;
        }
        finalAnswer += checker(number%10);
        System.out.println(finalAnswer);
    }
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        int count=1;
        while(number>9){
            number/=10;
            count++;
        }
        return count;
    }
    public static int reverse(int number){
        boolean isNegative = false;
        int reverse=0;

        if(number<0){
            number*=-1;
            isNegative = true;
        }

        while (number>=9){
            int lastDigit = number % 10;
            reverse = (reverse*10) + lastDigit;
            number/=10;
        }
        reverse = (reverse*10) + number%10;
        if(isNegative){
            reverse *=-1 ;
        }
        return reverse;
    }
    public static String checker(int number){
        String word="";
        switch (number){
            case 1:
                word="One";
                break;
            case 2:
                word="Two";
                break;
            case 3:
                word="Three";
                break;
            case 4:
                word="Four";
                break;
            case 5:
                word="Five";
                break;
            case 6:
                word="Six";
                break;
            case 7:
                word="Seven";
                break;
            case 8:
                word="Eight";
                break;
            case 9:
                word="Nine";
                break;
            case 0:
                word="Zero";
                break;

        }
        return word;
    }
}
