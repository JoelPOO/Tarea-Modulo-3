/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poyectomoduloiii;

import
 java.util.Scanner;
public
 
class
 
Main
 
{
    
public
 
static
 
void
 
main
(String[] args)
 
{
        Biblioteca biblioteca = 
new
 Biblioteca();
        
// Crea algunos libros de ejemplo

        Libro libro1 = 
new
 Libro(
"El Gran Gatsby"
, 
"F. Scott Fitzgerald"
, 
1925
, 
"Novela"
);
        Libro libro2 = 
new
 Libro(
"1984"
, 
"George Orwell"
, 
1949
, 
"Distopía"
);
        Libro libro3 = 
new
 Libro(
"Cien años de soledad"
, 
"Gabriel García Márquez"
, 
1967
, 
"Realismo mágico"
);
        
// Agrega los libros a la biblioteca

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        
// Realiza pruebas de las operaciones implementadas

        Scanner scanner = 
new
 Scanner(System.in);
        
int
 opcion;
        
do
 {
            System.out.println(
"\n--- MENÚ ---"
);
            System.out.println(
"1. Buscar libro por título o autor"
);
            System.out.println(
"2. Prestar libro"
);
            System.out.println(
"3. Devolver libro"
);
            System.out.println(
"4. Mostrar información de los libros disponibles"
);
            System.out.println(
"0. Salir"
);
            System.out.print(
"Ingrese una opción: "
);
            opcion = scanner.nextInt();
            scanner.nextLine(); 
// Limpiar el buffer de entrada

            
switch
 (opcion) {
                
case
 
1
:
                    System.out.print(
"Ingrese el título o autor a buscar: "
);
                    String criterio = scanner.nextLine();
                    biblioteca.buscarLibros(criterio);
                    
break
;
                
case
 
2
:
                    System.out.print(
"Ingrese el título del libro a prestar: "
);
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    
break
;
                
case
 
3
:
                    System.out.print(
"Ingrese el título del libro a devolver: "
);
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    
break
;
                
case
 
4
:
                    biblioteca.mostrarInformacion();
                    
break
;
                
case
 
0
:
                    System.out.println(
"Saliendo del programa..."
);
                    
break
;
                
default
:
                    System.out.println(
"Opción inválida."
);
            }
        } 
while
 (opcion != 
0
);
        scanner.close();
    }
}
