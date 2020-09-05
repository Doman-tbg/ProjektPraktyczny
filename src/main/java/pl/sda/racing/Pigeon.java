package pl.sda.racing;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@Entity
public class Pigeon {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String owner;
}