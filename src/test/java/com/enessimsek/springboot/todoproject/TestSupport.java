package com.enessimsek.springboot.todoproject;

import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class TestSupport {

    public List<Todo> getAllTodos(){
        Todo todo1=new Todo();
        todo1.setId(1L);
        todo1.setWork("test1");
        todo1.setDescription("test1");

        Todo todo2=new Todo();
        todo2.setId(2L);
        todo2.setWork("test2");
        todo2.setDescription("test2");

        Todo todo3=new Todo();
        todo3.setId(3L);
        todo3.setWork("test3");
        todo3.setDescription("test3");

        List<Todo> todoList=new ArrayList<>();
        todoList.add(todo1);
        todoList.add(todo2);
        todoList.add(todo3);

        return todoList;
    }
    public List<TodoDto> getAllTodoDto(){
        TodoDto todo1=new TodoDto();
        todo1.setId(1L);
        todo1.setWork("test1");
        todo1.setDescription("test1");

        TodoDto todo2=new TodoDto();
        todo2.setId(2L);
        todo2.setWork("test2");
        todo2.setDescription("test2");

        TodoDto todo3=new TodoDto();
        todo3.setId(3L);
        todo3.setWork("test3");
        todo3.setDescription("test3");

        List<TodoDto> todoDtoList=new ArrayList<>();
        todoDtoList.add(todo1);
        todoDtoList.add(todo2);
        todoDtoList.add(todo3);

        return todoDtoList;
    }

}
