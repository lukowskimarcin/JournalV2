package com.journal.provider.core.adapter.out.mongo;

import com.journal.provider.core.application.port.out.ProviderRepository;
import com.journal.provider.core.domain.Provider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProviderRepositoryMongoImpl implements ProviderRepository {

    private final ProviderMongoRepository providerMongoRepository;

    @Override
    public Provider save(Provider provider) {
        var mongoEntity = providerMongoRepository.save(ProviderMongoMapper.toMongoEntity(provider));
        return ProviderMongoMapper.toDomainEntity(mongoEntity);
    }

    @Override
    public Optional<Provider> findByLoginAndServer(String login, String server) {
        var mongoEntity = providerMongoRepository.findByLoginAndServer(login, server);
        return mongoEntity.map(ProviderMongoMapper::toDomainEntity);
    }
}
