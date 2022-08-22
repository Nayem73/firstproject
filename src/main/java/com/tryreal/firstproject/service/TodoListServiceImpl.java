package com.tryreal.firstproject.service;

import com.tryreal.firstproject.entity.TodoList;
import com.tryreal.firstproject.repository.TodoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TodoListServiceImpl implements TodoListService {
    @Autowired
    private TodoListRepo repo;

    @Override
    public Iterable<TodoList> td() {
        //return repo.findAll();
        return Arrays.asList(
          new TodoList("1st Todo list here", false),
          new TodoList("2nd Created or Not?", false),
          new TodoList("3rd stuff", false)
        );
    }
}
