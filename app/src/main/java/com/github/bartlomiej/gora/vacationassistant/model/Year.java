package com.github.bartlomiej.gora.vacationassistant.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = User.class,
        childColumns = "userId", parentColumns = "id")})
public class Year {

    @PrimaryKey
    private String year;
    private Integer startCount;
    private Integer startOnDemand;
    private Integer left;
    private Integer leftOnDemand;
    private Integer userId;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getStartCount() {
        return startCount;
    }

    public void setStartCount(Integer startCount) {
        this.startCount = startCount;
    }

    public Integer getStartOnDemand() {
        return startOnDemand;
    }

    public void setStartOnDemand(Integer startOnDemand) {
        this.startOnDemand = startOnDemand;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getLeftOnDemand() {
        return leftOnDemand;
    }

    public void setLeftOnDemand(Integer leftOnDemand) {
        this.leftOnDemand = leftOnDemand;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
