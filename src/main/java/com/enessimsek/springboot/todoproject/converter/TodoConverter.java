package com.enessimsek.springboot.todoproject.converter;


import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.entity.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public class TodoConverter {
    
    TodoConverter INSTANCE= Mappers.getMapper(TodoConverter.class);
   /* @Mapping(target = "")
    TodoDto convertTodoToTodoDto(Todo todo);*/
}
