package edu.university.model;


public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa() {
        this.nim = "-";
        this.nama = "Belum Diisi";
        this.ipk = 0.0;
    }

    public Mahasiswa(String nim, String nama, double ipk){
        this.nim=nim;
        this.nama=nama;
        this.ipk=ipk;
    }

    public void editNim(String nim) {
        this.nim = nim;
    }

    public void editNama(String nama) {
        this.nama = nama;
    }

    public void editIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Peringatan: IPK " + ipk + " tidak valid!");
        }
    }

    public void updateData(String nim, String nama, double ipk) {
        editNim(nim);
        editNama(nama);
        editIpk(ipk);
        System.out.println("Data mahasiswa telah diperbarui.\n");
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
