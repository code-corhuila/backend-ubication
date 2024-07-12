package com.Corhuila.BackendUbication.Service;

import com.Corhuila.BackendUbication.Entity.User;
import com.Corhuila.BackendUbication.IRepository.IBaseRepository;
import com.Corhuila.BackendUbication.IRepository.IUserRepository;
import com.Corhuila.BackendUbication.IService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService extends ABaseService<User> implements IUserService {
    @Override
    protected IBaseRepository<User, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IUserRepository repository;
}
