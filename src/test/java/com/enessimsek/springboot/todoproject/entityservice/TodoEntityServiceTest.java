package com.enessimsek.springboot.todoproject.entityservice;

import com.enessimsek.springboot.todoproject.TestSupport;
import com.enessimsek.springboot.todoproject.dao.TodoDao;
import com.enessimsek.springboot.todoproject.dto.TodoDto;
import com.enessimsek.springboot.todoproject.entity.Todo;
import com.enessimsek.springboot.todoproject.exception.TodoNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TodoEntityServiceTest extends TestSupport {

    @Mock
    private TodoDao todoDao;

    @InjectMocks
    private TodoEntityService todoEntityService;

    @Test
    void testFindAll_whenTodosExist_shouldReturnAllTodos(){
        List<Todo> allTodos = getAllTodos();
        List<TodoDto> allTodoDto = getAllTodoDto();
        when(todoDao.findAll()).thenReturn(allTodos);
        List<TodoDto> all = todoEntityService.findAll();
        assertEquals(allTodoDto.get(0).getId(),all.get(0).getId());
        assertEquals(allTodoDto.get(1).getId(),all.get(1).getId());
        assertEquals(allTodoDto.get(2).getId(),all.get(2).getId());

    }

    @Test
    void testFindById_whenTodoDoesNotExist_shouldThrowTodoNotFoundException(){
        Optional<Todo> optionalTodo=Optional.empty();
        when(todoDao.findById(1L)).thenReturn(optionalTodo);
        TodoNotFoundException ex=assertThrows(TodoNotFoundException.class,()->todoEntityService.findById(1L));
        assertEquals("Work Not found",ex.getMessage());
       // verify(todoDao,never()).save(any());//delete
    }
    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}