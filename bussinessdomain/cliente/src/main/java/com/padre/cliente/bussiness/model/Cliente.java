package com.padre.cliente.bussiness.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Cliente {

    private Integer id;

    private String nombre;

    private String direccion;

    private String telefono;

    private String email;

    private LocalTime fecha_registro;

}
