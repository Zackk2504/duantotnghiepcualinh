package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_loai_san_pham")
    private LoaiSanPham idLoaiSanPham;

    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_xuat_xu")
    private XuatXu idXuatXu;

    @JsonProperty
    @Column(name = "ma_san_pham", length = 50)
    private String maSanPham;

    @JsonProperty
    @Column(name = "ten_san_pham", length = 100)
    private String tenSanPham;

    @JsonProperty
    @Column(name = "mo_ta", length = Integer.MAX_VALUE)
    private String moTa;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}