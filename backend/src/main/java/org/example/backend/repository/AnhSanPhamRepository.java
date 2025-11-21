package org.example.backend.repository;

import org.example.backend.model.AnhSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface AnhSanPhamRepository extends JpaRepository<AnhSanPham, Integer> {
}