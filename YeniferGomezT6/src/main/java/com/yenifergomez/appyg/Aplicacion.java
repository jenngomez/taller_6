package com.yenifergomez.appyg;

import com.yenifergomez.dominioyg.*;


public class Aplicacion {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro(false,"La chica del tren");
        Revista revista = new Revista(false,"Cosmos");
        Periodico periodico = new Periodico(false,"El Colombiano");
        Tesis tesis = new Tesis(false,"El enigma de la programación");
        Computador computador = new Computador(false,"MacBook Pro");


        biblioteca.addRecursoGomez(libro);
        biblioteca.addRecursoGomez(revista);
        biblioteca.addRecursoGomez(periodico);
        biblioteca.addRecursoGomez(tesis);
        biblioteca.addRecursoGomez(computador);

        biblioteca.prestarRecursoGomez((Prestable)revista);
        biblioteca.prestarRecursoGomez((Prestable)libro);
        biblioteca.prestarRecursoGomez((Prestable)periodico);

        biblioteca.listarPrestadosGomez();

        biblioteca.devolverRecursoGomez((Prestable) revista);

        biblioteca.listarPrestadosGomez();

    }
}
