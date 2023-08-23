public class Lecture_5 {
    public static void main(String[] args) {

        char coded = 'A';
        System.out.println(switchChallenge(coded));
        System.out.println(switchChallenge('Z'));
        System.out.println(switchChallenge('1'));
        System.out.println(switchChallenge('z'));
    }
    public static String switchChallenge(char alphabet) {
        return switch (alphabet) {
            case 'A' -> alphabet + " is Able";
            case 'B' -> alphabet + " is Baker";
            case 'C' -> alphabet + " is Charlie";
            case 'D' -> alphabet + " is Dog";
            case 'E' -> alphabet + " is Easy";

            case 'F' -> alphabet + " is Fox";
            case 'G' -> alphabet + " is George";
            case 'H' -> alphabet + " is How";
            case 'I' -> alphabet + " is Item";
            case 'J' -> alphabet + " is Jim";

            case 'K' -> alphabet + " is King";
            case 'L' -> alphabet + " is Love";
            case 'M' -> alphabet + " is Mike";
            case 'N' -> alphabet + " is Nan";
            case 'O' -> alphabet + " is Oboe";

            case 'P' -> alphabet + " is Peter";
            case 'Q' -> alphabet + " is Queen";
            case 'R' -> alphabet + " is Roger";
            case 'S' -> alphabet + " is Sugar";
            case 'T' -> alphabet + " is Tare";

            case 'U' -> alphabet + " is Uncle";
            case 'V' -> alphabet + " is Victor";
            case 'W' -> alphabet + " is William";
            case 'X' -> alphabet + " is X-ray";
            case 'Y' -> alphabet + " is Yoke";
            case 'Z' -> alphabet + " is Zebra";
            default -> "Letter " + alphabet + " not found!";

        };
    }
}
