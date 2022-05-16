package com.company;


import java.util.Scanner;

public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

   public int getEdad(){
       return this.edad;
   }

   public void setEdad(int edad){
       this.edad = edad;
   }


   public String getNombre(){
       return this.nombre;
   }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
