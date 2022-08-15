

package com.company.reto4;

import static com.company.reto4.Solucion.reporte;
import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class Reto4 {

    public static void main(String[] args) {
        
    ArrayList<Corredor> carrera = new ArrayList<>();
    carrera.add(new Corredor("Luis Gomez","12",1.68,20,22.0));

    
    Object retorno[]=reporte(carrera);
    System.out.println(Arrays.toString(retorno));
    

    }
}
