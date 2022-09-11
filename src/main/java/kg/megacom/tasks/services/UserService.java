package kg.megacom.tasks.services;

import kg.megacom.tasks.models.entities.User;

public interface UserService {
    User save(User user);

    User findById(Long id);
}
