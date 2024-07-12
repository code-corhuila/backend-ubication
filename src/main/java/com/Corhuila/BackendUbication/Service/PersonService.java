package com.Corhuila.BackendUbication.Service;

import com.Corhuila.BackendUbication.Dto.IPersonDto;
import com.Corhuila.BackendUbication.Entity.Person;
import com.Corhuila.BackendUbication.IRepository.IBaseRepository;
import com.Corhuila.BackendUbication.IRepository.IPersonRepository;
import com.Corhuila.BackendUbication.IService.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService extends ABaseService<Person> implements IPersonService {
    @Override
    protected IBaseRepository<Person, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IPersonRepository repository;

    @Override
    public List<IPersonDto> Persons() {
        return repository.Persons();
    }
}
