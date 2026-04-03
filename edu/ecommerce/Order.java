package edu.ecommerce;

public class Order {
    public String orderId;
    public String customerName;
    public int total;

    public Order(String orderId, String customerName){
        this.orderId=orderId;
        this.customerName=customerName;
    }

    static class OrderItem{
        final String namaProduk;
        final double price;
        final int quantity;

        public OrderItem(String namaProduk, double price, int quantity){
            this.namaProduk = namaProduk;
            this.price = price;
            this.quantity = quantity;
        }

        public String getNamaProduk(){
            return this.namaProduk;
        }

        public int getQuantity(){
            return this.quantity;
        }

        public double getSubtotal(){
            return this.price*this.quantity;
        }
    }

    public double hitungTotal(OrderItem[] items){
        double total = 0;

        for (OrderItem item : items) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void tampilkanRincian(OrderItem[] items){
        System.out.println("Nama Pelanggan: "+this.customerName);
        System.out.println("ID Order: "+this.orderId);

        for(OrderItem itemList : items){
            System.out.print(itemList.getNamaProduk());
            System.out.print("  "+itemList.getQuantity());
            System.out.print("  Rp."+itemList.getSubtotal()+"\n");
        }

        System.out.println("Total: Rp."+this.hitungTotal(items));

    }
}
