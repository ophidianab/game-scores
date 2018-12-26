package net.dahizouse.gamescore.game;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ScheduledGame {
    
    @Id
    private Long id;
    
}
