package org.example.backend.repository;

import org.example.backend.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface SizeRepository extends JpaRepository<Size, Integer> {
}