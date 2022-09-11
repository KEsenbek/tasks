package kg.megacom.tasks.models.entities;

import kg.megacom.tasks.models.entities.Task;
import kg.megacom.tasks.models.entities.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "user_tasks")
public class UserTask {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Date addDate;

    @ManyToOne
    @JoinColumn (name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "task_id")
    Task task;


}
