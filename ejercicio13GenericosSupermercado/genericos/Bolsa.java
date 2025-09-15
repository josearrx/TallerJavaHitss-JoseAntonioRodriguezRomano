package genericos;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> elementos = new ArrayList<>();
    private final int MAX = 5; // máximo 5 productos

    public void add(T elemento) {
        if (elementos.size() < MAX) {
            elementos.add(elemento);
        } else {
            System.out.println("La bolsa ya está llena (máx " + MAX + ")");
        }
    }

    public List<T> getElementos() {
        return elementos;
    }
}
