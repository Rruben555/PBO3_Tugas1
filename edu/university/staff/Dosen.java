package edu.university.staff;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public Dosen(String nama, double gajiPokok, int jumlahSKS){
        super(nama,gajiPokok);
        this.jumlahSKS=jumlahSKS;
    }

    @Override
    public double hitungGaji(){
        return (gajiPokok+(this.jumlahSKS*150000));
    }
}
