package org.example.backend.repository;

import org.example.backend.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}