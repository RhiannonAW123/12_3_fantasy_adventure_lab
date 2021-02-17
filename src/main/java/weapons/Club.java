package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Club extends Weapon implements IWeapon {

    public Club(WeaponType weaponType) {
        super(weaponType);
    }

    public int attack(Enemy enemy, WeaponType weaponType) {
        return enemy.getHp() - weaponType.getDamageValue();
    }
}
