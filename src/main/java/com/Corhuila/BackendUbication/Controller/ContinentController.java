package com.Corhuila.BackendUbication.Controller;

import com.Corhuila.BackendUbication.Dto.ApiResponseDto;
import com.Corhuila.BackendUbication.Entity.Continent;
import com.Corhuila.BackendUbication.IService.IContinentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/continent")
public class ContinentController extends ABaseController<Continent, IContinentService> {
    public ContinentController(IContinentService service) {
        super(service, "Continent");
    }
}
