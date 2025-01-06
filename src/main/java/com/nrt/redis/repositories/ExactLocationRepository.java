package com.nrt.redis.repositories;

import com.nrt.redis.entities.ExactLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExactLocationRepository extends JpaRepository<ExactLocation, Long> {
}
