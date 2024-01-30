package com.example.moodle.repository;

import com.example.moodle.model.ExamPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamPlanRepository extends JpaRepository<ExamPlan,Long> {
}