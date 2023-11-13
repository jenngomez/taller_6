package com.yenifergomez.dominioyg;

public class Computador extends Recurso{


    public Computador(boolean prestadoYenifer, String nombreYenifer) {
        super(prestadoYenifer, nombreYenifer);
    }

    @Override
    public String toString(){
        return "Computador: " + getNombreYenifer();
    }
}
