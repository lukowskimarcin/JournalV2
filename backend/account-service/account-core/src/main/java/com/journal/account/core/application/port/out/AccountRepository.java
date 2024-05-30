package com.journal.account.core.application.port.out;

import com.journal.account.core.domain.aggregate.Account;

public interface AccountRepository {

    Account save(Account account);
}
