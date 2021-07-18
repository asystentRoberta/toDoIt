package pl.com.bohdziewicz.todoit.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task taskForTest;

    @BeforeEach
    public void setup(){

        taskForTest = new Task(1L, "Pierwsze zadanie", "Testy");
    }

    @DisplayName("Lets check lombok getters")
    @Test
    public void checkLombokGetters(){
        long idTaskActual = taskForTest.getId();
        String titleTaskActual = taskForTest.getTitle();
        String contentTaskActual = taskForTest.getContent();

        long idTaskExpected = 1L;
        String titleTaskExpected = "Pierwsze zadanie";
        String contentTaskExpected = "Testy";

        assertEquals(idTaskExpected, idTaskActual);
        assertEquals(titleTaskExpected, titleTaskActual);
        assertEquals(contentTaskExpected, contentTaskActual);

    }

}