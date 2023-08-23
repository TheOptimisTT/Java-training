import java.util.Scanner;

public class mySecondTask {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();

            int aLenght = A.length();
            int bLenght = B.length();

            String greater = A.compareTo(B) > 0 ? "Yes" : "No";

            String aCap = A.substring(0, 1).toUpperCase() + A.substring(1);
            String bCap = B.substring(0, 1).toUpperCase() + B.substring(1);

            System.out.println(aLenght + bLenght);
            System.out.println(greater);
            System.out.printf("%s %s", aCap, bCap);

    }
}
