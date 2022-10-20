package com.open_bootcamp.funcionyobjeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        // Resultado de suma pasándole números
        int resultant= suma(3,8,6);
        System.out.println(resultant);

        // Creamos una instancia
        Coche miCoche = new Coche();
        miCoche.quitarPuerta();
        System.out.println(miCoche.puertas);

    }

    // Función suma
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    // Clase Coche
    static class Coche{
        public int puertas = 5;
        public void quitarPuerta(){
            this.puertas--;
        }

    }
}





