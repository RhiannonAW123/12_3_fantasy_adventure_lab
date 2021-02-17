package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {
    private int damageValue;

    public Club(int damageValue) {
        this.damageValue = damageValue;
    }

    public int attack(){
        return damageValue;
    }
}
