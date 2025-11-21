package org.example.backend.repository;

import org.example.backend.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
}