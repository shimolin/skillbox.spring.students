package com.example.students.events;

import com.example.students.Student;
import lombok.Getter;

@Getter
public class StudentAddEvent {
    private Student student;

    public StudentAddEvent(Student student) {
        this.student = student;
    }
}
