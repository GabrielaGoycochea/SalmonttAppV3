package com.Salmontt.App.version3.Model;


/**
 * La clase CentrosDeReproducción es "Hija" de la SuperClase UnidadesOperativas
 * Trae asi los datos ingresados desde esa clase para la información de nombre, ubicación, tipo de pez en crecimiento, capacidad de centro
 * Se agrega la especie o tipo de pez en reproducción
 */


public class CentrosDeReproduccion extends CentrosOperativos {

    private final String atributo;


    public CentrosDeReproduccion(String tipos,String nombreCentros, String ubicacionCentros, String atributo, double cantidadActualCentro, double cantidadPermitidaCentro) {
        super(nombreCentros, ubicacionCentros, cantidadActualCentro, cantidadPermitidaCentro);
        this.atributo = atributo;

    }

        public String getAtributo() {
        return atributo;
    }

    @Override
    public String getTipos(){return "Centro de Reproducción";}

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo: Centro de Reproducción"
                + "\nEspecie: " + atributo+"\n";
    }
}