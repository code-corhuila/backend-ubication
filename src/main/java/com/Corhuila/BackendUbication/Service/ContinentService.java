package com.Corhuila.BackendUbication.Service;

import com.Corhuila.BackendUbication.Entity.Continent;
import com.Corhuila.BackendUbication.IRepository.IBaseRepository;
import com.Corhuila.BackendUbication.IRepository.IContinentRepository;
import com.Corhuila.BackendUbication.IService.IContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService {
    @Override
    protected IBaseRepository<Continent, Long> getRepository() {
        return repository;
    }
    @Autowired
    private IContinentRepository repository;
}
