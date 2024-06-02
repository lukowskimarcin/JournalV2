package com.journal.provider.core.adapter.in.rest;

import com.journal.provider.common.dto.SafeProvider;
import com.journal.provider.core.domain.Provider;

public final class ProviderDtoMapper {
    private ProviderDtoMapper() {
    }

    public static SafeProvider fromDomain(Provider provider) {
        return SafeProvider.builder()
                .id(provider.getId())
                .login(provider.getLogin())
                .url(provider.getUrl())
                .server(provider.getServer())
                .build();
    }

}
