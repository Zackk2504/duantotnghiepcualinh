package org.example.backend.repository;

import org.example.backend.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface VoucherRepository extends JpaRepository<Voucher, Integer> {
}