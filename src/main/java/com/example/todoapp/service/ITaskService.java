package com.example.todoapp.service;

import com.example.todoapp.entity.Task;
import java.util.List;

public interface ITaskService {
    Task saveTask(Task task);
    Task getTaskById(Long id);
    void deleteTask(Long id);
    Task updateTask(Task task);
    List<Task> getAllTasks();
}
