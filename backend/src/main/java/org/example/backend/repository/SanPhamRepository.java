package org.example.backend.repository;

import org.example.backend.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}