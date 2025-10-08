package com.isil.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "estudiante")
@Data
public class Estudiante {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer id;
   @Column(length = 100)
   String nombres;
   @Column(length = 100)
   String apellidos;
   @Column(length = 120)
   String correo;
   @Column(length = 80)
   String carrera;

}
