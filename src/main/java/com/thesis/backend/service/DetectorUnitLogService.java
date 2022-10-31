package com.thesis.backend.service;

import com.thesis.backend.mapper.DetectorUnitLogMapper;
import com.thesis.backend.model.dto.DetectorUnitLogDto;
import com.thesis.backend.model.entity.DetectorUnitLog;
import com.thesis.backend.repository.DetectorUnitLogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Log4j2
public class DetectorUnitLogService {
    private final DetectorUnitLogRepository detectorUnitLogRepository;
    private final DetectorUnitLogMapper detectorUnitLogMapper;
    public Set<DetectorUnitLogDto> findAll() {
        try(Stream<DetectorUnitLog> detectorUnitLogStream = detectorUnitLogRepository.findAllAsStream()) {
            return detectorUnitLogMapper.toDto(detectorUnitLogStream);
        } catch (Exception e) {
            log.info(e.getMessage());
        }
        return new LinkedHashSet<>();
    }

    public DetectorUnitLogDto findById(Long id) {
        return detectorUnitLogMapper.toDto(detectorUnitLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no id")));
    }

    public Collection<DetectorUnitLogDto> findAllByMacAddress(String macAddress) {
        return detectorUnitLogMapper.toDto(detectorUnitLogRepository.findAllByMacAddress(macAddress));
    }
}
