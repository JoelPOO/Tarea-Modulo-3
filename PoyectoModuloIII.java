/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poyectomoduloiii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import


/**
 *
 * @author Milton Sarmiento
 */
public class PoyectoModuloIII {

   public
 
class
 
Libro
 
{
    
private
 String titulo;
    
private
 String autor;
    
private
 
int
 anioPublicacion;
    
private
 String genero;
    
private
 
boolean
 disponible;
    
public
 
Libro
(String titulo, String autor, 
int
 anioPublicacion, String genero)
 
{
        
this
.titulo = titulo;
        
this
.autor = autor;
        
this
.anioPublicacion = anioPublicacion;
        
this
.genero = genero;
        
this
.disponible = 
true
;
    }
    
// Métodos getter y setter para los atributos

    
public
 String 
getTitulo
()
 
{
        
return
 titulo;
    }
    
public
 
void
 
setTitulo
(String titulo)
 
{
        
this
.titulo = titulo;
    }
    
public
 String 
getAutor
()
 
{
        
return
 autor;
    }
    
public
 
void
 
setAutor
(String autor)
 
{
        
this
.autor = autor;
    }
    
public
 
int
 
getAnioPublicacion
()
 
{
        
return
 anioPublicacion;
    }
    
public
 
void
 
setAnioPublicacion
(
int
 anioPublicacion)
 
{
        
this
.anioPublicacion = anioPublicacion;
    }
    
public
 String 
getGenero
()
 
{
        
return
 genero;
    }
    
public
 
void
 
setGenero
(String genero)
 
{
        
this
.genero = genero;
    }
    
public
 
boolean
 
isDisponible
()
 
{
        
return
 disponible;
    }
    
public
 
void
 
setDisponible
(
boolean
 disponible)
 
{
        
this
.disponible = disponible;
    }
    
// Método toString para mostrar la información del libro

    
@Override

    
public
 String 
toString
()
 
{
        
return
 
"Título: "
 + titulo + 
", Autor: "
 + autor + 
", Año de Publicación: "
 + anioPublicacion + 
", Género: "
 + genero + 
", Disponible: "
 + (disponible ? 
"Sí"
 : 
"No"
);
    }
}
//import
 //java.util.ArrayList;
//import
 //java.util.List;
public
 
class
 
Biblioteca
 
{
    
private
 List<com.mycompany.poyectomoduloiii.Libro> libros;
    
public
 
Biblioteca
()
 
{
        libros = 
new
 ArrayList<>();
    }
    
public
 
void
 
agregarLibro
(com.mycompany.poyectomoduloiii.Libro libro)
 
{
        libros.add(libro);
    }
    
public
 
void
 
buscarLibros
(String criterio)
 
{
        System.out.println(
"Resultados de la búsqueda:"
);
        
for
 (com.mycompany.poyectomoduloiii.Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(criterio) || libro.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(libro);
            }
        }
    }
    
public
 
void
 
prestarLibro
(String titulo)
 
{
        
for
 (com.mycompany.poyectomoduloiii.Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(titulo)) {
                
if
 (libro.isDisponible()) {
                    libro.setDisponible(
false
);
                    System.out.println(
"Libro prestado con éxito."
);
                } 
else
 {
                    System.out.println(
"El libro no está disponible actualmente."
);
                }
                
return
;
            }
        }
        System.out.println(
"Libro no encontrado en la biblioteca."
);
    }
    
public
 
void
 
devolverLibro
(String titulo)
 
{
        
for
 (com.mycompany.poyectomoduloiii.Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(titulo)) {
                
if
 (!libro.isDisponible()) {
                    libro.setDisponible(
true
);
                    System.out.println(
"Libro devuelto con éxito."
);
                } 
else
 {
                    System.out.println(
"El libro no está prestado actualmente."
);
                }
                
return
;
            }
        }
        System.out.println(
"Libro no encontrado en la biblioteca."
);
    }
    
public
 
void
 
mostrarInformacion
()
 
{
        System.out.println(
"Libros disponibles en la biblioteca:"
);
        
for
 (com.mycompany.poyectomoduloiii.Libro libro : libros) {
            
if
 (libro.isDisponible()) {
                System.out.println(libro);
            }
        }
    }
}
//import
 //java.util.Scanner;
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
        com.mycompany.poyectomoduloiii.Biblioteca biblioteca = 
new
 com.mycompany.poyectomoduloiii.Biblioteca();
        
// Crea algunos libros de ejemplo

        com.mycompany.poyectomoduloiii.Libro libro1 = 
new
 com.mycompany.poyectomoduloiii.Libro(
"El Gran Gatsby"
, 
"F. Scott Fitzgerald"
, 
1925
, 
"Novela"
);
        com.mycompany.poyectomoduloiii.Libro libro2 = 
new
 com.mycompany.poyectomoduloiii.Libro(
"1984"
, 
"George Orwell"
, 
1949
, 
"Distopía"
);
        com.mycompany.poyectomoduloiii.Libro libro3 = 
new
 com.mycompany.poyectomoduloiii.Libro(
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
        
    try (// Realiza pruebas de las operaciones implementadas
            Scanner scanner = new
         Scanner(System.in)) {
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
                );  }
    }
}
