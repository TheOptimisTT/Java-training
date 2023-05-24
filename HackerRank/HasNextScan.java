import java.util.Scanner;

public class HasNextScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines=1;
        while(scan.hasNext()){
            System.out.println(lines+" "+scan.nextLine());
            lines++;
        }
    }
}
