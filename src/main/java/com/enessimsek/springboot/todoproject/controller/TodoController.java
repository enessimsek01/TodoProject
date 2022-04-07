package com.enessimsek.springboot.todoproject.controller;


import com.enessimsek.springboot.todoproject.dao.TodoDao;
import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.entity.Todo;
import com.enessimsek.springboot.todoproject.entityservice.TodoEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {


    @Autowired
    private TodoEntityService todoEntityService;

    @GetMapping("")
    public List<Todo> findAllTodoList(){
        return todoEntityService.findAll();
    }
    @GetMapping("/{id}")
    public Todo findById(@PathVariable Long id){
        return todoEntityService.findById(id);
    }


}
