package enemies;

import weapons.WeaponType;

public abstract class Enemy {

    private int Hp;

    public Enemy(int Hp){
        this.Hp = Hp;
    }

    public int getHp(){
        return this.Hp;
    }

    public void takeDamage(WeaponType weaponType){
        this.Hp -= weaponType.getDamageValue();
    }
}
