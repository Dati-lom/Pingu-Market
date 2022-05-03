package pgdp.collections;

public class PenguinSupermarket {

    private Checkout[] checkouts ;



    public PenguinSupermarket(int numregisters) {
        if(numregisters <= 0){
            ExceptionUtil.illegalArgument("amount cant be negative or 0");
        }
        checkouts = new Checkout[numregisters];

        for(int i = 0; i < numregisters;i++){
            checkouts[i] = new Checkout();
        }

    }
    public Checkout[] getCheckouts() {
        return checkouts;
    }


    public Checkout getCheckoutWithSmallestQueue(){
            int n = Integer.MAX_VALUE;
            Checkout smallest = null;

            for (int i = 0; i < checkouts.length; i++) {

                if (checkouts[i] != null &&checkouts[i].getQueue().size() < n ) {
                    n = checkouts[i].queueLength();
                    smallest = checkouts[i];
                }
            }
            return smallest;
        }


public void closeCheckout(int index){
        if(index < 0 || index >= checkouts.length){ExceptionUtil.illegalArgument("Illegal, index can not be less than 0");}
        if(checkouts.length == 1){ExceptionUtil.illegalArgument("Can not close last checkout, because busimess ");}
      int newindex = 0;
        Checkout closed = checkouts[index];

        Checkout[] newarr = new Checkout[checkouts.length - 1];

        for(int i = 0;i < checkouts.length; i++){
            if(i != index){
                newarr[newindex] = checkouts[i];
                newindex++;
            }

            }
        checkouts = newarr;


        LinkedStack<PenguinCustomer>b = new LinkedStack<>();
       QueueConnector<PenguinCustomer> a = new QueueConnector<>(closed.getQueue());
       StackConnector<PenguinCustomer> c = new StackConnector<>(b);
       DataStructureLink<PenguinCustomer> connect = new DataStructureLink<>(a,c);
       connect.moveAllFromAToB();


       for(int i = 0;i < b.size(); i++){

           b.pop().goToCheckout(this);
       }
}

public void serveCustomers(){
        for(int i = 0; i < checkouts.length; i++){
            checkouts[i].serveNextCustomer();
        }
}

}
