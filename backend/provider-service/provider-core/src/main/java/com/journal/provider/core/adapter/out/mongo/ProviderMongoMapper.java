package com.journal.provider.core.adapter.out.mongo;

import com.journal.provider.core.domain.Provider;

public final class ProviderMongoMapper {

    private ProviderMongoMapper(){

    }

    public static ProviderMongoEntity toMongoEntity(Provider provider) {

        return ProviderMongoEntity.builder()
                .id(provider.getId())
                .login(provider.getLogin())
                .password(provider.getPassword())
                .url(provider.getUrl())
                .server(provider.getServer())
                .build();
    }

    public static Provider toDomainEntity(ProviderMongoEntity entity) {
        return Provider.builder()
                .id(entity.getId())
                .login(entity.getLogin())
                .password(entity.getPassword())
                .url(entity.getUrl())
                .server(entity.getServer())
                .build();
    }
}
