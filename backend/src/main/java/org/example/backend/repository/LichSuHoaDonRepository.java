package org.example.backend.repository;

import org.example.backend.model.LichSuHoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface LichSuHoaDonRepository extends JpaRepository<LichSuHoaDon, Integer> {
}