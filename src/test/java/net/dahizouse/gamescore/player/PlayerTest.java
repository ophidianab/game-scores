package net.dahizouse.gamescore.player;

import static org.junit.Assert.assertEquals;
import net.dahizouse.gamescore.model.Handedness;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void testToString() {
        Player sample = new Player(1L, "john", "wayne", 21, Handedness.Right);
        
        String expected = "john wayne";
        String actual = sample.toString();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Player.class).suppress(Warning.NONFINAL_FIELDS, Warning.STRICT_INHERITANCE).verify();
    }
}
