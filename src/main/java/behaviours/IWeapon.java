package behaviours;

import enemies.Enemy;
import weapons.Weapon;
import weapons.WeaponType;

public interface IWeapon {

    public int attack(Enemy enemy, WeaponType weaponType);

}
