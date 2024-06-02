package com.journal.provider.core.application.port.out;

import com.journal.provider.core.domain.Provider;

import java.util.List;
import java.util.Optional;

public interface ProviderRepository {

    Provider save(Provider provider);

    Optional<Provider> findByLoginAndServer(String login, String server);

    Optional<Provider> findById(String id);

    List<Provider> findAll();

}
