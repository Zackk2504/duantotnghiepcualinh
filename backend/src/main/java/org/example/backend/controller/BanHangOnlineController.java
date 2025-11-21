package org.example.backend.controller;


import org.example.backend.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanHangOnlineController {
@Autowired
    SanPhamService sanPhamService;

    // Endpoint công khai
    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "Public content, không cần auth";
    }



    // Endpoint chỉ cho ROLE_ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/api/admin")
    public String adminEndpoint() {
        return "Hello Admin, bạn có quyền ADMIN";
    }

    @GetMapping("/test-auth")
    public Object testAuth(Authentication auth) {
        return auth.getAuthorities();
    }
}

