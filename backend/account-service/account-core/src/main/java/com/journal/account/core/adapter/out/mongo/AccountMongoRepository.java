package com.journal.account.core.adapter.out.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountMongoRepository extends MongoRepository<AccountMongoEntity, String> {

}
