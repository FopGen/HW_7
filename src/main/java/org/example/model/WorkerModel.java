package org.example.model;

import org.example.Level;
import java.util.Date;

public class WorkerModel {
    private Integer id;
    private String name;
    private Date birthday;
    private Level level;
    private Integer salary;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public java.sql.Date getBirthday() {
        return (java.sql.Date) birthday;
    }


    public Level getLevel() {
        return level;
    }

    public Integer getSalary() {
        return salary;
    }

    public WorkerModel(Integer id, String name, Date birthday, Level level, Integer salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.level = level;
        this.salary = salary;
    }
}

