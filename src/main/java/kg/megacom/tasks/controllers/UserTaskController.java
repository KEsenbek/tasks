package kg.megacom.tasks.controllers;

import kg.megacom.tasks.models.entities.UserTask;
import kg.megacom.tasks.services.TaskService;
import kg.megacom.tasks.services.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/task")
public class UserTaskController {

    @Autowired
    private kg.megacom.tasks.services.TaskService TaskService;

    @PostMapping("/close")
    public UserTask closeTask(@RequestParam Long userId,@RequestParam Long taskId){return TaskService.closeTask(userId,taskId);}
}
