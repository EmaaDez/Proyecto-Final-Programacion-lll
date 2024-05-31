package com.ProyectoF.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString @EqualsAndHashCode
@Table(name= "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email")
    private String email;

    @Column(name="telefono")
    private String telefono;

    @Column(name="password")
    private String password;

}
