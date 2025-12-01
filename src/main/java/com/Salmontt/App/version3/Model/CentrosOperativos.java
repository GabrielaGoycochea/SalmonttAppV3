package com.Salmontt.App.version3.Model;

/**
 * Se genera una superclase como unidad operativa.
 * Se crea con atributo en protected para que la utilicen las subclases
 * Los datos heredados corresponden a:
 * Nombre de Centros, ubicación Centros, Cantidad de Peces en el Centro, Capacidad de Centro.
 */

public abstract class CentrosOperativos {


    protected String nombreCentros;
    protected String ubicacionCentros;
    protected double cantidadActualCentro;
    protected double cantidadPermitidaCentro;

    public CentrosOperativos(String nombreCentros, String ubicacionCentros, double cantidadActualCentro, double cantidadPermitidaCentro){
        this.nombreCentros=nombreCentros;
        this.ubicacionCentros=ubicacionCentros;
        this.cantidadActualCentro=cantidadActualCentro;
        this.cantidadPermitidaCentro=cantidadPermitidaCentro;
    }


    //Booleano para capacidad

    public boolean CapacidadCentro(){return cantidadActualCentro>cantidadPermitidaCentro;}



    //NO SET NO ES MODIFICABLE
    public String getNombreCentros(){return nombreCentros;}
    public String getUbicacionCentros(){return ubicacionCentros;}
    public double getCantidadActualCentro(){return cantidadActualCentro;}
    public double getCantidadPermitidaCentro(){return cantidadPermitidaCentro;}


    public abstract String getTipos();



    @Override
    public String toString(){
        return "Nombre: "+nombreCentros+"\nUbicación: "+ubicacionCentros
                +"\nCantidad de Peces en el Centro: "+ String.format("%.0f",cantidadActualCentro)
                +"\nCapacidad de Centro: "+ String.format("%.0f",cantidadPermitidaCentro)
                +"\nEstado Centro: "+(CapacidadCentro() ? "CENTRO SOBRE LA CAPACIDAD PERMITIDA" :"OK");
    }




}
