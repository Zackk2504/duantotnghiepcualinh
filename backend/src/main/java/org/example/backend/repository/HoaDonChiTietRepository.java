package org.example.backend.repository;

import org.example.backend.model.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, Integer> {
}