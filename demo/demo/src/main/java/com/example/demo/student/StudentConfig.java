package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.MAY;

@Configuration
//Basically the configuration is used to store the values into the Database this annonation is used for Passing the Values into a Empty or an Existing Database
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student sriram = new Student(
                  "Sriram",
                  "sriram5srivatsan@gmail.com",
                  LocalDate.of(2001, MAY,7)
          );
          Student raghav = new Student(
                    "raghavendran",
                    "raghavendramahesh@gmail.com",
                    LocalDate.of(2000, AUGUST,10)
          );
          repository.saveAll(List.of(sriram,raghav));
        };
    }
}
