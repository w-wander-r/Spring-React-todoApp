package SpringReactTodoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringReactTodoApp.model.Todo;
import SpringReactTodoApp.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) throws Exception {
        Todo todo = todoRepository.findById(id).orElseThrow(()->new Exception("Todo with this id do not exist"));

        todoRepository.delete(todo);
    }
    
}
