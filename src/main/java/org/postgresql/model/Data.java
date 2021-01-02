package org.postgresql.model;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(appliesTo="data")
public class Data {
    private Long id;
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }
}
