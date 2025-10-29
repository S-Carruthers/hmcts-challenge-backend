package dev.controllers;

import dev.TaskStatus;
import org.springframework.http.ResponseEntity;
import dev.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TaskController {

    @GetMapping(value = "/get-example-task", produces = "application/json")
    public ResponseEntity<Task> getExampleTask() {
        return ok(new Task(1, "Example Task", "Description",
                TaskStatus.NOT_STARTED, LocalDateTime.now()));
    }
}
