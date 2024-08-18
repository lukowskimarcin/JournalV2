package com.journal.provider.core.adapter.in.rest;

import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.common.dto.SafeProvider;
import com.journal.provider.common.exception.ProviderNotFoundException;
import com.journal.provider.core.application.port.in.FindProviderUseCase;
import com.journal.provider.core.application.port.in.RegisterProviderUseCase;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "/api/v1/journal")
@AllArgsConstructor
public class ProviderController {
    private final RegisterProviderUseCase registerProviderUseCase;
    private final FindProviderUseCase findProviderUseCase;

    @PostMapping("/providers")
    public ResponseEntity<SafeProvider> registerProvider(@RequestBody RegisterProviderCommand command) {
        var provider = registerProviderUseCase.register(command);
        return new ResponseEntity<>(ProviderDtoMapper.fromDomain(provider), HttpStatus.CREATED);
    }

    @GetMapping("/providers/{id}")
    public ResponseEntity<SafeProvider> getProviderById(@PathVariable String id) {
        var provider = findProviderUseCase.findById(id);
        return new ResponseEntity<>(
                provider.map(ProviderDtoMapper::fromDomain)
                        .orElseThrow(() -> new ProviderNotFoundException(id)),
                HttpStatus.OK);
    }

    @GetMapping("/providers")
    public ResponseEntity<List<SafeProvider>> findAll() {
        var providers = findProviderUseCase.findAll();
        return new ResponseEntity<>(
                providers.stream().map(ProviderDtoMapper::fromDomain).collect(Collectors.toList()),
                HttpStatus.OK);
    }

}
