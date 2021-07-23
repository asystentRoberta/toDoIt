package pl.com.bohdziewicz.todoit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pl.com.bohdziewicz.todoit.domain.Task;
import pl.com.bohdziewicz.todoit.repository.TaskRepository;

@Service
public class DbService {

    final
    TaskRepository taskRepository;

    public DbService(TaskRepository taskRepository) {

        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {

        return taskRepository.findAll();
    }

    public void saveSingleTask(Task task) {

        taskRepository.save(task);
    }

    public Optional<Task> getDtoTaskById(Long id) {

        return taskRepository.findById(id);
    }
}

