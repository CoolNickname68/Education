package com.work2.work2;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/get")
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
