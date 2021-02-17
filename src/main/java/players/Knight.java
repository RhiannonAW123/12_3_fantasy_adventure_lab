package players;

public class Knight extends Fighter {

    private int armourShinyness;

    public Knight(String name, int hp, int armourShinyness) {
        super(name, hp);
        this.armourShinyness = armourShinyness;
    }

    public int getArmourShinyness() {
        return this.armourShinyness;
    }

    public void setArmourShinyness(int newArmourShinyness) {
        this.armourShinyness = newArmourShinyness;
    }
}
