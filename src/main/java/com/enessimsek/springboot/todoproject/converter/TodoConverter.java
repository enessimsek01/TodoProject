package com.enessimsek.springboot.todoproject.converter;


import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.dto.TodoSaveRequestDto;
import com.enessimsek.springboot.todoproject.dto.TodoUpdateRequestDto;
import com.enessimsek.springboot.todoproject.entity.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TodoConverter {
    
    TodoConverter INSTANCE= Mappers.getMapper(TodoConverter.class);

    TodoDto convertTodoToTodoDto(Todo todo);

    List<TodoDto> convertAllTodoListToTodoDtoList(List<Todo> todoList);

    Todo convertTodoDtoToTodo(TodoDto todoDto);

    Todo convertTodoSaveRequestDtoToTodo(TodoSaveRequestDto todoSaveRequestDto);

    Todo convertTodoUpdateRequestDtoToTodo(TodoUpdateRequestDto todoUpdateRequestDto);

    TodoUpdateRequestDto convertTodoToTodoUpdateRequestDto(Todo todo);
}
