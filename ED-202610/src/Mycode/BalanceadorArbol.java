package Mycode;

import TDAs.TreeMap;
import TDAs.Entry;
import java.util.ArrayList;
import java.util.List;

public class BalanceadorArbol {

    /**
     * Método externo que recibe un TreeMap desbalanceado y retorna una nueva
     * instancia de TreeMap con las mismas entradas pero con estructura balanceada.
     */
    public static <K, V> TreeMap<K, V> balancear(TreeMap<K, V> arbolOriginal) {
        if (arbolOriginal == null || arbolOriginal.isEmpty()) {
            return arbolOriginal;
        }

        // 1. Extrae todas las entradas usando el recorrido in-order que provee entrySet()
        List<Entry<K, V>> listaOrdenada = new ArrayList<>();
        for (Entry<K, V> entrada : arbolOriginal.entrySet()) {
            listaOrdenada.add(entrada);
        }

        // 2. Crea un nuevo TreeMap limpio
        TreeMap<K, V> arbolBalanceado = new TreeMap<>();

        // 3. Reconstruye el nuevo árbol insertando sucesivamente los elementos centrales
        construirBalanceadoRecursivo(arbolBalanceado, listaOrdenada, 0, listaOrdenada.size() - 1);

        return arbolBalanceado;
    }

    private static <K, V> void construirBalanceadoRecursivo(TreeMap<K, V> destino,
                                                            List<Entry<K, V>> lista,
                                                            int inicio, int fin) {
        if (inicio > fin) {
            return;
        }

        // Selecciona la mediana del rango actual
        int medio = (inicio + fin) / 2;
        Entry<K, V> centro = lista.get(medio);

        // Inserta la entrada en el nuevo árbol
        destino.put(centro.getKey(), centro.getValue());

        // Procesa la mitad izquierda
        construirBalanceadoRecursivo(destino, lista, inicio, medio - 1);

        // Procesa la mitad derecha
        construirBalanceadoRecursivo(destino, lista, medio + 1, fin);
    }
}