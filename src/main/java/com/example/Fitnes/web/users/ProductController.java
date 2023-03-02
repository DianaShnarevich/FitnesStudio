package com.example.Fitnes.web.users;

import com.example.Fitnes.core.dto.products.ProductDTO;
import com.example.Fitnes.core.dto.users.UserRegistrationDTO;
import com.example.Fitnes.service.api.IProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final IProductService service;
    public ProductController(IProductService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UUID> add(@Valid @RequestBody ProductDTO product) {
        service.add(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAll(@RequestParam("page") int page,
                                    @RequestParam("size") int size){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
}
