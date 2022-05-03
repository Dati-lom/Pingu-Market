package pgdp.collections;

import java.util.Queue;

public class main {
    public static void main(String[] args) {
//        LinkedStack<String> temp12 = new LinkedStack<String>();
//        temp12.push("A");
//        System.out.println(temp12.size());
//        temp12.push("B");
//        System.out.println(temp12.size());
//        System.out.println(temp12.pop());
//        System.out.println(temp12.size());
//        System.out.println(temp12.pop());
//        System.out.println(temp12.size());
//        System.out.println(temp12.pop());

        PenguinSupermarket supermarket = new PenguinSupermarket(3);
        System.out.println(supermarket.getCheckouts().length);


        StackConnector<String> temp = new StackConnector<>(new LinkedStack<>());
        StackConnector<String> temp1 = new StackConnector<>(new LinkedStack<>());
        temp.addElement("A");
        temp.addElement("B");
        temp.addElement("C");
        temp1.addElement("A1");
        temp1.addElement("B1");
        temp1.addElement("C1");
        DataStructureLink<String> temp2 = new DataStructureLink<>(temp, temp1);
        temp2.moveNextFromAToB();
        temp2.moveNextFromAToB();
        temp2.moveAllFromAToB();
        FishyProduct one = new FishyProduct("Micro", 1);
        FishyProduct two = new FishyProduct("Fish", 2);
        FishyProduct three = new FishyProduct("Soft", 3);
        PenguinCustomer first = new PenguinCustomer("A", 15);
        PenguinCustomer second = new PenguinCustomer("B", 3);
        PenguinCustomer third = new PenguinCustomer("C", 10);
        PenguinCustomer forth = new PenguinCustomer("D", 10);
        first.addProductToBasket(one);
        first.addProductToBasket(one);
        first.addProductToBasket(three);
        first.addProductToBasket(three);
        first.addProductToBasket(two);
//        System.out.println(first.getMoney());

        second.addProductToBasket(one);
        second.addProductToBasket(one);
//        System.out.println(second.getMoney());

        LinkedQueue<FishyProduct> inv2 = new LinkedQueue<>();
        third.addProductToBasket(one);
        third.addProductToBasket(two);
        third.addProductToBasket(three);
        System.out.println(third.getProducts().size());
//        while (!third.getProducts().isEmpty()) System.out.println(third.getProducts().pop());
        third.placeAllProductsOnBand(inv2);
//        while (!third.getProducts().isEmpty()) System.out.println(third.getProducts().pop());
//        System.out.println(third.getMoney());


        LinkedQueue<FishyProduct> inv1 = new LinkedQueue<>();
        inv1.enqueue(one);
        inv1.enqueue(two);
        inv1.enqueue(three);

        first.goToCheckout(supermarket);
        second.goToCheckout(supermarket);
        third.goToCheckout(supermarket);
        forth.goToCheckout(supermarket);

        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
        System.out.print("Checkout 0 : ");
        System.out.println(supermarket.getCheckouts()[0]);

        System.out.println(supermarket.getCheckouts()[1].getQueue().size());
        System.out.print("Checkout 1 : ");
        System.out.println(supermarket.getCheckouts()[1]);

        System.out.println(supermarket.getCheckouts()[2].getQueue().size());
        System.out.print("Checkout 2 : ");
        System.out.println(supermarket.getCheckouts()[2]);


//        System.out.print("0: ");
//        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
//        System.out.print("1: ");
//        System.out.println(supermarket.getCheckouts()[1].getQueue().size());
//        System.out.print("2: ");
//        System.out.println(supermarket.getCheckouts()[2].getQueue().size());

        PenguinCustomer fifth = new PenguinCustomer("E", 100);
        fifth.goToCheckout(supermarket);

//        System.out.println("Checkouts: " + supermarket.getCheckouts().length);
//        System.out.print("0: ");
//        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
//        System.out.print("1: ");
//        System.out.println(supermarket.getCheckouts()[1].getQueue().size());
//        System.out.print("2: ");
//        System.out.println(supermarket.getCheckouts()[2].getQueue().size());


        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
        System.out.print("Checkout 0 : ");
        System.out.println(supermarket.getCheckouts()[0]);

        System.out.println(supermarket.getCheckouts()[1].getQueue().size());
        System.out.print("Checkout 1 : ");
        System.out.println(supermarket.getCheckouts()[1]);

        System.out.println(supermarket.getCheckouts()[2].getQueue().size());
        System.out.print("Checkout 2 : ");
        System.out.println(supermarket.getCheckouts()[2]);

        System.out.print("Customer  : ");
        System.out.println(first);

        System.out.print("Customer : ");
        System.out.println(second);

        System.out.print("Customer : ");
        System.out.println(third);

        System.out.print("Customer : ");
        System.out.println(forth);

        System.out.print("Customer : ");
        System.out.println(fifth);


        supermarket.closeCheckout(0);
        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
        System.out.println(supermarket.getCheckouts()[1]);
        System.out.println(supermarket.getCheckouts()[1].getQueue().size());

        System.out.print("Checkout 1 : ");
        System.out.println(supermarket.getCheckouts()[0]);

        System.out.print("Checkout 2 : ");
        System.out.println(supermarket.getCheckouts()[1]);

        System.out.println("Checkouts: " + supermarket.getCheckouts().length);
        supermarket.serveCustomers();


        System.out.print("Checkout 1 : ");
        System.out.println(supermarket.getCheckouts()[0]);

        System.out.print("Checkout 2 : ");
        System.out.println(supermarket.getCheckouts()[1]);

        System.out.print("Customer  : ");
        System.out.println(second);

        System.out.print("Customer : ");
        System.out.println(third);




//        supermarket.serveCustomers();
//        System.out.print("0: ");
//        supermarket.getCheckouts()[0].getQueue().toStringP();
//        System.out.println("2: ");
//        supermarket.getCheckouts()[1].getQueue().toStringP();
//
//        supermarket.closeCheckout(0);
//        System.out.print("0: ");
//        System.out.println(supermarket.getCheckouts()[0].getQueue().size());
//
//        supermarket.serveCustomers();
//        System.out.print("0: ");
//        supermarket.getCheckouts()[0].getQueue().toString();
//
//        supermarket.serveCustomers();
//        System.out.print("0: ");
//        supermarket.getCheckouts()[0].getQueue().toString();

    }
}