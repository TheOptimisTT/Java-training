public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello");

        boolean isAlien = false;
        if(!isAlien)
            System.out.println("It is not an Alien!");
        else
            System.out.println("It is an Alien!");

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second and less then 100");
        }

        if((topScore>90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

    }
}
