package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "so_nha")
    @JsonProperty
    private String soNha;

    @Column(name = "quan_huyen_xa_thanh_pho")
    @JsonProperty
    private String quanHuyenXaThanhPho;

}