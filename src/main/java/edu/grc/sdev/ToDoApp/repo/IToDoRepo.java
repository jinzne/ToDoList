package edu.grc.sdev.ToDoApp.repo;
import edu.grc.sdev.ToDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {
}
