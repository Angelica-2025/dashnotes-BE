package dev.rosa.dashnotes;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class StudyNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String filePath;
    private LocalDateTime createdAt;

    // Constructor con parámetros
    public StudyNote(String title, String description, String filePath) {
        this.title = title;
        this.description = description;
        this.filePath = filePath;
        this.createdAt = LocalDateTime.now();
    }

    // Constructor vacío (necesario para JPA)
    public StudyNote() {
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
