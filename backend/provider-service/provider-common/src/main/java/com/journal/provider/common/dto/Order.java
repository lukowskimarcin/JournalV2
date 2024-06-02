package com.journal.provider.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private Long ticket;

    @JsonProperty("time_setup")
    private Long timeSetup;

    private Integer type;

    @JsonProperty("type_time")
    private Integer typeTime;

    @JsonProperty("type_filling")
    private Integer typeFilling;

    @JsonProperty("volume_initial")
    private Double volumeInitial;

    @JsonProperty("volume_current")
    private Double volumeCurrent;

    @JsonProperty("price_open")
    private Double priceOpen;

    private Double sl;

    private Double tp;

    @JsonProperty("price_current")
    private Double priceCurrent;

    @JsonProperty("price_stoplimit")
    private Double priceStopLimit;

    private String symbol;

    private String comment;

    private String external_id;
}
