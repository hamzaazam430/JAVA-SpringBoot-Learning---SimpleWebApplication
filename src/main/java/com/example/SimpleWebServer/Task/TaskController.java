package com.example.SimpleWebServer.Task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();
    private Long taskIdCounter = 1L;

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody Task task) {
        final String desc = task.getDescription();
        if (desc == "" || desc == null) {
            return "{\"message\":\"Description for task required\"}";
        }
        task.setId(taskIdCounter++);
        tasks.add(task);
        return task.toString();
    }
}
