package kg.megacom.tasks.controllers;

import kg.megacom.tasks.models.entities.Task;
import kg.megacom.tasks.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping("/save")
    public Task save(@RequestBody Task task) {return taskService.save(task);}

    public List<Task> findActiveTask (@RequestParam Long userId){return taskService.findActiveTask(userId);}
}
