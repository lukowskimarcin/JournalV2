package com.journal.provider.common.command;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterProviderCommand {
    private String login;
    private String password;
    private String url;
    private String server;
}
