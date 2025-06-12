package com.gitrebase.gitrebasepc1.Models.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String descripcion;
    @Column
    private double precio;
    @Column
    private int stock;
    @JsonIgnoreProperties(value = { "categoria", "hibernateLazyInitializer", "handler" }, allowSetters = true)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Producto> productos; // Relación uno a muchos con Producto
}
