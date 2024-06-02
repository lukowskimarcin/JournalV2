package com.journal.provider.core.adapter.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProviderMongoRepository extends MongoRepository<ProviderMongoEntity, String> {

    Optional<ProviderMongoEntity> findByLoginAndServer(String login, String server);
}
