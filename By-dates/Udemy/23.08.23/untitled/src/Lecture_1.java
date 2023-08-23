//method overload
public class Lecture_1 {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("tim", 10));
        System.out.println("New score is " + calculateScore(100));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+ score + " points");
        return score *100;
    }
    public static int calculateScore(int score){
        return calculateScore("Anonymous",score);
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

}
