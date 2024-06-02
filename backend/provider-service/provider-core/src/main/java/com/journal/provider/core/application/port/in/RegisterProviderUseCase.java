package com.journal.provider.core.application.port.in;

import com.journal.provider.common.command.RegisterProviderCommand;
import com.journal.provider.core.domain.Provider;

public interface RegisterProviderUseCase {
    Provider register(RegisterProviderCommand command);
}
