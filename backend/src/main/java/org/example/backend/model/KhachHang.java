package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "ho_ten", length = 100)
    private String hoTen;

    @JsonProperty
    @Column(name = "gioi_tinh", length = 10)
    private String gioiTinh;

    @JsonProperty
    @Column(name = "so_dt", length = 20)
    private String soDt;

    @JsonProperty
    @Column(name = "email", length = 100)
    private String email;

    @JsonProperty
    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @JsonProperty
    @Column(name = "ten_dang_nhap", length = 50)
    private String tenDangNhap;

    @JsonProperty
    @Column(name = "mat_khau", length = 100)
    private String matKhau;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

    @JsonProperty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dia_chi")
    private DiaChi idDiaChi;

}