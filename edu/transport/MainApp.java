package edu.transport;

public class MainApp {
    public static void main(String[] args){
        double jarak=120;
        Mobil mobil=new Mobil("Toyota",60);
        mobil.getInfo(jarak);

        Motor motor=new Motor("Honda", 50);
        motor.getInfo(jarak);
    }
}
