package com.learning_api.database.reason;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reason")
public class Reason {

    @Id
    @GeneratedValue
    public int id;

    public String name;
}
