package com.yenifergomez.dominioyg;

public abstract class Recurso {
    private boolean prestadoYenifer;
    private String nombreYenifer;

    public Recurso(boolean prestadoYenifer, String nombreYenifer) {
        this.prestadoYenifer = false;
        this.nombreYenifer = nombreYenifer;
    }

    public String getNombreYenifer() {
        return nombreYenifer;
    }

    public boolean isPrestadoYenifer() {
        return prestadoYenifer;
    }

    public void setPrestadoYenifer(boolean prestadoYenifer) {
        this.prestadoYenifer = prestadoYenifer;
    }

    @Override
    public String toString(){
        return "El recurso: " + nombreYenifer + " - Prestado: " + prestadoYenifer;
    }

}
