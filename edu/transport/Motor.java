package edu.transport;

public class Motor extends Kendaraan{
    public String getNama(){
        return super.getNama();
    }

    @Override
    double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif=0.9* getKecepatanMaks();
        return jarak/kecepatanEfektif;
    }

    public Motor(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks=kecepatanMaks;
    }
}
