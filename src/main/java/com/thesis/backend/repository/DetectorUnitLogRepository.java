package com.thesis.backend.repository;

import com.thesis.backend.model.entity.DetectorUnitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface DetectorUnitLogRepository extends JpaRepository<DetectorUnitLog, Long> {
    @Query(value = "SELECT dlog FROM DetectorUnitLog dlog")
    Stream<DetectorUnitLog> findAllAsStream();

    @Query(value = "SELECT dlog FROM DetectorUnitLog dlog WHERE dlog.macAddress = ?1")
    Stream<DetectorUnitLog> findAllByMacAddress(String macAddress);
}
