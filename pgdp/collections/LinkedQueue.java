package pgdp.collections;

public class LinkedQueue<T> implements Queue<T> {
    private List<T> first;
    private List<T> last;

    public LinkedQueue() {
        first = last = null;
    }

    @Override
    public int size() {
        if(first != null){
            return  first.length();
        } else return 0;

    }

    @Override
    public boolean isEmpty() {
        return first == null;

    }

    @Override
    public void enqueue(T value) {
        if (first == null) {
            first =last = new List<>(value);;
        }
        else {
            last.setNext(new List<>(value)) ;
            last = last.getNext();
        }
    }

    @Override
    public T dequeue() {
        if(first == null){first = last; return null;}
        T result = first.getInfo();
        if(last == first) last  = null;
        first = first.getNext();
        return result;
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
