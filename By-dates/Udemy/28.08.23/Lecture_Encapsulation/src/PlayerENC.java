public class PlayerENC {
    private String name;
    private int healthPersantage;
    private String weapon;

    public PlayerENC(String name) {
        this(name,100,"Sword");
    }

    public PlayerENC(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;

        if(health<=0){
            this.healthPersantage = 1;
        }else if(health>100){
            this.healthPersantage = 100;
        }else{
            this.healthPersantage = health;
        }

    }

    public void loseHealth(int damage){
        healthPersantage = healthPersantage -damage;
        if(healthPersantage <=0){
            System.out.println("Player death");
        }
    }

    public int healthRemaining() {
        return healthPersantage;
    }

    public void restoreHealth(int extraHealth){
        healthPersantage = healthPersantage +extraHealth;
        if (healthPersantage >100){
            healthPersantage = 100;
            System.out.println("Player restored to 100%");
        }
    }
}
