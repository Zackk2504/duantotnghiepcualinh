package org.example.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "size")
public class Size {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @JsonProperty
    @Column(name = "ma_size", length = 50)
    private String maSize;

    @JsonProperty
    @Column(name = "ten_size", length = 50)
    private String tenSize;

    @JsonProperty
    @ColumnDefault("true")
    @Column(name = "trang_thai")
    private Boolean trangThai;

}