package com.Salmontt.App.version3.Util;

import com.Salmontt.App.version3.Model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorPruebas {

    public List<CentrosOperativos> unidadesDePrueba(){
        List<CentrosOperativos> listaDatos =new ArrayList<>();

        listaDatos.add(new CentrosDeReproduccion("reproduccion","Criadero","Coquimbo","Algas",400,600));
        listaDatos.add(new CentrosDeReproduccion("reproduccion","Centro de cultivo","Cartagena","Reineta",1000,500));

        listaDatos.add(new CentrosDeCrecimientos("crecimiento","Estanque","Antofagasta","Locos",100,100));
        listaDatos.add(new CentrosDeCrecimientos("crecimiento","Estanque","La Serena","Crecimientos de huevos",1000,3000));

        listaDatos.add(new PlantaDeProcesamiento("procesamiento","Planta Interna","Antofagasta"," Limpieza de Locos",200,100));
        listaDatos.add(new PlantaDeProcesamiento("procesamiento","Planta Interna","Cartagena"," Limpieza de Reineta",500,500));

        listaDatos.add(new PlantaProduccionAlimentos("produccion","Planta de alimentos","Coquimbo","Algas Nori",1000,600));
        listaDatos.add(new PlantaProduccionAlimentos("produccion","Planta de alimentos","Cartagena","Filetes de Reinetas",1000,1500));

        return listaDatos;
    }

}
