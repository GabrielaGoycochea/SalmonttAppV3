package com.Salmontt.App.version3.Services;

import com.Salmontt.App.version3.Model.CentrosOperativos;

import java.util.List;
import java.util.stream.Collectors;

public class ServicesCentrosCultivos {

    /**
     *Se realiza la busqueda por producto, tomando el dato de una colección, dentro de los centros de cultivo
     * Se realiza un filtro dentro del archivo excel (no se llama al archivo directamente, solo se hace referencia al nombre de la carpeta que lo contiene)
     * Se trae la lista generada (con el archivo directo) en la clase "gestosArchivos"
     * Luego de generar el filtro muestra una nueva lista con las coincidencias de busqueda
     * De no encontrar el producto entregara un mensaje en el main
     */

    public static List<CentrosOperativos>buscarPorNombre
            (List<CentrosOperativos> listaCentros, String nombreCentros){
        return listaCentros.stream()
                .filter(Excel->Excel.getNombreCentros()
                .equalsIgnoreCase(nombreCentros)).collect(Collectors.toList());
    }

}


