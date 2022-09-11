package kg.megacom.tasks.services.impl;

import kg.megacom.tasks.dao.UserTaskRepo;
import kg.megacom.tasks.models.entities.UserTask;
import kg.megacom.tasks.services.TaskService;
import kg.megacom.tasks.services.UserService;
import kg.megacom.tasks.services.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class UserTaskServiceImpl implements UserTaskService {

    @Autowired
    private UserTaskRepo userTaskRepo;





    @Override
    public long countByUserAndTask(long userId, long taskId, int period) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,period);
        long count = userTaskRepo.countByUserAndTaskAndPeriod(userId,taskId,calendar.getTime());

        return count;
    }

    @Override
    public UserTask closeTask(UserTask userTask) {
        return userTaskRepo.save(userTask);
    }


}
