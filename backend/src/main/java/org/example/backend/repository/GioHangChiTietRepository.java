package org.example.backend.repository;

import org.example.backend.model.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, Integer> {
}