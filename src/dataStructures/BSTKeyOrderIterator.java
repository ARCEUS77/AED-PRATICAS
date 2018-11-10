package dataStructures;

public class BSTKeyOrderIterator<K,V> implements Iterator<Entry<K,V>> {

    protected BSTKeyOrderIterator() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Entry<K, V> next() throws NoSuchElementException {
        return null;
    }

    @Override
    public void rewind() {

    }
}
