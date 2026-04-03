package edu.transport;

public abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;

    abstract double hitungWaktuTempuh(double jarak);


    public String getNama() {
        return nama;
    }
    public double getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setKendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks=kecepatanMaks;
    }

    public void getInfo(double jarak){
        System.out.println("Nama: "+this.nama);
        System.out.println("Waktu Tempuh: "+String.format("%.2f", hitungWaktuTempuh(jarak))+" jam\n");
    }

}
