package com.enessimsek.springboot.todoproject.dto;

public class TodoUpdateRequestDto {

    private Long id;

    private String work;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
