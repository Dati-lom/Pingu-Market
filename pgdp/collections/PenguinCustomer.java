package pgdp.collections;

public class PenguinCustomer {

    private final String name;
    private  int money;
    private  Stack<FishyProduct> products;

    public PenguinCustomer(String name, int money) {
        if (money < 0){
            ExceptionUtil.illegalArgument("Should have money");
        }
        if (name == null){
            ExceptionUtil.illegalArgument("Needs name");
        }
        this.name = name;
        this.money = money;
        this.products = new LinkedStack<>();
    }

    public int getMoney() {return money;}
    public String getName() {return name;}


    public Stack<FishyProduct> getProducts() {
        return  products;

    }

     public void addProductToBasket(FishyProduct product){
        products.push(product);
    }

    public void placeAllProductsOnBand(Queue<FishyProduct> band){
            StackConnector<FishyProduct> a = new StackConnector<>(products);
            QueueConnector<FishyProduct> b = new QueueConnector<>(band);
            DataStructureLink<FishyProduct> connector = new DataStructureLink<>(a, b);
            connector.moveAllFromAToB();
    }

    public void takeAllProductsFromBand(Queue<FishyProduct> band){
            QueueConnector<FishyProduct> b = new QueueConnector<>(band);
            StackConnector<FishyProduct> a = new StackConnector<>(products);
            DataStructureLink<FishyProduct> connector = new DataStructureLink<>(b, a);
            connector.moveAllFromAToB();
    }

    public void pay(int value){
        if(money < 0 || value < 0 || money - value < 0) {
            ExceptionUtil.illegalArgument("Illegal, money can not be negative");
        }
        money = money - value;
    }

    public void goToCheckout(PenguinSupermarket market) {
            market.getCheckoutWithSmallestQueue().getQueue().enqueue(this);
    }

    @Override
    public String toString() {
        return "PenguinCustomer{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
