package pgdp.collections;

public class Checkout {
    private  Queue<PenguinCustomer> queue;
    private   Queue<FishyProduct> before;
    private   Queue<FishyProduct> after;

    public Queue<PenguinCustomer> getQueue() {
        return queue;
    }

    public Queue<FishyProduct> getBandBeforeCashier() {
        return before;
    }

    public Queue<FishyProduct> getBandAfterCashier() {
        return after;
    }

    public Checkout() {
        this.queue = new LinkedQueue<>();
        this.before = new LinkedQueue<>();
        this.after = new LinkedQueue<>();
    }

    public int queueLength(){

        if(queue != null){
            return queue.size();
        }
        return 0;
    }

    public void serveNextCustomer(){
        PenguinCustomer first = queue.dequeue();
        if(first == null){
           return;
        }
        first.placeAllProductsOnBand(before);
        int total=0;
        for(int i = 0; i < before.size(); i++){
            FishyProduct f = before.dequeue();
            total = total +f.getPrice();
            after.enqueue(f);
        }
        first.takeAllProductsFromBand(after);
        first.pay(total);
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "queue=" + queue +
                ", before=" + before +
                ", after=" + after +
                '}';
    }
}


