package com.example.Fitnes.web.users;

import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.UserLoginDTO;
import com.example.Fitnes.core.dto.users.UserRegistrationDTO;
import com.example.Fitnes.service.api.IUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final IUserService service;

    public UserController(IUserService service) {
        this.service = service;
    }

    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public ResponseEntity<UUID> register(@Valid @RequestBody UserRegistrationDTO user) {
        service.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

   @RequestMapping(path = "/verification", method = RequestMethod.GET)
   public ResponseEntity<?> verification(@RequestParam("code") String code,
                                                      @RequestParam("mail") String mail){
        return ResponseEntity.status(HttpStatus.OK).body(service.verification(code, mail));
   }

   @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<UserLoginDTO> login(@Valid @RequestBody UserLoginDTO userLoginDTO){
        service.login(userLoginDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
   }

   @RequestMapping(path = "/me", method = RequestMethod.GET)
    public ResponseEntity<UserCreateDTO> getCard(@Valid @PathVariable("me") UUID uuid){
        return ResponseEntity.status(HttpStatus.OK).body(service.getCard(uuid));
   }

}
