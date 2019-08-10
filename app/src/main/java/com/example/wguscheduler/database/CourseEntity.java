package com.example.wguscheduler.database;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "courses",
        foreignKeys = @ForeignKey(entity = TermEntity.class,
                                  parentColumns = "term_id",
                                  childColumns = "course_id"))
public class CourseEntity {
    @PrimaryKey(autoGenerate = true)
    private int course_id;
    private Date date;
    private String title;
    private Date startDate;
    private Date endDate;
    private String status;

    @Ignore
    public CourseEntity() {
    }

    @Ignore
    public CourseEntity(Date date, String title, Date startDate, Date endDate, String status) {
        this.date = date;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public CourseEntity(int course_id, Date date, String title, Date startDate, Date endDate, String status) {
        this.course_id = course_id;
        this.date = date;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "course_id=" + course_id +
                ", date=" + date +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                '}';
    }
}
