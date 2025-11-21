package org.example.backend.repository;

import org.example.backend.model.SanPhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface SanPhamChiTietRepository extends JpaRepository<SanPhamChiTiet, Integer> {

}