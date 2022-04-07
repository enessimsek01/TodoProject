package com.enessimsek.springboot.todoproject.entityservice;


import com.enessimsek.springboot.todoproject.dao.TodoDao;
import com.enessimsek.springboot.todoproject.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoEntityService {

    @Autowired
    private TodoDao todoDao;

    public List<Todo> findAll(){
        return todoDao.findAll();
    }

    public Todo findById(Long id){
        Optional<Todo> optionalTodo=todoDao.findById(id);

        Todo todo=null;
        if(optionalTodo.isPresent()){
            todo=optionalTodo.get();
        }

        return todo;
    }

    public Todo save(Todo todo){
        return todoDao.save(todo);
    }

    public void deleteById(Long id){
        todoDao.deleteById(id);
    }
}
