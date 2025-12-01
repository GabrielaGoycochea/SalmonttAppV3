package com.Salmontt.App.version3.UI.MenuPrincipal;


import com.Salmontt.App.version3.UI.SubMenus.MenuCentros;
import com.Salmontt.App.version3.Model.CentrosOperativos;
import com.Salmontt.App.version3.Util.GestorPruebas;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        GestorPruebas gestorPruebas = new GestorPruebas();

        //Lista para traer datos de prueba

        List<CentrosOperativos> centrosPrueba = gestorPruebas.unidadesDePrueba();

     int opcion=0;

     //Menú interactivo.
    do {
        System.out.println("--------------------------");
        System.out.println("\n...:::SALMONTT APP:::...");
        System.out.println("--------------------------");
        System.out.println("...:::MENÚ:::...");
        System.out.println("1. Ver información de Centros Operativos.");
        System.out.println("2. Salir.");
        System.out.println("Favor elige una opción: ");

        String texto =tc.nextLine();
        try {opcion = Integer.parseInt(texto);} catch(NumberFormatException exception){
            System.out.println("Ingresa un número válido.");continue;}

        //Manejo de opciones
            switch (opcion) {

                case 1:
                    MenuCentros.menuCentros(tc,centrosPrueba); //Ingresa al submenu de centros
                    break;
                case 2:
                    System.out.println("Saliendo,gracias por usar el programa"); //Genera una despedida para el usuario
                    break;
                default:
                    System.out.println("Opción marcada inválida.Intente nuevamente."); // Si no marca una de las opciones del menú.
            }

        }while(opcion !=2);

        tc.close();
    }

}
