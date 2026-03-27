package edu.transport;

public class Mobil extends Kendaraan{
    public String getNama(){
        return super.getNama();
    }

    @Override
    double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif=0.8* getKecepatanMaks();
        return jarak/kecepatanEfektif;
    }

    public Mobil(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks=kecepatanMaks;
    }


}
