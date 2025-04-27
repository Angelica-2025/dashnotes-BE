package dev.rosa.dashnotes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Test for StudyNote entity")
public class StudyNoteTest {

    @Test
    @DisplayName("Should create a StudyNote conrrectly"
    public void studyNoteCreated(){
        
       StudyNote studyNote = new StudyNote ("CSS", "JAVA", "/files/git-rebase.pdf");
        assertThat(studyNote.getTitle(), is("CSS"));
        assertThat(studyNote.getDescription(), is("JAVA"));
        assertThat(studyNote.getFilePath(), is("/files/git-rebase.pdf"));
        assertThat(studyNote.getCreatedAt(), is(notNullValue()));
    }

}
