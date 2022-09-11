package kg.megacom.tasks.models.dto;


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


public class TaskDto {


    Long id;

    String title;


    int period;

    Date startDate;
    Date endDate;
}
