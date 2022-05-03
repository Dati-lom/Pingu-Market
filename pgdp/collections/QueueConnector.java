package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T>{


    private final Queue<T> y;

    public QueueConnector(Queue<T> y) {
        this.y = y;
    }

    @Override
    public boolean hasNextElement() {
        return !y.isEmpty();
    }

    @Override
    public void addElement(T value) {
        y.enqueue(value);
    }

    @Override
    public T removeNextElement() {
        if(y != null) {
            return y.dequeue();
        } return null;
    }
}
