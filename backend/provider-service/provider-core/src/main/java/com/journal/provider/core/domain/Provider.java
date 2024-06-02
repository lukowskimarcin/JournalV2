package com.journal.provider.core.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    private String id;
    private String login;
    private String password;
    private String url;
    private String server;
}
