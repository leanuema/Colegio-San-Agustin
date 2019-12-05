package com.Leandro.utn;

public class ProfesorSecundaria {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private String especializacion;
    private Integer dni;
    private Integer legajo;
    private Integer horasBase;
    private Integer horasExtra;
    private Integer sueldo;


    public ProfesorSecundaria(){

    }

    {
        horasBase = 0;
        horasExtra = 0;
        legajo = null;
    }

    public ProfesorSecundaria(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ProfesorSecundaria(Integer dni) {
        this.dni = dni;
    }

    public ProfesorSecundaria(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni(){
        return dni;
    }

    public void setDni(int dni){
        this.dni = dni;
    }


    public java.lang.String toString() {
        return "ProfesorSecundaria{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", antiguedad=" + antiguedad + ", especializacion='" + especializacion + '\'' + ", dni=" + dni + '}';
    }

    public static Integer sueldoNeto(Integer sueldo, Integer horasBase) {
        horasBase = 40;
        sueldo = 500 * horasBase;
        return sueldo;
    }
}
