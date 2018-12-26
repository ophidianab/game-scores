package net.dahizouse.gamescore.team;

import static org.junit.Assert.assertEquals;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

public class GameTeamTest {
    
    @Test 
    public void testToString() {
        GameTeam team = new GameTeam(17L, 8L, 6L, 7L);
        
        String expected = "GameTeam(17)";
        String actual = team.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(GameTeam.class).suppress(Warning.NONFINAL_FIELDS, Warning.STRICT_INHERITANCE).verify();
    }
        
}
