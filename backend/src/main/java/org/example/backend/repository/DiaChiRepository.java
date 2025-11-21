package org.example.backend.repository;

import org.example.backend.model.DiaChi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface DiaChiRepository extends JpaRepository<DiaChi, Integer> {
}