package com.example.todoapp.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.todoapp.entity.Todo;
@Controller
public class TodoController {
	public TodoController() {
	}

	@GetMapping("/todos")
	public String listTodos(Model model) {
		model.addAttribute("todos", List.of(
				new Todo(1L, "Buy groceries", "Milk, Bread, Eggs", false, null, 2, null, null),
				new Todo(2L, "Finish project", "Complete the coding project", true, null, 1, null, null)));
		return "todos/list";
	}
}

