package kg.megacom.tasks.services;

import kg.megacom.tasks.models.entities.Task;
import kg.megacom.tasks.models.entities.UserTask;

import java.util.List;

public interface TaskService {
    List<Task> findActiveTask(Long userId);


    Task save(Task task);

    Task findById(Long id);

    UserTask closeTask(Long userId, Long taskId);
}
