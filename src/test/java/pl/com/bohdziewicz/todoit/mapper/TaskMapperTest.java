package pl.com.bohdziewicz.todoit.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import pl.com.bohdziewicz.todoit.domain.Task;
import pl.com.bohdziewicz.todoit.domain.TaskDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskMapperTest {

    TaskDTO taskDTO = new TaskDTO(1L, "TestOne - DTO", "Content");
    Task task = new Task(2L, "Test One - noDto", "Content");
    TaskMapper taskMapper = new TaskMapper();

    @Test
    void toTaskMap() {

        Task testedTask = taskMapper.toTaskMap(taskDTO);
        assertEquals(taskDTO.getId(), testedTask.getId());
        assertEquals(taskDTO.getTitle(), testedTask.getTitle());
        assertEquals(taskDTO.getContent(), testedTask.getContent());
    }

    @Test
    void toDtoTask() {

        TaskDTO testedDTOTask = taskMapper.toDtoTask(task);
        assertEquals(task.getId(), testedDTOTask.getId());
        assertEquals(task.getTitle(), testedDTOTask.getTitle());
        assertEquals(task.getContent(), testedDTOTask.getContent());
    }

    @Test
    void mapToTaskDtoList() {

        List<Task> listToMap = taskListGenerator();
        List<TaskDTO> listMapped = taskMapper.mapToTaskDtoList(listToMap);
        for (int i = 0; i < 2; i++) {
            assertEquals(listMapped.get(i).getId(), listToMap.get(i).getId());
            assertEquals(listMapped.get(i).getTitle(), listToMap.get(i).getTitle());
            assertEquals(listMapped.get(i).getContent(), listToMap.get(i).getContent());
        }
    }

    private List<Task> taskListGenerator() {

        Task task1 = new Task(3L, "Second task", "Content");
        List<Task> taskList = new ArrayList<>();
        taskList.add(task);
        taskList.add(task1);
        return taskList;
    }
}