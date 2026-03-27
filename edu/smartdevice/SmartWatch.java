package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable{
    public int battery;
    public String ssid;

    public SmartWatch(int battery, String ssid){
        this.battery=battery;
        this.ssid=ssid;
    }

    @Override
    public void chargeBattery(int menit){
        this.battery+=menit;
        if(this.battery>100){
            this.battery=100;
        }
    }

    @Override
    public int getBatteryLevel(){
        return this.battery;
    }

    @Override
    public void connectWifi(String ssid){
        this.ssid=ssid;
        isConnected();
    }

    @Override
    public boolean isConnected() {
        if (ssid != "") {
            System.out.println("Terhubung dengan "+this.ssid+"\n");
            return true;
        } else {
            System.out.println("Tidak Terhubung ke WiFi\n");
            return false;
        }
    }

    public void getInfo(){
        System.out.println("Battery Level: "+this.getBatteryLevel()+"%");
        System.out.print("Connection: ");
        this.isConnected();
    }


}
