package com.Salmontt.App.version3.UI.SubMenus;

import com.Salmontt.App.version3.Model.CentrosOperativos;
import com.Salmontt.App.version3.Services.ServicesCentrosCultivos;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Se genera un submenu para buscar centros operativos por nombre o producto.
 */

public class MenuCentros{

public static void menuCentros (Scanner tc, List <CentrosOperativos> centrosOperativos) {
    int opcion = 0;

    do {
        System.out.println("...:::Menú Centros Operativos:::...");
        System.out.println("1. Ver todos los centros.");
        System.out.println("2. Buscar centro por nombre.");
        System.out.println("3.Volver al menú principal.");

        System.out.println("Elige una opción: ");

        try {
            opcion = tc.nextInt();
            tc.nextLine();

            switch (opcion) {

                case 1:
                    centrosOperativos.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del Centro Operativo: ");
                    String tcNombre = tc.nextLine();

                    List<CentrosOperativos> filtrarNombre =
                            ServicesCentrosCultivos.buscarPorNombre(centrosOperativos, tcNombre);

                    if (filtrarNombre.isEmpty()) System.out.println("No se encontró centro con ese nombre.");
                    else filtrarNombre.forEach(System.out::println);
                    break;


                case 3:
                    break;
                default:
                    System.out.println("Ingresa una opción valida.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ingresa un número válido.");
            tc.nextLine();
        }

    } while (opcion != 3);}

}
