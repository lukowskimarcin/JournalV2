package com.journal.provider.common.exception;

import com.journal.common.exception.DomainException;

public class ProviderNotFoundException extends DomainException {

    public ProviderNotFoundException(String id) {
        super("Provider id: " + id + " was not found");
    }
}
