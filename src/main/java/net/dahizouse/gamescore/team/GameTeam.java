package net.dahizouse.gamescore.team;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class GameTeam {
    
    @Id
    @NotNull
    private Long id;
    
    @Min(0)
    private Long game; //Game::id
    
    @Min(0)
    private Long leagueTeam; //LeagueTeam::id
    
    @Min(0)
    private Long lineup; //Lineup::id
    
    public GameTeam(long id, long leagueTeam, long game, long lineup) {
        this.id = id;
        this.leagueTeam = leagueTeam;
        this.game = game;
        this.lineup = lineup;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getGame() {
        return game;
    }
    
    public void setGame(Long game) {
        this.game = game;
    }
    
    public Long getLeagueTeam() {
        return leagueTeam;
    }
    
    public void setLeagueTeam(Long leagueTeam) {
        this.leagueTeam = leagueTeam;
    }
    
    public Long getLineup() {
        return lineup;
    }
    
    public void setLineup(Long lineup) {
        this.lineup = lineup;
    }
    
    @Override
    public String toString() {
        return String.format("GameTeam(%s)", id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, game, leagueTeam, lineup);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameTeam)) {
            return false;
        }
        GameTeam that = (GameTeam)obj;
        return Objects.equals(id, that.id) &&
                Objects.equals(game, that.game) &&
                Objects.equals(leagueTeam, that.leagueTeam) &&
                Objects.equals(lineup, that.lineup);
        
    }
    
}
