package org.example.backend.repository;

import org.example.backend.model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface MauSacRepository extends JpaRepository<MauSac, Integer> {
}