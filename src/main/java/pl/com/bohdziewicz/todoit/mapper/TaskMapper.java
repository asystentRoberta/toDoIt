package pl.com.bohdziewicz.todoit.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import pl.com.bohdziewicz.todoit.domain.Task;
import pl.com.bohdziewicz.todoit.domain.TaskDTO;

@Component
public class TaskMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Task toTaskMap(final TaskDTO taskDto) {

        return modelMapper.map(taskDto, Task.class);
    }

    public TaskDTO toDtoTask(final Task task) {

        return modelMapper.map(task, TaskDTO.class);
    }

    public List<TaskDTO> mapToTaskDtoList(final List<Task> taskList) {

        return taskList
                .stream()
                .map(task -> modelMapper.map(task, TaskDTO.class))
                .collect(Collectors.toList());
    }
}
