package com.journal.account.core.application.port.in;

import com.journal.account.common.command.RegisterAccountCommand;
import com.journal.account.core.domain.aggregate.Account;

public interface RegisterAccountUseCase {

    Account register(RegisterAccountCommand command);
}
