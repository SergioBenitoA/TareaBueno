package com.example.demo;

import java.time.LocalTime;

public class Tarea {
    int id;
    String titulo;
    String descripcion;
    String dia;

    public Tarea() {
    }

    public Tarea(int id, String titulo, String descripcion, String dia, LocalTime hora) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
    }

    public Tarea(String titulo, String descripcion, String dia, LocalTime hora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
