package com.padre.cliente.infrastructure.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Cliente {
    private String id;
    private String nombre;
}
