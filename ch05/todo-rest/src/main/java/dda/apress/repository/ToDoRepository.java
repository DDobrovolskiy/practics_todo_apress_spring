package dda.apress.repository;

import dda.apress.domain.ToDo;
import org.springframework.data.repository.CrudRepository;


public interface ToDoRepository extends CrudRepository<ToDo,String> {

}
