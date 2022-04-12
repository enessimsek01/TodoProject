package com.enessimsek.springboot.todoproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "work",nullable = false)
    private String work;

    @Column(name = "description")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", work='" + work + '\'' +
                ", description" + description + '\'' +
                '}';
    }
}
