package com.journal.account.core.adapter.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.account.common.command.RegisterAccountCommand;
import com.journal.account.core.application.port.in.RegisterAccountUseCase;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/journal")
@AllArgsConstructor
public class AccountController {

    private final RegisterAccountUseCase registerAccountUseCase;

    @PostMapping("/accounts")
    public ResponseEntity<String> createAccount(@RequestBody RegisterAccountCommand command) {
        var account = registerAccountUseCase.register(command);
        return new ResponseEntity<>(account.getId(), HttpStatus.CREATED);
    }

}
