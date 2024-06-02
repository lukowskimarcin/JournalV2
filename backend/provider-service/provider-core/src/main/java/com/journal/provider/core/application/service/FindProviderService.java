package com.journal.provider.core.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.journal.provider.core.application.port.in.FindProviderUseCase;
import com.journal.provider.core.application.port.out.ProviderRepository;
import com.journal.provider.core.domain.Provider;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FindProviderService implements FindProviderUseCase {

    private final ProviderRepository providerRepository;

    @Override
    public Optional<Provider> findById(String id) {
        return providerRepository.findById(id);
    }

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }
}
