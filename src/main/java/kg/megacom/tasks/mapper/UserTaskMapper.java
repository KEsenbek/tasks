package kg.megacom.tasks.mapper;

import kg.megacom.tasks.mapper.base.CrudMapper;
import kg.megacom.tasks.models.dto.UserTaskDto;
import kg.megacom.tasks.models.entities.UserTask;
import org.mapstruct.Mapper;

@Mapper
public interface UserTaskMapper extends CrudMapper<UserTask, UserTaskDto> {
}
