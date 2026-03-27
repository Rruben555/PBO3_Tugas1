package edu.university.model;
import java.util.ArrayList;


public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk){
        this.nim=nim;
        this.nama=nama;
        this.ipk=ipk;
    }

    public void getKategoriIPK(){
        if (this.ipk>=3.5){
            System.out.println("Cumlaude");
        } else if (this.ipk>=3.0){
            System.out.println("Sangat Semuaskan");
        } else if (this.ipk>=2.5){
            System.out.println("Memuaskan");
        } else{
            System.out.println("Perlu Perbaikan");
        }
        System.out.println("\n");
    }

    public void getInfo(){
        System.out.println("NIM: "+this.nim);
        System.out.println("Nama: "+this.nama);
        System.out.println("IPK: "+this.ipk);
        getKategoriIPK();
    }
}
