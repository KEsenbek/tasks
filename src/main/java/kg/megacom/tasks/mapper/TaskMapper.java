package kg.megacom.tasks.mapper;

import kg.megacom.tasks.mapper.base.CrudMapper;
import kg.megacom.tasks.models.dto.TaskDto;
import kg.megacom.tasks.models.entities.Task;
import org.mapstruct.Mapper;

@Mapper
public interface TaskMapper extends CrudMapper<Task, TaskDto> {

}
