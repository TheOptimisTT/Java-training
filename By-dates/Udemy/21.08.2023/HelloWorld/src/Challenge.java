public class Challenge {

    public static void main(String[] args) {
        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double result;

        result = (myFirstDouble+mySecondDouble)*100;
        System.out.println("Step 1: " + myFirstDouble);
        System.out.println("Step 2: " + mySecondDouble);
        System.out.println("Step 3: " + result);

        result %=40;
        System.out.println("Step 4: " + result);

        boolean isZero = (result == 0.0)? true:false;
        if (!isZero){
            System.out.println("Got some remainder");
        }
    }
}
