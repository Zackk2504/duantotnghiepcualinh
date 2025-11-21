package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien idNhanVien;

    @JsonProperty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_voucher")
    private Voucher idVoucher;

    @JsonProperty
    @Column(name = "gia_tri_thanh_toan", precision = 10, scale = 2)
    private BigDecimal giaTriThanhToan;

    @JsonProperty
    @Column(name = "thanh_tien", precision = 10, scale = 2)
    private BigDecimal thanhTien;

    @JsonProperty
    @Column(name = "hinh_thuc_thanh_toan", length = 50)
    private String hinhThucThanhToan;

    @JsonProperty
    @Column(name = "trang_thai_hoa_don", length = 50)
    private String trangThaiHoaDon;

    @JsonProperty
    @Column(name = "dia_chi_nhan_hang")
    private String diaChiNhanHang;

    @JsonProperty
    @Column(name = "ten_nguoi_nhan", length = 100)
    private String tenNguoiNhan;

    @JsonProperty
    @Column(name = "sdt_nguoi_nhan", length = 20)
    private String sdtNguoiNhan;

    @JsonProperty
    @Column(name = "loai_hoa_don", length = 50)
    private String loaiHoaDon;

    @JsonProperty
    @Column(name = "ghi_chu", length = Integer.MAX_VALUE)
    private String ghiChu;

    @JsonProperty
    @Column(name = "ten_nguoi_mua", length = 100)
    private String tenNguoiMua;

    @JsonProperty
    @Column(name = "sdt_nguoi_mua", length = 20)
    private String sdtNguoiMua;

    @JsonProperty
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_tao")
    private Instant ngayTao;

    @JsonProperty
    @Column(name = "tien_tra_sau", precision = 10, scale = 2)
    private BigDecimal tienTraSau;

}