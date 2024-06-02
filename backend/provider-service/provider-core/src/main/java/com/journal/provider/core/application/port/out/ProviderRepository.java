package com.journal.provider.core.application.port.out;

import com.journal.provider.core.domain.Provider;

import java.util.Optional;

public interface ProviderRepository {

    Provider save(Provider provider);

    Optional<Provider> findByLoginAndServer(String login, String server);
}
