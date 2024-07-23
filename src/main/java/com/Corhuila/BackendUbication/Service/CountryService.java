package com.Corhuila.BackendUbication.Service;

import com.Corhuila.BackendUbication.Entity.Country;
import com.Corhuila.BackendUbication.IRepository.IBaseRepository;
import com.Corhuila.BackendUbication.IRepository.ICountryRepository;
import com.Corhuila.BackendUbication.IService.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CountryService extends ABaseService<Country> implements ICountryService {
    @Override
    protected IBaseRepository<Country, Long> getRepository() {
        return repository;
    }
    @Autowired
    private ICountryRepository repository;
}
