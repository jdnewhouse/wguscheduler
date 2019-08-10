package com.example.wguscheduler.database;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "mentors",
        foreignKeys = @ForeignKey(entity = CourseEntity.class,
                parentColumns = "course_id",
                childColumns = "mentor_id"))

public class MentorEntity {
    @PrimaryKey(autoGenerate = true)
    private int mentor_id;
    private Date date;
    private String name;
    private String phone;
    private String email;

    @Ignore
    public MentorEntity() {
    }

    @Ignore
    public MentorEntity(Date date, String name, String phone, String email) {
        this.date = date;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MentorEntity(int mentor_id, Date date, String name, String phone, String email) {
        this.mentor_id = mentor_id;
        this.date = date;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(int mentor_id) {
        this.mentor_id = mentor_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MentorEntity{" +
                "mentor_id=" + mentor_id +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
