package com.journal.provider.core.adapter.in.rest;

import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.core.application.port.in.RegisterProviderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/journal")
@AllArgsConstructor
public class ProviderController {

    private final RegisterProviderUseCase registerProviderUseCase;

    @PostMapping("/providers")
    public ResponseEntity<String> registerProvider(@RequestBody RegisterProviderCommand command) {
        var provider = registerProviderUseCase.register(command);
        return new ResponseEntity<>(provider.getId(), HttpStatus.CREATED);
    }

}
