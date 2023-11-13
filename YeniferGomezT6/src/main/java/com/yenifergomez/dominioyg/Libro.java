package com.yenifergomez.dominioyg;

public class Libro extends Recurso implements Prestable{


    public Libro(boolean prestadoYenifer, String nombreYenifer) {
        super(prestadoYenifer, nombreYenifer);
    }

    @Override
    public boolean prestarGomez() {
        if (!isPrestadoYenifer()) {
            setPrestadoYenifer(true);
            System.out.println(getNombreYenifer() + " prestado.");
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean devolverGomez() {
        if (isPrestadoYenifer()) {
            setPrestadoYenifer(false);
            System.out.println(getNombreYenifer() + " devuelto.");
            return true;
        }else {

            return false;
        }
    }

    @Override
    public String toString(){
        return "Libro: " + getNombreYenifer() + " - Prestado: " + isPrestadoYenifer();
    }
}
