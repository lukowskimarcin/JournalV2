package com.journal.provider.core.adapter.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ProviderMongoRepository extends MongoRepository<ProviderMongoEntity, String> {

    Optional<ProviderMongoEntity> findByLoginAndServer(String login, String server);

    @SuppressWarnings("null")
    Optional<ProviderMongoEntity> findById(@NonNull String id);

    @SuppressWarnings("null")
    List<ProviderMongoEntity> findAll();
}
