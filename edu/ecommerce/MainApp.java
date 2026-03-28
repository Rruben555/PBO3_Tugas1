package edu.ecommerce;

public class MainApp {
    public static void main(String[] args){
        Order.OrderItem[] items = new Order.OrderItem[3];
        Order order=new Order("1", "Andi");

        items[0]=new Order.OrderItem("Le Minerale",3000,2);
        items[1]=new Order.OrderItem("Oreo",6000,4);
        items[2]=new Order.OrderItem("Indomie", 3500, 10);

        order.tampilkanRincian(items);
    }
}
