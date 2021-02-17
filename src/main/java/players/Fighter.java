package players;

import behaviours.IWeapon;
import enemies.Enemy;
import weapons.Weapon;
import weapons.WeaponType;

public abstract class Fighter extends Player implements IWeapon {
    public Fighter(String name, int hp) {
        super(name, hp);
    }

    public int attack(Enemy enemy, WeaponType weaponType) {
        return enemy.getHp() - weaponType.getDamageValue();
    }

    public void swapWeapon(Weapon weapon){
    }
}
