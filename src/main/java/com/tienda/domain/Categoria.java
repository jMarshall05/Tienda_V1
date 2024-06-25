package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

    private static final long serialVersionUID = 1L;//autoincrement en java//

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria (String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
