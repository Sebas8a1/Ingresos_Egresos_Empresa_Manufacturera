
package com.company.reto4;

import java.util.ArrayList;


public class Solucion {
   /* 
    //ATRIBUTO
    private ArrayList<Corredor> carrera;
    
    //CONTRUCTOR

    public Solucion(ArrayList<Corredor> carrera) {
        this.carrera = carrera;
    }
    
    //GETTER

    public ArrayList<Corredor> getCarrera() {
        return carrera;
    }
    
   
    //SETTER

    public void setCarrera(ArrayList<Corredor> carrera) {
        this.carrera = carrera;
    }
    
    //ACCIONES
    
    public void registrarCorredor(String nombreCompleto,String numeroIdentificador, double estatura, int edad, double tiempoMeta){
        Corredor corredor = new Corredor(nombreCompleto, numeroIdentificador, estatura, edad,tiempoMeta);
        //Añadir al arreglo
        carrera.add(corredor);
        
    
    }*/
    
    public static Object [] reporte(ArrayList <Corredor> carrera){

     
        double suma=0;
        String corredorMenorTiempo=carrera.get(0).getNombreCompleto();
        double menorTiempo=carrera.get(0).getTiempoMeta();
        String corredorMayorTiempo=carrera.get(0).getNombreCompleto();
        double mayorTiempo=carrera.get(0).getTiempoMeta();

        
        for (int i=0;i<carrera.size();i++){      
            suma+=carrera.get(i).getTiempoMeta();
            if(carrera.get(i).getTiempoMeta()<menorTiempo){
                menorTiempo=carrera.get(i).getTiempoMeta();
                corredorMenorTiempo=carrera.get(i).getNombreCompleto();
            }
            if (carrera.get(i).getTiempoMeta()>mayorTiempo){
                mayorTiempo=carrera.get(i).getTiempoMeta();
                corredorMayorTiempo=carrera.get(i).getNombreCompleto();
          }
            
            
        }
        double promedio=suma/carrera.size();
        Object [] reporte= {promedio,corredorMenorTiempo,menorTiempo,corredorMayorTiempo,mayorTiempo};
        return reporte;
        
    }
        
    
    
}
