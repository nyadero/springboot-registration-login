package com.bronyst.spring.data.jpa.repository;

import com.bronyst.spring.data.jpa.entities.Course;
import com.bronyst.spring.data.jpa.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
                .title("Android NanoDegree")
                .credit(12)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.udacity.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

}