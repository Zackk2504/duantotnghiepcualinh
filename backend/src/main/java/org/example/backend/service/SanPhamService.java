package org.example.backend.service;

import org.example.backend.model.LoaiSanPham;
import org.example.backend.model.SanPham;
import org.example.backend.model.SanPhamChiTiet;
import org.example.backend.repository.LoaiSanPhamRepository;
import org.example.backend.repository.SanPhamChiTietRepository;
import org.example.backend.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Autowired
    private SanPhamChiTietRepository sanPhamChiTietRepository;

    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;

    public List<SanPham> listAllsp(){
      return sanPhamRepository.findAll();
    }

    public List<LoaiSanPham> listLoaiSanPham(){
        return loaiSanPhamRepository.findAll();
    }
}
