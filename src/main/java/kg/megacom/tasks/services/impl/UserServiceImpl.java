package kg.megacom.tasks.services.impl;

import kg.megacom.tasks.dao.UserRepo;
import kg.megacom.tasks.models.entities.User;
import kg.megacom.tasks.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user) ;
    }

    @Override
    public User findById(Long id) {
        return userRepo.findById(id).orElseThrow();
    }
}
