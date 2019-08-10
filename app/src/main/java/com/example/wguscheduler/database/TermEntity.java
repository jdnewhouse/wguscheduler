package com.example.wguscheduler.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "terms")
public class TermEntity {
    @PrimaryKey(autoGenerate = true)
    private int term_id;
    private Date date;
    private String title;
    private Date startDate;
    private Date endDate;

    @Ignore
    public TermEntity() {
    }

    @Ignore
    public TermEntity(Date date, String title, Date startDate, Date endDate) {
        this.date = date;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TermEntity(int term_id, Date date, String title, Date startDate, Date endDate) {
        this.term_id = term_id;
        this.date = date;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTerm_id() {
        return term_id;
    }

    public void setTerm_id(int term_id) {
        this.term_id = term_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TermEntity{" +
                "term_id=" + term_id +
                ", date=" + date +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
