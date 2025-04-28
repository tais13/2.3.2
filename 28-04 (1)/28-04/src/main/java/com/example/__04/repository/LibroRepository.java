package com.example.__04.repository;


import com.example.__04.model.Libro;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class LibroRepository {
    //arreglo que guarda todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    //metodo que retorna todos los libros


    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    //buscar un libro por su id
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    //buscar un libro por su isbn
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    //Metodo que guarda el libro en el arreglo y retorna libro: guardar
    public Libro guardar(Libro lib) {
        listaLibros.add(lib);
        return lib;
    }

    //Metodo que actualiza el libro por el id, retorna libro actualizado: actualizar
    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++ ) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    //metodo de eliminar un libro mediante su id
    public void eliminar(int id) {
        //alternativa 1
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
        }

        //alternativa 2
          int idPosicion = 0;
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == id) {
                idPosicion = i;
                break;
            }
        }
        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);
        }
         //otra alternativa
        listaLibros.removeIf(x -> x.getId() == id);
    }




}
