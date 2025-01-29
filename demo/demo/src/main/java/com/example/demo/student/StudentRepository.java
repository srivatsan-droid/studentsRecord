package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//While we are using the JPA Repository we need to specify the Type of the class with the DataType
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //Select * from Student where email
    @Query("SELECT s FROM Student s where s.email =?1")
    Optional<Student>  findStudentByEmail(String email);
}
