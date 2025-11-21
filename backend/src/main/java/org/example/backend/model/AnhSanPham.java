package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "anh_san_pham")
public class AnhSanPham {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonProperty
    @JoinColumn(name = "id_san_pham")
    private SanPham idSanPham;

    @Column(name = "url", length = Integer.MAX_VALUE)
    @JsonProperty
    private String url;

}