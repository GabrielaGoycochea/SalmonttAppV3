package com.Salmontt.App.version3.Model;

/**
 * La clase CentrosDeCrecimiento es "Hija" de la SuperClase UnidadesOperativas
 * Trae asi los datos ingresados desde esa clase para la información de nombre, ubicación, cantidad de peces, capacidad de centros.
 * Se agrega la especie o tipo de pez en crecimiento
 */
public class CentrosDeCrecimientos extends CentrosOperativos {

    private final String atributo;


    public CentrosDeCrecimientos(String tipos,String nombreCentros, String ubicacionCentros, String atributo, double cantidadActualCentro, double cantidadPermitidaCentro) {
        super(nombreCentros, ubicacionCentros, cantidadActualCentro, cantidadPermitidaCentro);
        this.atributo = atributo;

    }

    public String getAtributo() {return atributo;}

    @Override
    public String getTipos(){return "Estanque de Crecimiento";}

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo: Estanque de Crecimiento"
                + "\nTipo de Alimento: " + atributo+"\n";
    }

}