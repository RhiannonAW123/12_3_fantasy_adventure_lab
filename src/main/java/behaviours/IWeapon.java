package behaviours;

import enemies.Enemy;
import weapons.WeaponType;

public interface IWeapon {

    public int attack(Enemy enemy, WeaponType weaponType);

}
