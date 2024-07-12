package com.Corhuila.BackendUbication.Controller;

import com.Corhuila.BackendUbication.Dto.ApiResponseDto;
import com.Corhuila.BackendUbication.Dto.IPersonDto;
import com.Corhuila.BackendUbication.Entity.Person;
import com.Corhuila.BackendUbication.IService.IPersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/person")
public class PersonController extends ABaseController<Person, IPersonService> {
    public PersonController(IPersonService service) {
        super(service, "Person");
    }

    @GetMapping("persons")
    public ResponseEntity<ApiResponseDto<List<IPersonDto>>> Persons() {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IPersonDto>>("Datos obtenidos", service.Persons(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IPersonDto>>(e.getMessage(), null, false));
        }
    }
}
