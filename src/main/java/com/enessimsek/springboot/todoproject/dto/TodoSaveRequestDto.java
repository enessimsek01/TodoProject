package com.enessimsek.springboot.todoproject.dto;

public class TodoSaveRequestDto {
    private String work;
    private String description;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
