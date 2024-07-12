package com.Corhuila.BackendUbication.Controller;

import com.Corhuila.BackendUbication.Entity.Person;
import com.Corhuila.BackendUbication.Entity.User;
import com.Corhuila.BackendUbication.IService.IPersonService;
import com.Corhuila.BackendUbication.IService.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/user")
public class UserController extends ABaseController<User, IUserService> {
    public UserController(IUserService service) {
        super(service, "User");
    }
}
