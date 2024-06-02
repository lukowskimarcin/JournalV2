package com.journal.provider.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Position {
    private Long ticket;

    private Long time;

    @JsonProperty("time_update")
    private Long timeUpdate;

    private Integer type;

    private Double volume;

    @JsonProperty("price_open")
    private Double priceOpen;

    private Double sl;

    private Double tp;

    @JsonProperty("price_current")
    private Double priceCurrent;

    private Double swap;

    private Double profit;

    private String symbol;

    private String comment;

    private String external_id;
}
