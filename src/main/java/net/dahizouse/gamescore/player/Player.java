package net.dahizouse.gamescore.player;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.dahizouse.gamescore.model.Handedness;

@Entity
public class Player {
    
    @Id
    private long id;
    
    private String firstName;
    private String lastName;
    private int age;
    private Handedness handedness;
    
    
    public Player(Long id, String first, String last, Integer age, Handedness handedness) {
        this.id = id;
        this.firstName = first;
        this.lastName = last;
        this.age = age;
        this.handedness = handedness;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return (firstName+' '+lastName).trim();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, handedness);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player that = (Player)obj;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(age, that.age) &&
                Objects.equals(handedness, that.handedness);
    }
    
}
