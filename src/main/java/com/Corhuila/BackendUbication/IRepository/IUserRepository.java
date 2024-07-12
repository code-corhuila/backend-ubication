package com.Corhuila.BackendUbication.IRepository;

import com.Corhuila.BackendUbication.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository  extends IBaseRepository<User,Long>{
}
