package com.journal.provider.core.adapter.out.mongo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Providers")
@Data
@Builder
public class ProviderMongoEntity {

    @Id
    private String id;
    private String login;
    private String password;
    private String url;
    private String server;
}
