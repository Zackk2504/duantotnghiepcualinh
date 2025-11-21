package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "lich_su_hoa_don")
public class LichSuHoaDon {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "trang_thai_cu", length = 50)
    private String trangThaiCu;

    @JsonProperty
    @Column(name = "trang_thai_moi", length = 50)
    private String trangThaiMoi;

    @JsonProperty
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "ngay_cap_nhat")
    private Instant ngayCapNhat;

    @JsonProperty
    @Column(name = "nguoi_cap_nhat", length = 100)
    private String nguoiCapNhat;

    @JsonProperty
    @Column(name = "ghi_chu", length = Integer.MAX_VALUE)
    private String ghiChu;

    @JsonProperty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_hoa_don")
    private HoaDon idHoaDon;

}