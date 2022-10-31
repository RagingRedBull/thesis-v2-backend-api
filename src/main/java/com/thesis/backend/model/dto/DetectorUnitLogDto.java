package com.thesis.backend.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DetectorUnitLogDto {
    private Long id;
    private String macAddress;
    private LocalDateTime timeRecorded;
}
