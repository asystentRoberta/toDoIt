package pl.com.bohdziewicz.todoit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.com.bohdziewicz.todoit.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

    @Override
    List<Task> findAll();
}
