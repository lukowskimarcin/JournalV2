package com.journal.account.core.application.port.out;

import java.util.List;

import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.common.dto.SafeProvider;

//Do komunikacji z providerem....
public interface ProviderConnector {

    // tworzenie
    SafeProvider registerProvider(RegisterProviderCommand command);

    SafeProvider getProviderById(String id);

    List<SafeProvider> findAll();

    // pobieranie danych o wykresach

}
