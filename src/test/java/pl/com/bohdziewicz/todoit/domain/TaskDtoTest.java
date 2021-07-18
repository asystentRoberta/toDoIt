package pl.com.bohdziewicz.todoit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskDtoTest {

    TaskDto taskDto;

    @BeforeEach
    public void setupTaskDto() {

        taskDto = new TaskDto(3L, "Dto task no1", "Some info");
    }

    @DisplayName("Lets check lombok getters")
    @Test
    public void checkLombokGeters() {

        long taskIdExpected = 3L;
        String tasktitleExpected = "Dto task no1";
        String taskContentExpected = "Some info";

        assertEquals(taskIdExpected, taskDto.getId());
        assertEquals(tasktitleExpected, taskDto.getTitle());
        assertEquals(taskContentExpected, taskDto.getContent());
    }
}