package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Sword extends Weapon implements IWeapon {

    public Sword(WeaponType weaponType) {
        super(weaponType);
    }

    public int attack(Enemy enemy, WeaponType weaponType) {
        return enemy.getHp() - weaponType.getDamageValue();
    }
}
