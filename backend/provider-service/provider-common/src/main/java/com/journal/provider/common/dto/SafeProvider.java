package com.journal.provider.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SafeProvider {
    private Long id;
    private String login;
    private String url;
    private String name;
    private String server;
    private Boolean active;
}
