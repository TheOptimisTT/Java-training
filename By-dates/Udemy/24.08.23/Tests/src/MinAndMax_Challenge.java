import java.util.Scanner;

public class MinAndMax_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter an Integer number: ");
            String nextNumber = scanner.nextLine();
            if(nextNumber.equals("exit"))
                break;
            try {
                int number = Integer.parseInt(nextNumber);
                if (minNumber > number)
                    minNumber = number;
                if (maxNumber < number)
                    maxNumber = number;
            }catch(NumberFormatException nef){
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Min number is: "+minNumber);
        System.out.println("Max number is: "+maxNumber);
    }
}
