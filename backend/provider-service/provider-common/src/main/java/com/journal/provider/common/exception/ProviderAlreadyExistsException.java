package com.journal.provider.common.exception;

import com.journal.common.exception.DomainException;

public class ProviderAlreadyExistsException extends DomainException {
    public ProviderAlreadyExistsException(String message) {
        super(message);
    }
}
