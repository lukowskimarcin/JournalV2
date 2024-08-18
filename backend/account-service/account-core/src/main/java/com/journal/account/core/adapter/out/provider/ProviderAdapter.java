package com.journal.account.core.adapter.out.provider;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.journal.account.core.application.port.out.ProviderConnector;
import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.common.dto.SafeProvider;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProviderAdapter implements ProviderConnector {

    @Override
    public SafeProvider registerProvider(RegisterProviderCommand command) {
        var webClient = new RestTemplate();


        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerProvider'");
    }

    @Override
    public SafeProvider getProviderById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProviderById'");
    }

    @Override
    public List<SafeProvider> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
