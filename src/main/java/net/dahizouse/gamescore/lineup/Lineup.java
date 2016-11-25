package net.dahizouse.gamescore.lineup;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Lineup {

    @Id
    @NotNull
    private Long id;
    
    @Min(0)
    private Long skip; //Player::id
    
    @Min(0)
    private Long vice; //Player::id
    
    @Min(0)
    private Long second; //Player::id
    
    @Min(0)
    private Long lead; //Player::id
    
    public Lineup(long id, long skip, long vice, long second, long lead) {
        this.id = id;
        this.skip = skip;
        this.vice = vice;
        this.second = second;
        this.lead = lead;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getSkip() {
        return skip;
    }
    
    public void setSkip(Long skip) {
        this.skip = skip;
    }
    
    public Long getVice() {
        return vice;
    }
    
    public void setVice(Long vice) {
        this.vice = vice;
    }
    
    public Long getSecond() {
        return second;
    }
    
    public void setSecond(Long second) {
        this.second = second;
    }
    
    public Long getLead() {
        return lead;
    }
    
    public void setLead(Long lead) {
        this.lead = lead;
    }
    
    @Override
    public String toString() {
        return String.format("Lineup(%s)", id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, skip, vice, second, lead);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lineup)) {
            return false;
        }
        Lineup that = (Lineup)obj;
        return Objects.equals(id, that.id) &&
                Objects.equals(skip, that.skip) &&
                Objects.equals(vice, that.vice) &&
                Objects.equals(second, that.second) &&
                Objects.equals(lead, that.lead);
    }
}
