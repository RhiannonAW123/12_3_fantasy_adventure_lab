package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Axe extends Weapon implements IWeapon {

    public Axe(WeaponType weaponType) {
        super(weaponType);
    }

    public int attack(Enemy enemy, WeaponType weaponType) {
        return enemy.getHp() - weaponType.getDamageValue();
    }
}

