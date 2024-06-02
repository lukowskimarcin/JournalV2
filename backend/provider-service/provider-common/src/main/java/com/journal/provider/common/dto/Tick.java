package com.journal.provider.common.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tick {
    private Double ask;
    private Double bid;
    private Integer flags;
    private Double last;
    private Long time;
    private Long time_msc;
    private Integer volume;
    private Double volume_real;
}
