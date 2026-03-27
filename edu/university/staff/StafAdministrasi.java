package edu.university.staff;

public class StafAdministrasi extends Pegawai{
    public int jamLembur;

    public StafAdministrasi(String nama, double gajiPokok, int jamLembur){
        super(nama,gajiPokok);
        this.jamLembur=jamLembur;
    }
    @Override
    public double hitungGaji(){
        return (gajiPokok+(this.jamLembur*50000));
    }
}
