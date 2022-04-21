package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumaNumeros(1,2,3));

        //Aca creamos un objeto de la clase coche
        Coche coche1 = new Coche();

        //Llamamos el metodo incrementar puerta que aumenta la cantidad de puertas del carro
        coche1.incrementarPuertas();
        System.out.println(coche1.getNumeroPuertas());
    }

    public static int sumaNumeros(int a, int b, int c){
        return a +b +c;
    }

}
