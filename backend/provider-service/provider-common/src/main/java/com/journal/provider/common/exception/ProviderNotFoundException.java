package com.journal.provider.common.exception;

import com.journal.common.exception.DomainException;


public class ProviderNotFoundException extends DomainException {

    public ProviderNotFoundException(String message) {
        super(message);
    }
}
