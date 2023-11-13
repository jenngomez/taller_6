package com.yenifergomez.dominioyg;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Recurso> recursosYenifer;

    public Biblioteca() {
        this.recursosYenifer = new ArrayList<>();
    }
    public void addRecursoGomez(Recurso recurso) {
        recursosYenifer.add(recurso);
        System.out.println("Recurso añadido: " + recurso.getNombreYenifer());
    }

    public boolean prestarRecursoGomez(Prestable prestable) {
        if (prestable instanceof Recurso) {
            prestable.prestarGomez();
            return true;
        }
        return false;
    }

    public boolean devolverRecursoGomez(Prestable prestable) {
        if (prestable instanceof Recurso) {
            prestable.devolverGomez();
            return true;
        }
        return false;
    }

    public void listarPrestadosGomez() {
        System.out.println("Recursos Prestados:");
        for (Recurso recurso : recursosYenifer) {
            if (recurso.isPrestadoYenifer()) {
                System.out.println(recurso);
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca" +
                "recursosYenifer=" + recursosYenifer;
    }

    public List<Recurso> getRecursosYenifer() {
        return recursosYenifer;
    }

    public void setRecursosYenifer(List<Recurso> recursosYenifer) {
        this.recursosYenifer = recursosYenifer;
    }
}
