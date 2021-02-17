package playersTest;

import org.junit.Before;
import org.junit.Test;
import players.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 100, 10);
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
}
