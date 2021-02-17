package playersTest;


import org.junit.Before;
import org.junit.Test;
import players.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;


    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", 10,19);
    }

    @Test
    public void getBeardLength(){
        assertEquals(19, dwarf.getBeardLength());
    }
}
