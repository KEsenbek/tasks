package kg.megacom.tasks.dao;

import ch.qos.logback.core.boolex.EvaluationException;
import kg.megacom.tasks.models.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task,Long> {

    @Query("select u from Task u where current_timestamp between u.startDate and u.endDate")
    List<Task> findAllActiveTask();

}
