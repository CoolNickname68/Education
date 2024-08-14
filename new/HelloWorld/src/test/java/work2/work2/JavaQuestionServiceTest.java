package work2.work2;
import com.work2.work2.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.work2.work2.JavaQuestionService;
import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {

    private JavaQuestionService javaQuestionService;

    @BeforeEach
    public void setUp() {
        javaQuestionService = new JavaQuestionService();
    }

    @Test
    public void testAddQuestion() {
        Question question = javaQuestionService.add("What is Java?", "A programming language.");
        assertTrue(javaQuestionService.getAll().contains(question));
    }

    @Test
    void testRemoveQuestion() {
        Question question = javaQuestionService.add("What is Java?", "A programming language.");

        assertDoesNotThrow(() -> javaQuestionService.remove(question)); // Удаляем вопрос

        assertFalse(javaQuestionService.getAll().contains(question)); // Убедимся, что вопрос удален
    }


    @Test
    public void testGetRandomQuestion() {
        javaQuestionService.add("What is Java?", "A programming language.");
        assertNotNull(javaQuestionService.getRandomQuestion());
    }
}
