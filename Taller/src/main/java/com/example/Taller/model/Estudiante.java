package com.example.Taller.model;

import jakarta.validation.constraints.NotBlank;

public class Estudiante {

    @NotBlank(message = "id es obligatorio")
    private String id;

    @NotBlank(message = "nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "carrera es obligatoria")
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
