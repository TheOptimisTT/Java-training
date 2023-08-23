public class FifthClass {

    public static void main(String[] args) {

    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        long result = Math.round(kilometersPerHour/1.609);
        return result;
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour +
                "km/h = " + miles +
                " mi/h");
    }
}
