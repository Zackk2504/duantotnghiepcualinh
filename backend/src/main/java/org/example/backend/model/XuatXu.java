package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "xuat_xu")
public class XuatXu {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "ma_xuat_xu", length = 50)
    private String maXuatXu;

    @JsonProperty
    @Column(name = "noi_xuat_xu", length = 100)
    private String noiXuatXu;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}