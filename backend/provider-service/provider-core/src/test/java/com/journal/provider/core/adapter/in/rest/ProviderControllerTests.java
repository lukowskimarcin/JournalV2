package com.journal.provider.core.adapter.in.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.core.application.port.in.RegisterProviderUseCase;
import com.journal.provider.core.domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.*;

@WebMvcTest
public class ProviderControllerTests {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private RegisterProviderUseCase registerProviderUseCase;

        @Autowired
        private ObjectMapper objectMapper;

        public void givenRegisterProviderCommand_whenRegisterProvider_thenReturnId() throws Exception {

                // Given
                RegisterProviderCommand command = RegisterProviderCommand.builder()
                                .login("login")
                                .password("password")
                                .url("url")
                                .server("server")
                                .build();

                Provider provider = Provider.builder()
                                .id("12345")
                                .build();

                given(registerProviderUseCase.register(any(RegisterProviderCommand.class)))
                                .willReturn(provider);

                // when
                // ResultActions response = mockMvc.perform(post("/api/v1/journal/providers"))

        }
}
