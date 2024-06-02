package com.journal.provider.common.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CandleStick {
    private Long time;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long tickVolume;
    private Long spread;
    private Long realVolume;
}
