public class Lecture_4 {
    public static void main(String[] args) {
        //Parsing String to an Integer!
        int currentYear = 2022;
        String userDateOFBirth = "1999";
        String balance  = "2.5";

        int dateOfBirth = Integer.parseInt(userDateOFBirth); //*********
        double money = Double.parseDouble(balance);

        System.out.println("Age = " + (currentYear - dateOfBirth) + " " + money);
    }

}
