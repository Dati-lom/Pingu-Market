package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T>{

    private final Stack<T> x;

    public StackConnector(Stack<T> x) {
        this.x = x;
    }

    @Override
    public boolean hasNextElement() {
        return !x.isEmpty();
    }

    @Override
    public void addElement(T value) {
        x.push(value);

    }

    @Override
    public T removeNextElement() {
        if(x != null) {
            return x.pop();
        } return null;

    }
}


