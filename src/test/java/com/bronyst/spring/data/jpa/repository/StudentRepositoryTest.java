package com.bronyst.spring.data.jpa.repository;

import com.bronyst.spring.data.jpa.entities.Student;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    // save student
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .firstName("Nyadero")
                .lastName("Odhiambo")
                .email("briannyadero443@gmail.com")
//                .guardianName("Boaz A Nyadero")
//                .guardianEmail("boaz@gmail.com")
//                .guardianPhone("074256762")
                .build();


        studentRepository.save(student);
    }

//    all students
    @Test
    public void allStudents(){
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }

    // find by first name
    @Test
    public void findStudentByFirstName(){
         List<Student> studentList = studentRepository.findByFirstName("nyadero");
        System.out.println(studentList);
    }

}