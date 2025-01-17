package SpringReactTodoApp.service;

import java.util.List;

import SpringReactTodoApp.model.Todo;

public interface TodoService {
    
    List<Todo> getAllTodos();

    Todo createTodo(Todo todo);

    void deleteTodo(Long id) throws Exception;
}