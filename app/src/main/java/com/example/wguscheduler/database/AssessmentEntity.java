package com.example.wguscheduler.database;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "assessments",
        foreignKeys = @ForeignKey(entity = CourseEntity.class,
                parentColumns = "course_id",
                childColumns = "assessment_id"))

public class AssessmentEntity {
    @PrimaryKey(autoGenerate = true)
    private int assessment_id;
    private Date date;
    private String type;
    private String title;
    private String status;

    @Ignore
    public AssessmentEntity() {
    }

    @Ignore
    public AssessmentEntity(Date date, String type, String title, String status) {
        this.date = date;
        this.type = type;
        this.title = title;
        this.status = status;
    }

    public AssessmentEntity(int assessment_id, Date date, String type, String title, String status) {
        this.assessment_id = assessment_id;
        this.date = date;
        this.type = type;
        this.title = title;
        this.status = status;
    }

    public int getAssessment_id() {
        return assessment_id;
    }

    public void setAssessment_id(int assessment_id) {
        this.assessment_id = assessment_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssessmentEntity{" +
                "assessment_id=" + assessment_id +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
