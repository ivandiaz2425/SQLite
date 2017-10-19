package com.i034114.myapplication.Model;

/**
 * Created by aula7 on 19/10/17.
 */

public class User {
    private int Id;
    private String Nombre;
    private String Telefono;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
