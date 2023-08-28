public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.health = 20;
//        player.name= "Tim";
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Healht= "+player.health);
//
//        player.loseHealth(11);
//        System.out.println("remaining health= "+ player.health);
        PlayerENC tim = new PlayerENC("Tim");
        System.out.println("Health is " + tim.healthRemaining());
        PlayerENC john = new PlayerENC("John",50,"Bow");
        System.out.println("Health is " + john.healthRemaining());
    }
}
