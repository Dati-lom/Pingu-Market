package pgdp.collections;

public interface Queue<T> extends DataStructure{
    void enqueue(T value);
    T dequeue();
}
