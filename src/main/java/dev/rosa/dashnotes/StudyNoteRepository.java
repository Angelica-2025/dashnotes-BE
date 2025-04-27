package dev.rosa.dashnotes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyNoteRepository extends JpaRepository<StudyNote, Long> {
}
