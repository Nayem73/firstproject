package com.tryreal.firstproject.repository;

import com.tryreal.firstproject.entity.TodoList;
import org.springframework.data.repository.CrudRepository;

public interface TodoListRepo extends CrudRepository<TodoList, Long> {
}
