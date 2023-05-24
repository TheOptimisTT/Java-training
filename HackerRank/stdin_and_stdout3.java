import java.util.Scanner;

public class stdin_and_stdout3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble(); //throws a \n after the scan...
        String s = scan.nextLine();
        s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
