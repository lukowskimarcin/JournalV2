package com.journal.account.common.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterAccountCommand {
    private String login;
    private String password;
    private String server;
    private String providerUrl;
}
