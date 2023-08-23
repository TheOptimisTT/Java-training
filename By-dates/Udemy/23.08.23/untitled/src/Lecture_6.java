public class Lecture_6 {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(0);

        printDayOfWeek(-2);
    }
    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println("The variable was "+
                day + " and the String is "+
                dayOfTheWeek);
    }
}
