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
   private Integer id;
   @Column(length = 100)
   private String nombres;
   @Column(length = 100)
   private String apellidos;
   @Column(length = 120)
   private String correo;
   @Column(length = 80)
   private String carrera;

}
