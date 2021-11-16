package com.sparta.week022.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> { //Course의 ID값이 Long
}
