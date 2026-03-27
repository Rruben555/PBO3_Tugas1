package edu.smartdevice;

public class Main {
    public static void main(String[] args){
        SmartWatch smartWatch=new SmartWatch(70, "");
        smartWatch.getInfo();
        smartWatch.connectWifi("10101");
        smartWatch.chargeBattery(40);
        smartWatch.getInfo();
    }
}
