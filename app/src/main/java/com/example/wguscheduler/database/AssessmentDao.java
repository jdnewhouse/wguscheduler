package com.example.wguscheduler.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AssessmentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAssessment(AssessmentEntity assessmentEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<AssessmentEntity> assessments);

    @Delete
    void deleteAssessment(AssessmentEntity assessmentEntity);

    @Query("SELECT * FROM assessments WHERE assessment_id = :assessment_id")
    AssessmentEntity getAssessmenteById(int assessment_id);

    @Query("SELECT * FROM assessments ORDER BY date DESC")
    LiveData<List<AssessmentEntity>> getAll();

    @Query("DELETE FROM assessments")
    int deleteAll();

    @Query("SELECT COUNT(*) FROM assessments")
    int getCount();

}
