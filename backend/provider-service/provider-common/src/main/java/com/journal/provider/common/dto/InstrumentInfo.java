package com.journal.provider.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InstrumentInfo {
    private Double ask;

    private Double askhigh;

    private Double asklow;

    private String bank;

    private String basis;

    private Double bid;

    private Double bidhigh;

    private Double bidlow;

    private String category;

    @JsonProperty("chart_mode")
    private Integer chartMode;

    @JsonProperty("currency_base")
    private String currencyBase;

    @JsonProperty("currency_margin")
    private String currencyMargin;

    @JsonProperty("currency_profit")
    private String currencyProfit;

    private Boolean custom;

    private String description;

    private Integer digits;

    private String exchange;

    @JsonProperty("expiration_mode")
    private Integer expirationMode;

    @JsonProperty("expiration_time")
    private Integer expirationTime;

    @JsonProperty("filling_mode")
    private Integer fillingMode;

    private String formula;

    private String isin;

    private Double last;

    private Double lasthigh;

    private Double lastlow;

    @JsonProperty("margin_hedged")
    private Double marginHedged;

    @JsonProperty("margin_hedged_use_leg")
    private Boolean marginHedgedUseLeg;

    @JsonProperty("margin_initial")
    private Double marginInitial;

    @JsonProperty("margin_maintenance")
    private Double marginMaintenance;

    private String name;

    @JsonProperty("option_mode")
    private Integer optionMode;

    @JsonProperty("option_right")
    private Integer optionRight;

    @JsonProperty("option_strike")
    private Double optionStrike;

    @JsonProperty("order_gtc_mode")
    private Integer orderGtcMode;

    @JsonProperty("order_mode")
    private Integer orderMode;

    private String page;

    private String path;

    private Double point;

    @JsonProperty("price_change")
    private Double priceChange;

    @JsonProperty("price_greeks_delta")
    private Double priceGreeksDelta;

    @JsonProperty("price_greeks_gamma")
    private Double priceGreeksGamma;

    @JsonProperty("price_greeks_omega")
    private Double priceGreeksOmega;

    @JsonProperty("price_greeks_rho")
    private Double priceGreeksRho;

    @JsonProperty("price_greeks_theta")
    private Double priceGreeksTheta;

    @JsonProperty("price_greeks_vega")
    private Double priceGreeksVega;

    @JsonProperty("price_sensitivity")
    private Double priceSensitivity;

    @JsonProperty("price_theoretical")
    private Double priceTheoretical;

    @JsonProperty("price_volatility")
    private Double priceVolatility;

    private Boolean select;

    @JsonProperty("session_aw")
    private Double sessionAw;

    @JsonProperty("session_buy_orders")
    private Integer sessionBuyOrders;

    @JsonProperty("session_buy_orders_volume")
    private Double sessionBuyOrdersVolume;

    @JsonProperty("session_close")
    private Double sessionClose;

    @JsonProperty("session_deals")
    private Integer sessionDeals;

    @JsonProperty("session_interest")
    private Double sessionInterest;

    @JsonProperty("session_open")
    private Double sessionOpen;

    @JsonProperty("session_price_limit_max")
    private Double sessionPriceLimitMax;

    @JsonProperty("session_price_limit_min")
    private Double sessionPriceLimitMin;

    @JsonProperty("session_price_settlement")
    private Double sessionPriceSettlement;

    @JsonProperty("session_sell_orders")
    private Integer sessionSellOrders;

    @JsonProperty("session_sell_orders_volume")
    private Double sessionSellOrdersVolume;

    @JsonProperty("session_turnover")
    private Double sessionTurnover;

    @JsonProperty("session_volume")
    private Double sessionVolume;

    private Integer spread;

    @JsonProperty("spread_float")
    private Boolean spreadFloat;

    @JsonProperty("start_time")
    private Integer startTime;

    @JsonProperty("swap_long")
    private Double swapLong;

    @JsonProperty("swap_mode")
    private Integer swapMode;

    @JsonProperty("swap_rollover3days")
    private Integer swapRollover3days;

    @JsonProperty("swap_short")
    private Double swapShort;

    @JsonProperty("ticks_bookdepth")
    private Integer ticksBookdepth;

    private Integer time;

    @JsonProperty("trade_accrued_interest")
    private Double tradeAccruedInterest;

    @JsonProperty("trade_calc_mode")
    private Integer tradeCalcMode;

    @JsonProperty("trade_contract_size")
    private Double tradeContractSize;

    @JsonProperty("trade_exemode")
    private Integer tradeExemode;

    @JsonProperty("trade_face_value")
    private Double tradeFaceValue;

    @JsonProperty("trade_freeze_level")
    private Integer tradeFreezeLevel;

    @JsonProperty("trade_liquidity_rate")
    private Double tradeLiquidityRate;

    @JsonProperty("trade_mode")
    private Integer tradeMode;

    @JsonProperty("trade_stops_level")
    private Integer tradeStopsLevel;

    @JsonProperty("trade_tick_size")
    private Double tradeTickSize;

    @JsonProperty("trade_tick_value")
    private Double tradeTickValue;

    @JsonProperty("trade_tick_value_loss")
    private Double tradeTickValueLoss;

    @JsonProperty("trade_tick_value_profit")
    private Double tradeTickValueProfit;

    private Boolean visible;

    private Integer volume;

    @JsonProperty("volume_limit")
    private Double volumeLimit;

    @JsonProperty("volume_max")
    private Double volumeMax;

    @JsonProperty("volume_min")
    private Double volumeMin;

    @JsonProperty("volume_real")
    private Double volumeReal;

    @JsonProperty("volume_step")
    private Double volumeStep;

    private Integer volumehigh;

    @JsonProperty("volumehigh_real")
    private Double volumehighReal;

    private Integer volumelow;

    @JsonProperty("volumelow_real")
    private Double volumelowReal;
}
