package TDAs;

import java.util.Comparator;

public abstract class AbstractSortedMap<K,V> extends AbstractMap<K,V> {
    private Comparator<K> comp;

    protected AbstractSortedMap(Comparator<K> c) { comp = c; }

    // Asume el orden natural si las claves implementan Comparable
    protected AbstractSortedMap() {
        this(new Comparator<K>() {
            @SuppressWarnings("unchecked")
            public int compare(K a, K b) {
                return ((Comparable<K>) a).compareTo(b);
            }
        });
    }

    protected int compare(Entry<K,V> a, Entry<K,V> b) {
        return comp.compare(a.getKey(), b.getKey());
    }

    protected int compare(K a, Entry<K,V> b) {
        return comp.compare(a, b.getKey());
    }

    protected int compare(Entry<K,V> a, K b) {
        return comp.compare(a.getKey(), b);
    }

    protected int compare(K a, K b) {
        return comp.compare(a, b);
    }
}