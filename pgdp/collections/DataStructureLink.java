package pgdp.collections;

public class DataStructureLink<T>  {
    private DataStructureConnector<T> a;
    private DataStructureConnector<T> b;

    public DataStructureLink(DataStructureConnector<T> a, DataStructureConnector<T> b) {
        this.a = a;
        this.b = b;
    }


    public boolean moveNextFromAToB(){
        if(!a.hasNextElement()){
            return false;
        }else
        b.addElement(a.removeNextElement());
        return true;

    }

    public void moveAllFromAToB(){
            while(a.hasNextElement()){
                moveNextFromAToB();
            }
    }


}
