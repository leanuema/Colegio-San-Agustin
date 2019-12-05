package com.Leandro.utn;

public class Main {
    public static void main(String[] args) {

        ProfesorSecundaria matematica = new ProfesorSecundaria();
        ProfesorSecundaria lengua = new ProfesorSecundaria("Alejandro", 123);
        ProfesorSecundaria lidia = new ProfesorSecundaria("lisi", "antonia");

        System.out.println(matematica.toString());

        String nombreDelProfesor = "Pepe";
        Integer dniDelProfesor = 312312;

        matematica.setNombre(nombreDelProfesor);
        matematica.setDni(dniDelProfesor);

        System.out.println(matematica.toString());




    }
}
