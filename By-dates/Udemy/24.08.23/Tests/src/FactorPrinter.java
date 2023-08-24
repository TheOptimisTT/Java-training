public class FactorPrinter {
    public static void main(String[] args) {
        //System.out.println(printFactors(6));
    }
    public static void printFactors(int number){
        if(number<0) {
            System.out.println("Invalid Value");
            return;
        }
        int i=1;
        String result = "";
        while (i!=number){
            if(number%i==0){
                result += " " + i;
            }
            i++;
        }
        System.out.println(result + " " + number);
    }
}
