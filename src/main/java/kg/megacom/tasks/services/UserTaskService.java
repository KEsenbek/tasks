package kg.megacom.tasks.services;

import kg.megacom.tasks.models.entities.UserTask;

public interface UserTaskService {

    long countByUserAndTask(long userId, long taskId, int period);

    UserTask closeTask(UserTask userTask);
}
