package kg.megacom.tasks.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)



public class UserTaskDto {


    Long id;
    Date addDate;


    UserDto user;
    TaskDto task;


}
