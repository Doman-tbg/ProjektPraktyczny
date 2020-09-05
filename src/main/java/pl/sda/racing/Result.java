package pl.sda.racing;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Duration;
import java.time.Period;

@Entity
@Data
public class Result {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Pigeon pigeon;
    @ManyToOne
    private Race race;
    private Duration time;
}