package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Weapon implements IWeapon {
    private WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamageValueFromEnum() {
        return weaponType.getDamageValue();
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int attack(Enemy enemy, WeaponType weaponType) {
        return enemy.getHp() - weaponType.getDamageValue();
    }

}
