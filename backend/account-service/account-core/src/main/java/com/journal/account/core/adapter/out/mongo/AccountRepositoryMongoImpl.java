package com.journal.account.core.adapter.out.mongo;

import org.springframework.stereotype.Service;

import com.journal.account.core.application.port.out.AccountRepository;
import com.journal.account.core.domain.aggregate.Account;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountRepositoryMongoImpl implements AccountRepository {

    private final AccountMongoRepository accountMongoRepository;

    @Override
    public Account save(Account account) {
        var mongoEntity = accountMongoRepository.save(AccountMongoMapper.toMongoEntity(account));
        return AccountMongoMapper.toDomainEntity(mongoEntity);
    }

}
