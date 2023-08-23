public class Lecture_4 {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("Value was " + value);
        } else if (value == 2) {
            System.out.println("Value was " + value);
        }else {
            System.out.println("Value was not 1 or 2");
        }
        switch (value) {
            case 1 -> System.out.println("Value was " + 1);
            case 2 -> System.out.println("Value was " + 2);
            case 3, 4, 5 -> {
                System.out.println("Value was " + 3 + 4 + 5);
                System.out.println("It was actually " + value);
            }
            default -> System.out.println("Value was not 1 or 2");
        }
    }
}
