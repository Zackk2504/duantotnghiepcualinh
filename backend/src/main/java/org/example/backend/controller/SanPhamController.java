package org.example.backend.controller;

import org.example.backend.model.LoaiSanPham;
import org.example.backend.model.SanPham;
import org.example.backend.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SanPhamController {
    @Autowired
    SanPhamService  sanPhamService;

    @GetMapping("/San-Pham")
    public List<SanPham> listAll(){
        return sanPhamService.listAllsp();
    }

    @GetMapping("/api/loai-sp")
    public List<LoaiSanPham> listLoaiSanPham(){
        return sanPhamService.listLoaiSanPham();
    }
}
