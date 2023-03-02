package com.example.Fitnes.web.users;


import com.example.Fitnes.core.dto.users.UserCreateDTO;
import com.example.Fitnes.core.dto.users.PageOfUserDTO;
import com.example.Fitnes.service.api.IAdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users/")
public class AdminController {
    private final IAdminService adminService;
    public AdminController(IAdminService adminService){
        this.adminService = adminService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewUser(@RequestBody UserCreateDTO userCreateDTO){
        adminService.addNewUser(userCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<PageOfUserDTO> getPageOfUser(@RequestParam("page") int number,
                                                       @RequestParam("size") int size){
        return ResponseEntity.status(HttpStatus.OK).body(adminService.getPageOfUser(number, size));
    }

    @RequestMapping(path = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<UserCreateDTO> getCard(@PathVariable("uuid") UUID uuid){
        return ResponseEntity.status(HttpStatus.OK).body(adminService.getCard(uuid));
    }

    @RequestMapping(path = "/{uuid}/dt_update/{dt_update}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable("uuid") UUID uuid,
                                    @PathVariable("dt_update")LocalDateTime dtUpdate,
                                    @RequestBody UserCreateDTO userCreateDTO){
        adminService.update(uuid, dtUpdate, userCreateDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
