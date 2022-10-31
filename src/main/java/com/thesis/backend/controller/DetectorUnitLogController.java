package com.thesis.backend.controller;

import com.thesis.backend.model.dto.DetectorUnitLogDto;
import com.thesis.backend.model.entity.DetectorUnitLog;
import com.thesis.backend.service.DetectorUnitLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = {"/log"})
@RequiredArgsConstructor
public class DetectorUnitLogController {
    private final DetectorUnitLogService detectorUnitLogService;
    @GetMapping
    public Collection<DetectorUnitLogDto> getAllLogs() {
        return detectorUnitLogService.findAll();
    }
    @GetMapping(path = "/{id}")
    public DetectorUnitLogDto findById(@PathVariable Long id) {
        return detectorUnitLogService.findById(id);
    }
    @GetMapping(params = {"macAddress"})
    public Collection<DetectorUnitLogDto> findAllByMacAddress(@RequestParam String macAddress) {
        return detectorUnitLogService.findAllByMacAddress(macAddress);
    }
}
