package SpringReactTodoApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import SpringReactTodoApp.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
