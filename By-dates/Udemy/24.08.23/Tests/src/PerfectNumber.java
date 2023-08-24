public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));//true
        System.out.println(isPerfectNumber(28));//true
        System.out.println(isPerfectNumber(5)); //false
        System.out.println(isPerfectNumber(-1)); //false
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum = 0;
        //int holder = number;

        for(int i=1;i!=number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;
    }
}
