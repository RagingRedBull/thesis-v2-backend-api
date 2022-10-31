package com.thesis.backend.mapper;

import com.thesis.backend.model.dto.DetectorUnitLogDto;
import com.thesis.backend.model.entity.DetectorUnitLog;
import org.mapstruct.Mapper;

import java.util.Set;
import java.util.stream.Stream;

@Mapper(componentModel = "spring")
public interface DetectorUnitLogMapper {
    DetectorUnitLogDto toDto(DetectorUnitLog entity);
    Set<DetectorUnitLogDto> toDto(Stream<DetectorUnitLog> stream);
}
