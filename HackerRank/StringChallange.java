import java.util.Scanner;

public class StringChallange {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            String cap = A.substring(0, 1).toUpperCase() + A.substring(1);
            String cap2 = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(A.length()+B.length());
            for (int i = 0; i < A.length();) {
                if(A.charAt(i)>B.charAt(i)) {
                    System.out.println("Yes");
                    break;
                }else if (A.charAt(i)==B.charAt(i)){
                    i++;
                    if(i == A.length())
                        System.out.println("No");
                } else{
                    System.out.println("No");
                    break;
                }
            }
            System.out.println(cap + " " + cap2);
        }
    }

