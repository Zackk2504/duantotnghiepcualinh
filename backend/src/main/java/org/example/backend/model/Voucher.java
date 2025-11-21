package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "voucher")
public class Voucher {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "ma_voucher", length = 50)
    private String maVoucher;

    @JsonProperty
    @Column(name = "ten_voucher", length = 100)
    private String tenVoucher;

    @JsonProperty
    @Column(name = "gia_tri_voucher", precision = 10, scale = 2)
    private BigDecimal giaTriVoucher;

    @JsonProperty
    @Column(name = "gia_tri_toi_da_voucher", precision = 10, scale = 2)
    private BigDecimal giaTriToiDaVoucher;

    @JsonProperty
    @Column(name = "gia_tri_toi_thieu_ap_dung", precision = 10, scale = 2)
    private BigDecimal giaTriToiThieuApDung;

    @JsonProperty
    @Column(name = "so_luong_voucher")
    private Integer soLuongVoucher;

    @JsonProperty
    @Column(name = "so_luong_con_lai")
    private Integer soLuongConLai;

    @JsonProperty
    @Column(name = "ngay_bat_dau")
    private LocalDate ngayBatDau;

    @JsonProperty
    @Column(name = "ngay_ket_thuc")
    private LocalDate ngayKetThuc;

    @JsonProperty
    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @JsonProperty
    @Column(name = "hinh_thuc_giam", length = 50)
    private String hinhThucGiam;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}