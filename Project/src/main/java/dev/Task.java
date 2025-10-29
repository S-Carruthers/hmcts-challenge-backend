package dev;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Task {

    private int id;
    private String taskTitle;
    private String taskDescription;
    private TaskStatus taskStatus;
    private LocalDateTime dueDate;

}
