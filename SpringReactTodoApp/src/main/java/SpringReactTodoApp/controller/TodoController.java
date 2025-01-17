package SpringReactTodoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringReactTodoApp.model.ApiResponse;
import SpringReactTodoApp.model.Todo;
import SpringReactTodoApp.service.TodoService;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/api")
    public ApiResponse homeController() {
        ApiResponse response = new ApiResponse();
        response.setMessage("Welcome to Todo api");
        response.setStatus(true);
        return response;
    }

    @GetMapping("/api/todos")
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping("/api/todos")
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }
    
    @DeleteMapping("api/todos/{id}")
    public ApiResponse deleteTodo(@PathVariable Long id) throws Exception {
        todoService.deleteTodo(id);
        ApiResponse response = new ApiResponse();
        response.setMessage("Todo deleted successfully");
        response.setStatus(true);
        return response;
    }
    
}
