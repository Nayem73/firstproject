package com.tryreal.firstproject.controller;

import com.tryreal.firstproject.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoListController {
    private TodoListService todosrvc;

    @Autowired
    public void setTodosrvc(TodoListService todosrvc) {
        this.todosrvc = todosrvc;
    }

    @GetMapping("/")
    public String getTasks(Model model) {
        model.addAttribute("todos", todosrvc.td());
        return "From_Template";
    }
}
