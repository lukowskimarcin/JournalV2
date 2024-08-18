package com.journal.provider.core.adapter.out.mt5;

import org.springframework.stereotype.Service;

import com.journal.provider.common.exception.ProviderNotFoundException;
import com.journal.provider.core.application.port.out.MT5Connector;
import com.journal.provider.core.application.port.out.ProviderRepository;
import com.journal.provider.core.domain.Provider;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MT5ConnectorAdapter implements MT5Connector {

    private final ProviderRepository providerRepository;

    private Provider getProviderById(String id) {
        return providerRepository.findById(id)
                .orElseThrow(() -> new ProviderNotFoundException(id));
    }

}
