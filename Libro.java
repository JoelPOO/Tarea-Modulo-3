/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poyectomoduloiii;


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
