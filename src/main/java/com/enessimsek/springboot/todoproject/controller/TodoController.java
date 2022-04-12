package com.enessimsek.springboot.todoproject.controller;

import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.dto.TodoSaveRequestDto;
import com.enessimsek.springboot.todoproject.dto.TodoUpdateRequestDto;
import com.enessimsek.springboot.todoproject.entityservice.TodoEntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    private final TodoEntityService todoEntityService;

    public TodoController(TodoEntityService todoEntityService) {
        this.todoEntityService = todoEntityService;
    }

    @GetMapping("")
    public List<TodoDto> findAllTodoList(){

        return todoEntityService.findAll();
    }

    @GetMapping("/{id}")
    public TodoDto findById(@PathVariable Long id){
        return todoEntityService.findById(id);
    }

    @PostMapping("")
    public TodoDto save(@RequestBody TodoSaveRequestDto todoSaveRequestDto){
        return todoEntityService.save(todoSaveRequestDto);
    }

    @PutMapping("/{id}")
    public TodoDto update(@PathVariable Long id,@RequestBody TodoUpdateRequestDto todoUpdateRequestDto){

        TodoDto byId = todoEntityService.findById(id);
        todoUpdateRequestDto.setId(byId.getId());
        return todoEntityService.update(todoUpdateRequestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        todoEntityService.deleteById(id);
    }
}
