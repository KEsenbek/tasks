package kg.megacom.tasks.models.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@FieldDefaults (level = AccessLevel.PRIVATE)

@Entity
@Table(name = "tasks")
public class Task {

    @Id
            @GeneratedValue
    Long id;

    String title;


    int period;

    Date startDate;
    Date endDate;
}
