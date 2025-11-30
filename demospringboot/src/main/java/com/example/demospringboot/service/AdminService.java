package com.example.demospringboot.service;

import com.example.demospringboot.entity.Admin;
import com.example.demospringboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
    
    public Admin loginAdmin(String username, String rawPassword) {
        // 1. Cari Admin berdasarkan username
        Admin admin = adminRepository.findByUsername(username)
            .orElse(null); 

        if (admin != null) {
            // 2. Verifikasi Password: Membandingkan rawPassword dengan password dari database (TANPA HASHING)
            if (rawPassword.equals(admin.getPassword())) {
                return admin; // Login berhasil
            }
        }
        return null; // Login gagal (user tidak ditemukan atau password salah)
    }
}