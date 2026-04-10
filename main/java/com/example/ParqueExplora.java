package com.example;

public class ParqueExplora implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 8:00 AM - 6:00 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Documento original";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Interactuar con experimentos...");
    }
}