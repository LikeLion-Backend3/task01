package org.example.hw01.data.repository;

import org.example.hw01.data.entity.BabyLion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BabyLionRepository extends JpaRepository<BabyLion, Long> {
    Optional<BabyLion> findByEmail(String email);
}
