package dev.rosa.dashnotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/notes")
public class StudyNoteController {

    @Autowired
    private StudyNoteRepository studyNoteRepository;

    @PostMapping
    public StudyNote createNote(@RequestBody StudyNote note) {
        return studyNoteRepository.save(note);
    }

    @GetMapping
    public List<StudyNote> getAllNotes() {
        return studyNoteRepository.findAll();
    }

    @PutMapping("/{id}")
    public StudyNote updateNote(@PathVariable Long id, @RequestBody StudyNote updatedNote) {
        return studyNoteRepository.findById(id)
                .map(note -> {
                    note.setTitle(updatedNote.getTitle());
                    note.setContent(updatedNote.getContent());
                    return studyNoteRepository.save(note);
                })
                .orElseThrow(() -> new RuntimeException("Nota no encontrada con id: " + id));
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        studyNoteRepository.deleteById(id);
    }

}
