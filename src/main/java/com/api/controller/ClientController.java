package com.api.controller;

import com.api.model.Client;
import com.api.service.ClientService;
import com.api.util.URLConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = URLConstants.CLIENT_URL)
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Client client) {
        return ResponseEntity.ok(clientService.save(client));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) {
        Optional<Client> client = clientService.findById(id);
        if (!client.isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(client.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @Valid @RequestBody Client client) {
        if (!clientService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(clientService.save(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        if (!clientService.findById(id).isPresent()) {
           // log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        clientService.deleteById(id);

        return ResponseEntity.ok().build();
    }
}
