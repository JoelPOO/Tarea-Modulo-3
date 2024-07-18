

package com.mycompany.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    
public static void main(String[] args) {

class Libro{
    
private final String titulo;
    
private final String autor;
    
private final int anioPublicacion;
    
private final String genero;
    
private boolean disponible;
    
public Libro (String titulo, String autor, 
int anioPublicacion, String genero){
        
this.titulo = titulo;
        
this.autor = autor;
        
this.anioPublicacion = anioPublicacion;
        
this.genero = genero;
        
this.disponible = 
true;
    }   
public String getTitulo() 
{
return titulo;
    }   
public String getAutor()
 
{        
return autor;
    } 
public boolean isDisponible()
 
{       
return disponible;
    }  
public void prestar(){
        disponible = false;
    }  
public
 
void devolver(){
  disponible = true;
    }
    

@Override
public String toString(){
        
return
 
"Título: "+ titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion + ", Género: " + genero + ", Disponible: "
 + (disponible ? "Sí" : "No");
    }
}
class Biblioteca
 {
    
private final List<Libro> libros;
    
public Biblioteca(){
        libros = new ArrayList<>();
    }
    
public void agregarLibro (Libro libro){
        libros.add(libro);
    }
    
public void buscarLibros(String criterio)
 
{
    System.out.println("Resultados de la búsqueda:");
        
for(Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(criterio) || libro.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(libro);
            }
        }
    }
    
public void prestarLibro (String titulo)
 
{
        
for(Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(titulo)) {
                
if
 (libro.isDisponible()) {
  libro.prestar();
  System.out.println("Libro prestado con éxito.");
                } 
else
 {
  System.out.println("El libro no está disponible actualmente.");
                }
                
return;
            }
        }
System.out.println("Libro no encontrado en la biblioteca.");
    }
    
public void devolverLibro(String titulo)
 
{
for (Libro libro : libros) {
            
if
 (libro.getTitulo().equalsIgnoreCase(titulo)) {
                
if(!libro.isDisponible()) {
 libro.devolver();
 System.out.println("Libro devuelto con éxito.");
                } 
else{ 
    System.out.println("El libro no está prestado actualmente.");
                }
return;
            }
        }
System.out.println("Libro no encontrado en la biblioteca.");
    }
    
public void mostrarInformacion()
 
{
    System.out.println("Libros disponibles en la biblioteca:");
        
for(Libro libro : libros) {
            
if(libro.isDisponible()) {
 System.out.println(libro);
            }
        }
    }
}

    
//public static void main(String[] args) {
Biblioteca biblioteca = new Biblioteca();
        
// Crear libros de ejemplo

Libro libro1 = new 
        Libro("El Gran Gatsby", "F. Scott Fitzgerald",1925, "Novela");
Libro libro2 = new
 Libro("1984", "George Orwell", 1949, "Distopía");
Libro libro3 = new
 Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        
// Agregar los libros a la biblioteca

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        
    try (
            Scanner scanner = new Scanner(System.in)) {
        int opcion;
        
        do
        {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Buscar libro por título o autor");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar información de los libros disponibles");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
 

            
switch(opcion) {
                
    case 1:
        System.out.print("Ingrese el título o autor a buscar: ");
        String criterio = scanner.nextLine();
        biblioteca.buscarLibros(criterio);
        
        break;
        
    case 2:
        System.out.print("Ingrese el título del libro a prestar: ");
        String tituloPrestar = scanner.nextLine();
        biblioteca.prestarLibro(tituloPrestar);
        
        break;
        
    case 3:
        System.out.print("Ingrese el título del libro a devolver: ");
        String tituloDevolver = scanner.nextLine();
        biblioteca.devolverLibro(tituloDevolver);
        
        break;
        
    case 4:biblioteca.mostrarInformacion();
        
        break;
        
    case 0:
        System.out.println("Saliendo del programa...");
        
        break;
        
    default:
        System.out.println("Opción inválida.");
}
        }
        while(opcion != 0);
    }
    }
}




