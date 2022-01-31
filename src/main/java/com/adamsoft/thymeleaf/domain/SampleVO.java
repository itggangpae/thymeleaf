package com.adamsoft.thymeleaf.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class SampleVO {
    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}

