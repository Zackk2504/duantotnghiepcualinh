package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "san_pham_chi_tiet")
public class SanPhamChiTiet {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_san_pham")
    private SanPham idSanPham;

    @JsonProperty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mau_sac")
    private MauSac idMauSac;

    @JsonProperty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_phien_ban")
    private Size idPhienBan;

    @JsonProperty
    @Column(name = "anh_sp", length = Integer.MAX_VALUE)
    private String anhSp;

    @JsonProperty
    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @JsonProperty
    @Column(name = "don_gia", precision = 10, scale = 2)
    private BigDecimal donGia;

    @JsonProperty
    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}