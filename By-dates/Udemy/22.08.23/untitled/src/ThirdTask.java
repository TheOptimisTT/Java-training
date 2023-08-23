public class ThirdTask {

    public static void main(String[] args) {
        String p1Name = "John"; int p1score = 1500;
        String p2Name = "Jack"; int p2score = 999;
        String p3Name = "Ivan"; int p3score = 499;
        String p4Name = "Patric"; int p4score = 99;
        String p5Name = "Nami"; int p5score = -25;

        displayHighScorePosition(p1Name,calculateHighScorePosition(p1score));
        displayHighScorePosition(p2Name,calculateHighScorePosition(p2score));
        displayHighScorePosition(p3Name,calculateHighScorePosition(p3score));
        displayHighScorePosition(p4Name,calculateHighScorePosition(p4score));
        displayHighScorePosition(p5Name,calculateHighScorePosition(p5score));
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName+ " managed to get into "+
                           playersPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        else
            return 4;
    }
}
