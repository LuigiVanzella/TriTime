package com.tritime.repository;

import com.tritime.model.TrainingZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingZoneRepository extends JpaRepository<TrainingZone, Long> {
    // Aqui você pode criar consultas personalizadas se precisar, por exemplo:
    // List<TrainingZone> findByUserId(Long userId);
}
