package net.dahizouse.gamescore.team;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeagueTeam {

    @Id
    private Long   id;

    private String teamName;
    private Long   league;
    private Long   lineup;

    public LeagueTeam(long id, String teamName, long league, long lineup) {
        this.id = id;
        this.teamName = teamName;
        this.league = league;
        this.lineup = lineup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getLeague() {
        return league;
    }

    public void setLeague(Long league) {
        this.league = league;
    }

    public Long getLineup() {
        return lineup;
    }

    public void setLineup(Long lineup) {
        this.lineup = lineup;
    }

    @Override
    public String toString() {
        return String.format("LeagueTeam(%s)", id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teamName, league, lineup);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }


}
