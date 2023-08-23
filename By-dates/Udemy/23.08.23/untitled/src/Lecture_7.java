public class Lecture_7 {

    public static void main(String[] args) {
        double amount = 100;
        double i;
//        for(i=2; i<=5;i++) {
//            System.out.println(amount + " at " + i
//                    + "% interest  = " + calculateInterest(amount, i));
//        }
        for(i=7.5;i<=10;i+=0.25){
            System.out.println(amount + " at " + i
                  + "% interest  = " + calculateInterest(amount, i));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
