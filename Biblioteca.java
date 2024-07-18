/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poyectomoduloiii;

import
 java.util.ArrayList;
import
 java.util.List;
public
 
class
 
Biblioteca
 
{
    
private
 List<Libro> libros;
    
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
(Libro libro)
 
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
 (Libro libro : libros) {
            
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
 (Libro libro : libros) {
            
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
 (Libro libro : libros) {
            
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
 (Libro libro : libros) {
            
if
 (libro.isDisponible()) {
                System.out.println(libro);
            }
        }
    }
}