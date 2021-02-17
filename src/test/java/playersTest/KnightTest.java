package playersTest;

import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Jeanne d'Arc", 100, 20);
    }

    @Test
    public void hasHp(){
        assertEquals(100, knight.getHp());
    }

    @Test
    public void hasArmourShinyness() {
        assertEquals(20, knight.getArmourShinyness());
    }
}
