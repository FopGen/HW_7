package org.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectModel {

    private Integer id;
    private Integer clientId;
    private Date startDate;
    private Date finishDate;

    public ProjectModel(Integer id, Integer clientId, Date startDate, Date finishDate) {
        this.id = id;
        this.clientId = clientId;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public Integer getId() {
        return id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public java.sql.Date getStartDate() {
        return (java.sql.Date) startDate;
    }

    public java.sql.Date getFinishDate() {
        return (java.sql.Date) finishDate;
    }
}
