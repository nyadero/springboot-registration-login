package com.bronyst.spring.data.jpa.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
