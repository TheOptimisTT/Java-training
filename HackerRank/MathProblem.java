import java.util.Scanner;

public class MathProblem {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (Math.pow(2,j) * b);
                System.out.printf(sum+" ");
            }
            sum=0;
            System.out.println();
        }
        in.close();
    }
}
