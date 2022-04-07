package com.enessimsek.springboot.todoproject.entityservice;


import com.enessimsek.springboot.todoproject.converter.TodoConverter;
import com.enessimsek.springboot.todoproject.dao.TodoDao;
import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.dto.TodoSaveRequestDto;
import com.enessimsek.springboot.todoproject.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoEntityService {


    private final TodoDao todoDao;

    public TodoEntityService(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public List<TodoDto> findAll(){
        List<Todo> todoList = todoDao.findAll();
        List<TodoDto> todoDtoList = TodoConverter.INSTANCE.convertAllTodoListToTodoDtoList(todoList);
        return todoDtoList;
    }

    public TodoDto findById(Long id){
        Optional<Todo> optionalTodo=todoDao.findById(id);

        TodoDto todoDto=null;
        if(optionalTodo.isPresent()){
            todoDto = TodoConverter.INSTANCE.convertTodoToTodoDto(optionalTodo.get());
        }

        return todoDto;
    }

    public TodoDto save(TodoSaveRequestDto todoSaveRequestDto){
        Todo todo=TodoConverter.INSTANCE.convertTodoSaveRequestDtoToTodo(todoSaveRequestDto);
        todo = todoDao.save(todo);
        TodoDto todoDto = TodoConverter.INSTANCE.convertTodoToTodoDto(todo);
        return todoDto;
    }

    public void deleteById(Long id){
        todoDao.deleteById(id);
    }
}
