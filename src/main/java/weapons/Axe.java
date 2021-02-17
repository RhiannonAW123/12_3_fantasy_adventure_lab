package weapons;

import behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damageValue;

    public Axe(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return this.damageValue;
    }

    public int attack() {
        return damageValue;
    }
}

