package com.journal.provider.core.application.port.in;

import java.util.List;
import java.util.Optional;

import com.journal.provider.core.domain.Provider;

public interface FindProviderUseCase {

    Optional<Provider> findById(String id);

    List<Provider> findAll();

}
