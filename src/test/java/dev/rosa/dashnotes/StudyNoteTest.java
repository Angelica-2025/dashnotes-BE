package dev.rosa.dashnotes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test for StudyNote entity")
public class StudyNoteTest {

    @Test
    @DisplayName("Should create a StudyNote correctly")
    public void studyNoteCreated() {
        StudyNote studyNote = new StudyNote("Título de prueba", "Contenido de prueba");

        assertEquals("Título de prueba", studyNote.getTitle());
        assertEquals("Contenido de prueba", studyNote.getContent());
    }
}
