package playersTest;

import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Club;
import weapons.Weapon;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Orc orc;
    Weapon club;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 100, 10);
        orc = new Orc(20);
        club = new Club(WeaponType.CLUB);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canChangeName(){
        barbarian.setName("Matt");
        assertEquals("Matt", barbarian.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, barbarian.getHp());
    }

    @Test
    public void hasStrength(){
        assertEquals(10, barbarian.getStrength());
    }

    @Test
    public void canAttack(){
        barbarian.attack(orc, WeaponType.CLUB);
        orc.takeDamage(WeaponType.CLUB);
        assertEquals(15, orc.getHp());
    }
}
