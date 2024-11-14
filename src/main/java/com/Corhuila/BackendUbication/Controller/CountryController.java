package com.Corhuila.BackendUbication.Controller;

import com.Corhuila.BackendUbication.Entity.Country;
import com.Corhuila.BackendUbication.IService.ICountryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/country")
public class CountryController extends ABaseController<Country, ICountryService> {
    public CountryController(ICountryService service) {
        super(service, "Country");
    }
}
