package com.padre.cliente.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="cliente")
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Genera un ID único para JPA
    @Column(name="id_cliente")
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="direccion")
    private String direccion;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    @Column(name="fecha_registro")
    private LocalDateTime fecha_registro;

}