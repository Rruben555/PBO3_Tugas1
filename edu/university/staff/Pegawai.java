package edu.university.staff;

public class Pegawai {
    public String nama;
    public double gajiPokok;

    public Pegawai(String nama, double gajiPokok){
        this.nama=nama;
        this.gajiPokok=gajiPokok;
    }

    public double hitungGaji(){
        return this.gajiPokok;
    }

    public String getNama(){
        return this.nama;
    }

    public void getInfo(){
        System.out.println("Nama: "+this.getNama());
        System.out.println("Gaji: Rp."+this.hitungGaji());
    }
}
