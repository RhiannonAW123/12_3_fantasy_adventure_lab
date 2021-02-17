package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public int attack(){
    return this.damageValue;
    }
}
