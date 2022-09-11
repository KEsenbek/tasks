package kg.megacom.tasks.dao;

import kg.megacom.tasks.models.entities.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserTaskRepo extends JpaRepository<UserTask, Long> {

    @Query("select count (u) from  UserTask u where u.user.id = ?1 and u.task.id = ?2 and current_timestamp > ?3")
    long countByUserAndTaskAndPeriod (Long userId, Long taskId, Date date);

}
