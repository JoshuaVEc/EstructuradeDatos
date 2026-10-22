package EI;

import TDAs.LinkedBinaryTree;
import TDAs.Position;

public class EI04_InventarioModelo {
    private LinkedBinaryTree<EI04_Libro> arbol;

    public EI04_InventarioModelo() {
        this.arbol = new LinkedBinaryTree<>();
    }

    public void insertarLibro(EI04_Libro libro) {
        if (arbol.isEmpty()) {
            arbol.addRoot(libro);
        } else {
            insertarRecursivo(arbol.root(), libro);
        }
    }

    private void insertarRecursivo(Position<EI04_Libro> p, EI04_Libro nuevoLibro) {
        if (nuevoLibro.getIsbn() < p.getElement().getIsbn()) {
            if (arbol.left(p) == null) arbol.addLeft(p, nuevoLibro);
            else insertarRecursivo(arbol.left(p), nuevoLibro);
        } else if (nuevoLibro.getIsbn() > p.getElement().getIsbn()) {
            if (arbol.right(p) == null) arbol.addRight(p, nuevoLibro);
            else insertarRecursivo(arbol.right(p), nuevoLibro);
        }
    }

    public EI04_Libro buscarLibro(int isbn) {
        Position<EI04_Libro> resultado = buscarRecursivo(arbol.root(), isbn);
        return (resultado != null) ? resultado.getElement() : null;
    }

    private Position<EI04_Libro> buscarRecursivo(Position<EI04_Libro> p, int isbn) {
        if (p == null) return null;
        if (p.getElement().getIsbn() == isbn) return p;

        if (isbn < p.getElement().getIsbn()) {
            return buscarRecursivo(arbol.left(p), isbn);
        } else {
            return buscarRecursivo(arbol.right(p), isbn);
        }
    }

    public int getTotalLibros() {
        return arbol.size();
    }
}