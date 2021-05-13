package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Station extends Model {
    public String name;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Reading> readings = new ArrayList<Reading>();
    public String weatherCode;
    public double latestTemp;
    public double latestWind;
    public int latestPressure;
    public double latestFTemp;
    public double latestChill;
    public double latestwindSpeed;
    public String windCompass;

    public Station(String name) {
        this.name = name;
    }
}
