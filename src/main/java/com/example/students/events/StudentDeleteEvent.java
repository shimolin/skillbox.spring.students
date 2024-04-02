package com.example.students.events;

import lombok.Getter;

@Getter
public class StudentDeleteEvent {
    private Integer id;

    public StudentDeleteEvent(Integer id) {
        this.id = id;
    }
}
