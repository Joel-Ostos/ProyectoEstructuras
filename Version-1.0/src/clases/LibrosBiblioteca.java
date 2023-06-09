package clases;

import java.util.LinkedList;
import java.util.ArrayList;

public class LibrosBiblioteca {
  LinkedList<Libro> libros = new LinkedList<>();
  public void create(String NombreLibro, String Autor, int CantidadLibros, String Editorial) {
    Libro libro = new Libro(NombreLibro, Autor,CantidadLibros, Editorial);
    libros.add(libro);
  }
  
  public Libro mostrarPorNombre(String NombreLibro) {
    for (Libro libro : libros) {
      if (libro.getNombreLibro().equals(NombreLibro)) {
	return libro;
      }
    }
    return null;
  }
  public Libro MostrarPorAutor(String Autor){
    for (Libro libro : libros) {
      if (libro.getAutor() == Autor)
	return libro;
    }
    return null;
  }

  public LinkedList<String> mostrarTodos() {
    LinkedList<String> todosLibros = new LinkedList<>();
    for (Libro libro : libros) {
      todosLibros.add(libro.getNombreLibro());
    }
    return todosLibros;
  }

  public String eliminarLibro(String NombreLibro) {
    for (Libro l : libros) {
      if (l.getNombreLibro().equals(NombreLibro)) {
	libros.remove(l);
	return NombreLibro;
      }
    }
    return null;
  }
  public String ModificarNombre(String NuevoNombreLibro, String Autor){
    String Nombre = MostrarPorAutor(Autor).getAutor();
    MostrarPorAutor(Autor).setNombreLibro(NuevoNombreLibro);
    return Nombre;
  }
  int nLibros = 0;
  public int CantidadLibros(String NombreLibro){
    for (Libro l : libros){
      if (l.getNombreLibro().equals(NombreLibro)){
	nLibros += 1;
      }
    }
    return nLibros;
  }
}
