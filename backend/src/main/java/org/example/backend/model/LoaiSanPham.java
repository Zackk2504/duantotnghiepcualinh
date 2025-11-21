package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "ma_loai_san_pham", length = 50)
    private String maLoaiSanPham;

    @JsonProperty
    @Column(name = "ten_loai_san_pham", length = 100)
    private String tenLoaiSanPham;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}