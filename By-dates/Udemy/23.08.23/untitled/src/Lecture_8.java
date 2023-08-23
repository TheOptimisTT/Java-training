public class Lecture_8 {

    public static void main(String[] args) {
        int counter=0;

        for(int i = 10; counter <3 && i<=50;i++) {
            System.out.println(i+" is " + (isPrime((i)) ? "" : "NOT ") + "a prime number");
            if(isPrime(i)){
                counter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber == 2);
        }
        for(int divisior = 2; divisior <= wholeNumber/2; divisior++){
            if(wholeNumber%divisior == 0){
                return false;
            }
        }
        return true;
    }
}
