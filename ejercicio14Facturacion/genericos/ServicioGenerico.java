package genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico <T extends Identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>(); 

    // public ServicioGenerico() {
    //     datos = new ArrayList<>();
    // }

    //Metodo buscar elemento por ID
    public T buscarPorId(ID id) {
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        // System.out.println("Elemento con ID: " + id + ", no encontrado.");
        return null; // Si no se encuentra el elemento, se retorna null
    }
    
    //Metodo para guardar sin duplicados
    public boolean guardarSinDuplicados(T elemento) {
        if (buscarPorId(elemento.getId()) == null) {
            datos.add(elemento);
            System.out.println("Agregado: " + elemento);
            // System.out.println("Elemento con ID: " + elemento.getId() + ", agregado.");
            return true; // Elemento agregado exitosamente
        }
        System.out.println("El elemento con ID: " + elemento.getId() + ", ya existe.");
        return false; // Elemento con el mismo ID ya existe
    }

    //Metodo para listar todos los elementos
    public List<T> listarTodos() {
        return new ArrayList<>(datos);
    }

    //Metodo para actualizar un elemento por ID
    public boolean actualizarPorId(ID id, T nuevoElemento) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {  //get(i) obtiene el elemento en la posicion i
                datos.set(i, nuevoElemento);        //set(i, nuevoElemento) actualiza el elemento en la posicion i
                System.out.println("Elemento con ID: " + id + ", actualizado con: " + nuevoElemento);
                return true;
            }
        }
        System.out.println("Elemento con ID: " + id + ", no encontrado.");
        return false; // Si no se encuentra el elemento, se retorna false
    } 

    //Metodo para eliminar un elemento por ID
    public boolean eliminarPorId(ID id) {
        for (int i = 0; i< datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {  //get(i) obtiene el elemento en la posicion i
                datos.remove(i);                    //remove(i) elimina el elemento en la posicion i
                System.out.println("Elemento con ID: " + id + ", eliminado.");
                return true; // Elemento eliminado exitosamente
            }
        }
        System.out.println("Elemento con ID: " + id + ", no encontrado.");
        return false; // Si no se encuentra el elemento, se retorna false
    }
       
}
