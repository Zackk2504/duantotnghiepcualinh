package org.example.backend.repository;

import org.example.backend.model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface GioHangRepository extends JpaRepository<GioHang, Integer> {
}