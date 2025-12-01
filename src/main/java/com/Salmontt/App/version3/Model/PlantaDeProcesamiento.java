package com.Salmontt.App.version3.Model;


public class PlantaDeProcesamiento extends CentrosOperativos {

    private final String atributo;

    public PlantaDeProcesamiento(String tipos, String nombreCentros ,String ubicacionCentros,String atributo, double cantidadActualCentro, double cantidadPermitidaCentro){
        super(nombreCentros,ubicacionCentros, cantidadActualCentro,cantidadPermitidaCentro);
        this.atributo=atributo;
    }

    public String getAtributo(){return atributo;}

    @Override
    public String getTipos(){return "Planta de Procesamiento de Alimentos";}

    @Override
    public String toString() {
        return super.toString()
                +"\nTipo: Planta de Procesamiento de Alimentos"
                +"\nTipo de Alimento: "+atributo+"\n";
    }


}
