package com.example.__04.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//genera getters, setters. toString, equals, hashCode
    // y un constructor con los campos requeridos
@AllArgsConstructor//genera un constructor con todos los campos
@NoArgsConstructor//genera un constructor con todos los campos

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;



}
