package work2.work2;
import com.work2.work2.ExaminerServiceImpl;
import com.work2.work2.Question;
import com.work2.work2.QuestionService;
import com.work2.work2.ExaminerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ExaminerServiceImplTest {

    private QuestionService questionService;
    private ExaminerService examinerService;

    @BeforeEach
    public void setUp() {
        questionService = mock(QuestionService.class);
        examinerService = new ExaminerServiceImpl(questionService);
    }

    @Test
    public void testGetQuestions() {
        Question question = new Question("What is Java?", "A programming language.");
        when(questionService.getAll()).thenReturn(Set.of(question));
        when(questionService.getRandomQuestion()).thenReturn(question);

        Collection<Question> questions = examinerService.getQuestions(1);
        assertEquals(1, questions.size());
        assertTrue(questions.contains(question));
    }

    @Test
    public void testGetQuestionsNotEnoughQuestions() {
        when(questionService.getAll()).thenReturn(Collections.emptySet());

        assertThrows(IllegalArgumentException.class, () -> examinerService.getQuestions(1));
    }
}
