package com.journal.account.core.domain.aggregate;

import com.journal.common.domain.Aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Aggregate
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String id;

    private Long providerId;
    private Long lastScanTime;
    private String accountLogin;

    private Double balance;
    private Double equity;
    private Double marginFree;
    private Double marginLevel;

}
