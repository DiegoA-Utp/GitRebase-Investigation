package com.gitrebase.gitrebasepc1.Models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    private String apellidos;

    private String email;

    private String telefono;

    private String direccion;

    private String dni;

    private LocalDate fechaNacimiento;
}
