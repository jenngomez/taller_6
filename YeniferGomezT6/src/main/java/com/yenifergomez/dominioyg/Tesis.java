package com.yenifergomez.dominioyg;

public class Tesis extends Recurso{


    public Tesis(boolean prestadoYenifer, String nombreYenifer) {
        super(prestadoYenifer, nombreYenifer);
    }

    @Override
    public String toString(){
        return "Tesis : " + getNombreYenifer();
    }
}
