import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try{
                int x = Integer.parseInt(nextNumber);
                counter++;
                sum += x;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The SUM of the five numbers is: " + sum);
    }
}
