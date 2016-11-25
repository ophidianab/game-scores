package net.dahizouse.gamescore.lineup;

import static org.junit.Assert.assertEquals;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

public class LineupTest {
    
    @Test 
    public void testToString() {
        Lineup lineup = new Lineup(17L, 9L, 8L, 7L, 6L);
        
        String expected = "Lineup(17)";
        String actual = lineup.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Lineup.class).suppress(Warning.NONFINAL_FIELDS, Warning.STRICT_INHERITANCE).verify();
    }
    
}
