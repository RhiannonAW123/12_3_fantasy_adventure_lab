package enemies;

public abstract class Enemy {

    private int Hp;

    public Enemy(int Hp){
        this.Hp = Hp;
    }

    public int getHp(){
        return this.Hp;
    }

    public int takeDamage(){
        return this.Hp;
    }
}
