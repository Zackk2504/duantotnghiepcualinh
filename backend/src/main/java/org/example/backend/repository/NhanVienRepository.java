package org.example.backend.repository;

import org.example.backend.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}