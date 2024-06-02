package com.journal.provider.core.application.service;


import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.common.exception.ProviderAlreadyExistsException;
import com.journal.provider.core.application.port.out.ProviderRepository;
import com.journal.provider.core.domain.Provider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class RegisterProviderServiceTests {

    @Mock
    private ProviderRepository providerRepository;

    @InjectMocks
    private RegisterProviderService providerService;

    private RegisterProviderCommand command;

    private Provider param;
    private Provider result;

    @BeforeEach
    public void setup() {
        command = RegisterProviderCommand.builder()
                .login("login")
                .password("password")
                .url("url")
                .server("server")
                .build();

        param = Provider.builder()
                .login("login")
                .password("password")
                .url("url")
                .server("server")
                .build();

        result = Provider.builder()
                .id("id")
                .login("login")
                .password("password")
                .url("url")
                .server("server")
                .build();
    }

    @Test
    public void givenRegisterProviderCommand_whenRegister_thenReturnProvider() {
        given(providerRepository.findByLoginAndServer(command.getLogin(), command.getServer()))
                .willReturn(Optional.empty());
        given(providerRepository.save(param))
                .willReturn(result);

        Provider provider = providerService.register(command);

        assertThat(provider).isNotNull();
    }

    @Test
    public void givenExistingProvider_whenRegister_thenThrowsException() {
        given(providerRepository.findByLoginAndServer(command.getLogin(), command.getServer()))
                .willReturn(Optional.of(result));

        assertThrows(ProviderAlreadyExistsException.class, () -> {
            providerService.register(command);
        });

        verify(providerRepository, never()).save(any(Provider.class));
    }
}
