package com.enessimsek.springboot.todoproject.dao;


import com.enessimsek.springboot.todoproject.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDao extends JpaRepository<Todo,Long> {

}
