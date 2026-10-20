package TDAs;

import java.util.ArrayList;
import java.util.Comparator;

public class TreeMap<K,V> extends AbstractSortedMap<K,V> {

    // Requiere la clase LinkedBinaryTree y la interfaz Position del Capítulo 8
    protected LinkedBinaryTree<Entry<K,V>> tree = new LinkedBinaryTree<>();

    public TreeMap() {
        super();
        tree.addRoot(null);
    }

    public TreeMap(Comparator<K> comp) {
        super(comp);
        tree.addRoot(null);
    }

    public int size() {
        return (tree.size() - 1) / 2;
    }

    private void expandExternal(Position<Entry<K,V>> p, Entry<K,V> entry) {
        tree.set(p, entry);
        tree.addLeft(p, null);
        tree.addRight(p, null);
    }

    protected Position<Entry<K,V>> root() { return tree.root(); }

    private Position<Entry<K,V>> treeSearch(Position<Entry<K,V>> p, K key) {
        if (tree.isExternal(p))
            return p;
        int comp = compare(key, p.getElement());
        if (comp == 0)
            return p;
        else if (comp < 0)
            return treeSearch(tree.left(p), key);
        else
            return treeSearch(tree.right(p), key);
    }

    public V get(K key) {
        Position<Entry<K,V>> p = treeSearch(root(), key);
        if (tree.isExternal(p)) return null;
        return p.getElement().getValue();
    }

    public V put(K key, V value) {
        Entry<K,V> newEntry = new MapEntry<>(key, value);
        Position<Entry<K,V>> p = treeSearch(root(), key);
        if (tree.isExternal(p)) {
            expandExternal(p, newEntry);
            return null;
        } else {
            V old = p.getElement().getValue();
            tree.set(p, newEntry);
            return old;
        }
    }

    public V remove(K key) {
        Position<Entry<K,V>> p = treeSearch(root(), key);
        if (tree.isExternal(p)) {
            return null;
        } else {
            V old = p.getElement().getValue();
            if (tree.isInternal(tree.left(p)) && tree.isInternal(tree.right(p))) {
                Position<Entry<K,V>> replacement = treeMax(tree.left(p));
                tree.set(p, replacement.getElement());
                p = replacement;
            }
            Position<Entry<K,V>> leaf = (tree.isExternal(tree.left(p)) ? tree.left(p) : tree.right(p));
            tree.remove(leaf);
            tree.remove(p);
            return old;
        }
    }

    protected Position<Entry<K,V>> treeMax(Position<Entry<K,V>> p) {
        Position<Entry<K,V>> walk = p;
        while (tree.isInternal(walk))
            walk = tree.right(walk);
        return tree.parent(walk);
    }

    public Iterable<Entry<K,V>> entrySet() {
        ArrayList<Entry<K,V>> buffer = new ArrayList<>(size());
        for (Position<Entry<K,V>> p : tree.inorder())
            if (tree.isInternal(p)) buffer.add(p.getElement());
        return buffer;
    }
}