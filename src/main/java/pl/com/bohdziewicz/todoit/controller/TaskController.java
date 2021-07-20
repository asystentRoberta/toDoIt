package pl.com.bohdziewicz.todoit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.com.bohdziewicz.todoit.domain.TaskDTO;
import pl.com.bohdziewicz.todoit.mapper.TaskMapper;
import pl.com.bohdziewicz.todoit.service.DbService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/")
public class TaskController {

    private final DbService dbService;
    private final TaskMapper taskMapper;

    public TaskController(DbService dbService, TaskMapper taskMapper) {

        this.dbService = dbService;
        this.taskMapper = taskMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tasks")
    public List<TaskDTO> getTasks() {

        return taskMapper.mapToTaskDtoList(dbService.getAllTasks());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/{taskId}")
    public TaskDTO getTask(Long taskId) {

        return new TaskDTO(1L, "Test task", "Test task content");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{taskId}")
    public void deleteTask(Long taskId) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/tasks")
    public TaskDTO updateTask(TaskDTO taskDto) {

        return new TaskDTO(1L, "Test update task", "Test update task content");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tasks", consumes = APPLICATION_JSON_VALUE)
    public void createTask(TaskDTO taskDto) {

    }
}
