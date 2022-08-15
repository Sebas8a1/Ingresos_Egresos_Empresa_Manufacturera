
package com.company.reto4;


public class Corredor {
    
    //ATRIBUTOS
    private String nombreCompleto;
    private String numeroIdentificador;
    private double estatura;
    private int edad;
    private double tiempoMeta;
    
    //METODO CONSTRUCTOR

    public Corredor(String nombreCompleto, String numeroIdentificador, double estatura, int edad, double tiempoMeta) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificador = numeroIdentificador;
        this.estatura = estatura;
        this.edad = edad;
        this.tiempoMeta = tiempoMeta;
    }
    
    //GETTER

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public double getTiempoMeta() {
        return tiempoMeta;
    }
    
    //SETTER

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setNumeroIdentificador(String numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTiempoMeta(double tiempoMeta) {
        this.tiempoMeta = tiempoMeta;
    }
    
    
    
}
