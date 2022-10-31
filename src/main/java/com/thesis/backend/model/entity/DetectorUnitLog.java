package com.thesis.backend.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class DetectorUnitLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "mac_address", length = 17, nullable = false)
    private String macAddress;
    @Column(name = "time_recorded")
    private LocalDateTime timeRecorded;

}
