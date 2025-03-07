package co.edu.sena.gestion_turistica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "atraccion_turistica")

public class AtraccionEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private long Id;

     @Column(name ="nombre")
     private String Nombre;

     @Column(name="id_municipio") 
     private long IdMunicipio;

     @Column(name="celular")
     private String Celular;




}
