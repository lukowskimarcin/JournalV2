package com.journal.provider.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SafeProvider {
    private String id;
    private String login;
    private String url;
    private String server;
}
