package com.example.students;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Студент " +id + ": " + firstName + " " + lastName + " - "+ age + " лет.";
    }
}
