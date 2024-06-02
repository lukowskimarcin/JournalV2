package com.journal.account.core.application.service;

import org.springframework.stereotype.Service;

import com.journal.account.common.command.RegisterAccountCommand;
import com.journal.account.core.application.port.in.RegisterAccountUseCase;
import com.journal.account.core.application.port.out.AccountRepository;
import com.journal.account.core.domain.aggregate.Account;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegisterAccountService implements RegisterAccountUseCase {

    private final AccountRepository accountRepository;
    // Provider client....

    @Override
    public Account register(RegisterAccountCommand command) {
        // TODO
        Long providerId = null;

        var data = Account.builder()
                .accountLogin(command.getLogin())
                .providerId(providerId)
                .build();

        return accountRepository.save(data);
    }

}
