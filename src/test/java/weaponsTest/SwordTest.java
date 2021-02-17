package weaponsTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Sword;
import weapons.WeaponType;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword;

    @Before
    public void before(){
        sword = new Sword(WeaponType.SWORD);
    }

    @Test
    public void hasDamageValue(){
        assertEquals(15, sword.getDamageValueFromEnum());
    }
}
