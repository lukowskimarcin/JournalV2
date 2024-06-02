package com.journal.provider.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountInfo {
    private Long login;

    @JsonProperty("trade_mode")
    private Integer tradeMode;

    private Integer leverage;

    @JsonProperty("limit_orders")
    private Integer limitOrders;

    @JsonProperty("margin_so_mode")
    private Integer marginSoMode;

    @JsonProperty("trade_allowed")
    private Boolean tradeAllowed;

    @JsonProperty("trade_expert")
    private Boolean tradeExpert;

    @JsonProperty("margin_mode")
    private Integer marginMode;

    @JsonProperty("currency_digits")
    private Integer currencyDigits;

    @JsonProperty("fifo_close")
    private Boolean fifoClose;

    private Double balance;

    private Double credit;

    private Double profit;

    private Double equity;

    private Double margin;

    @JsonProperty("margin_free")
    private Double marginFree;

    @JsonProperty("margin_level")
    private Double marginLevel;

    @JsonProperty("margin_so_call")
    private Double marginSoCall;

    @JsonProperty("margin_so_so")
    private Double marginSoSo;

    @JsonProperty("margin_initial")
    private Double marginInitial;

    @JsonProperty("margin_maintenance")
    private Double marginMaintenance;

    private Double assets;

    private Double liabilities;

    @JsonProperty("commission_blocked")
    private Double commissionBlocked;

    private String name;

    private String server;

    private String currency;

    private String company;
}
