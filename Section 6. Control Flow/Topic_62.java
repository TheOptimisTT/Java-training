public class Topic_62 {
    public static void main(String[] args) {

        int counter =0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i%3==0 && i%5==0){
                sum+=i;
                counter++;
                System.out.println(i);
            }
            if(counter==5)
                break;
        }

        System.out.println("Total sum of numbers: "+sum);
    }
}


