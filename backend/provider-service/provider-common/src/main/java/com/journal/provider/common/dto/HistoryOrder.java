package com.journal.provider.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HistoryOrder {
    private Long ticket;

    @JsonProperty("time_setup")
    private Long timeSetup;

    @JsonProperty("time_done")
    private Long timeDone;

    private Integer type;

    private Integer reason;

    @JsonProperty("type_time")
    private Integer typeTime;

    @JsonProperty("type_filling")
    private Integer typeFilling;

    private Integer state;

    @JsonProperty("position_id")
    private Long positionId;

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
