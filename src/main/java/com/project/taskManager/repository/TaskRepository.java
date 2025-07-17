package com.project.taskManager.repository;

import com.project.taskManager.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task , Long> {
}
