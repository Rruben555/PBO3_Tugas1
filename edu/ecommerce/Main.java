package edu.ecommerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Order.OrderItem> items=new ArrayList<Order.OrderItem>();
        Order order=new Order("1", "Andi");

        Order.OrderItem item1=new Order.OrderItem("Le Minerale",3000,2);
        Order.OrderItem item2=new Order.OrderItem("Oreo",6000,4);
        Order.OrderItem item3=new Order.OrderItem("Indomie", 3500, 10);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        order.getInfo(items);


    }
}
