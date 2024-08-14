package com.work2.work2;

import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questions = new HashSet<>();
    private final Random random = new Random();
    public void remove(Question question) {
        if (!questions.contains(question)) {
            throw new NoSuchElementException("Question not found");
        }
        questions.remove(question);
    }

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    @Override
    public Question remove(String question, String answer) {
        Question q = new Question(question, answer);
        if (questions.remove(q)) {
            return q;
        } else {
            throw new NoSuchElementException("Question not found");
        }
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new NoSuchElementException("No questions available");
        }
        int index = random.nextInt(questions.size());
        return new ArrayList<>(questions).get(index);
    }
}
