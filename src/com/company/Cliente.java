package com.company;

public class Cliente extends Persona{
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito(){
        return this.credito;
    }
    public String toString(){
        return "El nombre es " + getNombre() + " Su edad es " + getEdad() + " su telefono es " + getTelefono() + " y su credito es " + getCredito();
    }
}
