package org.example.backend.repository;

import org.example.backend.model.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham, Integer> {
}