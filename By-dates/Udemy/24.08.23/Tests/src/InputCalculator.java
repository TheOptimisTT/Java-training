import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0,counter =0,number;

        while (true){
            String nextLine = scanner.nextLine();
            try{
                number = Integer.parseInt(nextLine);
                sum += number;
                counter++;
            }catch (NumberFormatException exs){
                break;
            }
        }
        int avg =(int) Math.round(sum/counter);
        if(counter!=0)
            System.out.println("SUM = " + (int) sum + " AVG = " + avg );
        else
            System.out.println("SUM = " + (int)sum + " AVG = " + (int)sum);
    }
}
