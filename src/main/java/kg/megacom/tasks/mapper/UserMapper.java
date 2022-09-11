package kg.megacom.tasks.mapper;

import kg.megacom.tasks.mapper.base.CrudMapper;
import kg.megacom.tasks.models.dto.UserDto;
import kg.megacom.tasks.models.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends CrudMapper<User, UserDto> {
}
