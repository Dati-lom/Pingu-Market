package pgdp.collections;

public class LinkedStack<T> implements Stack<T> {

    private List<T> top;

    @Override
    public int size() {
        if(top != null){
            return top.length();
        }
        return 0;

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T value) {

        if(top != null)
        {
            top = new List<>((T) value, top);
        }else
            top = new List<>((T) value);
    }

    @Override
    public T pop() {

        if(top == null)
        {
            return null;
        }
        T result = top.getInfo();
            top = top.getNext();
            return result;


    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                '}';
    }
}
