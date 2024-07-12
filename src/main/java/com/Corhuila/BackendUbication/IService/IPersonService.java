package com.Corhuila.BackendUbication.IService;

import com.Corhuila.BackendUbication.Dto.IPersonDto;
import com.Corhuila.BackendUbication.Entity.Person;

import java.util.List;

public interface IPersonService extends IBaseService<Person>{

    List<IPersonDto> Persons();

}
