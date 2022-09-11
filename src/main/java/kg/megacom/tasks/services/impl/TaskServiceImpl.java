package kg.megacom.tasks.services.impl;

import kg.megacom.tasks.dao.TaskRepo;
import kg.megacom.tasks.dao.UserRepo;
import kg.megacom.tasks.dao.UserTaskRepo;
import kg.megacom.tasks.models.entities.Task;
import kg.megacom.tasks.models.entities.User;
import kg.megacom.tasks.models.entities.UserTask;
import kg.megacom.tasks.services.TaskService;
import kg.megacom.tasks.services.UserService;
import kg.megacom.tasks.services.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepo taskRepo;
    @Autowired
    private UserTaskService userTaskService;
    @Autowired
    private UserService userService;

    @Override
    public List<Task> findActiveTask(Long userId) {
        List<Task> tasks = taskRepo.findAllActiveTask();
        tasks.stream()
                .filter(x->userTaskService.countByUserAndTask(userId,x.getId(),x.getPeriod())>=1)
                .collect(Collectors.toList());
        return tasks;
    }

    @Override
    public Task save(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public Task findById(Long id) {
        return taskRepo.findById(id).orElseThrow();
    }

    @Override
    public UserTask closeTask(Long userId, Long taskId) {
        User user = userService.findById(userId);
        Task task = findById(taskId);

        UserTask userTask = new UserTask();
        userTask.setUser(user);
        userTask.setTask(task);
        userTask.setAddDate(new Date());

        userTask = userTaskService.closeTask(userTask);
        return userTask;
    }


}
