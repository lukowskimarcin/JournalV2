package com.journal.provider.core.application.service;

import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.common.exception.ProviderAlreadyExistsException;
import com.journal.provider.core.application.port.in.RegisterProviderUseCase;
import com.journal.provider.core.application.port.out.ProviderRepository;
import com.journal.provider.core.domain.Provider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class RegisterProviderService implements RegisterProviderUseCase {

    private final ProviderRepository providerRepository;

    @Override
    public Provider register(RegisterProviderCommand command) {
        var provider = Provider.builder()
                .login(command.getLogin())
                .password(command.getPassword())
                .url(command.getUrl())
                .server(command.getServer())
                .build();

        var providerFromDatabase = providerRepository.findByLoginAndServer(command.getLogin(), command.getServer());
        if(providerFromDatabase.isPresent()) {
            throw new ProviderAlreadyExistsException("Provider for: " + command.getLogin() + ", server: " + command.getServer() + " - already exists");
        }

        return  providerRepository.save(provider);

    }
}
