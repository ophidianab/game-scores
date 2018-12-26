package net.dahizouse.gamescore.game;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class GameBoxScore {

    @Id
    private Long id;

    private Long scheduledGame;  //ScheduledGame::id
    private Long yellowTeam;  //GameTeam::id
    private Long redTeam;  //GameTeam::id

}
