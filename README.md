README.
:::AUTOR:::
Gabriela Alejandra Goycochea Romero
Seccion 2
Analista Programador Computacional
Online
___________________________________________________________________________
Nombre del proyecto: SalmonttAppV2.1
___________________________________________________________________________
Descripción

El proyecto genera un menú de busqueda y visualización con respecto a los datos de diferentes centros operativos
Los datos que te permite revisar el programa por centro:
- Nombre del Centro
-Ubicacion del Centro
- Cantidad de producto en el centro
- Capacidad del centro para el producto
-Estado del centro (Ok o sobrecapacidad)
- Tipo de Centro
- Producto a tratar en el centro.
___________________________________________________________________________
Estructura.
Dentro de la carpeta src/main/java/com.Salmontt.App.version3
Se encuentran 4 paquetes de trabajo.
1.- Model que tiene la clase de los objetos a utilizar (CentrosDeReproduccion -CentrosDeCrecimientos - CentrosOperativos - PlantaDeProcesamiento - PlantaProduccionAlimentos)
2.-Service tiene la base para la busqueda  del centro por nombre(ServiceCentrosCultivo)
3.- UI contiene  2 paquetes:
Menu Principal : Donde se encuentra el MAIN.
Submenus: Menu para centros  (en caso de más opciones se pueden agregar más submenus, ejemplo trabajadores)
4.- Util contiene el codigo de GestorPruebas con los datos ficticios para probar el programa.
___________________________________________________________________________
Ejecutable
Para ejecutar el proyecto debe ir a la carpeta "menu principal" dentro de UI y abrir el Main dentro del programa para desarrollo. Luego al darle ejecutar deberia presentar el primer menu.
