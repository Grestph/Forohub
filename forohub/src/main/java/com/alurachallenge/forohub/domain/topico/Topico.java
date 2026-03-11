package com.alurachallenge.forohub.domain.topico;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    private String autor;
    private String curso;

    private LocalDateTime fechaCreacion;

    public Topico(DatosRegistroTopico datos){
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.autor = datos.autor();
        this.curso = datos.curso();
        this.fechaCreacion = LocalDateTime.now();
    }

    public void actualizarDatos(DatosActualizarTopico datos){
        if(datos.titulo()!=null){
            this.titulo = datos.titulo();
        }

        if(datos.mensaje()!=null){
            this.mensaje = datos.mensaje();
        }
    }
}