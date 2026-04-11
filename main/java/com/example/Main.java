package com.example;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        lugares.add(new JardinBotanico());
        lugares.add((EspacioCultural) new MuseoDeAntioquia());
        lugares.add((EspacioCultural) new ParqueExplora());

        String[] nombres = {"Jardín Botánicooo", "Museo de Antioquiaaa", "Parque Explora"};

        for (int i = 0; i < lugares.size(); i++) {
            EspacioCultural lugar = lugares.get(i);
            System.out.println("Lugar: " + nombres[i]);
            lugar.mostrarHorario();
            System.out.println("Requisito: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
            System.out.println("------------------------");
        }
    }
}