package players;

import enemies.Enemy;

public class Barbarian extends Fighter {
    private int strength;
    public Barbarian(String name, int hp, int strength) {
        super(name, hp);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
