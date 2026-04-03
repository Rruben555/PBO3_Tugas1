package edu.university.main;

import edu.university.model.Mahasiswa;
import edu.university.staff.Dosen;
import edu.university.staff.Pegawai;
import edu.university.staff.StafAdministrasi;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args){
        //1
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();

        Mahasiswa mahasiswa1=new Mahasiswa("1", "Ade", 3.7);
        Mahasiswa mahasiswa2=new Mahasiswa("2", "Budi", 2.7);
        Mahasiswa mahasiswa3=new Mahasiswa();

        mahasiswa.add(mahasiswa1);
        mahasiswa.add(mahasiswa2);
        mahasiswa.add(mahasiswa3);

        for (Mahasiswa mhs : mahasiswa) {
            mhs.getInfo();
        }

        mahasiswa3.updateData("3", "Ade", 1.7);
        mahasiswa3.getInfo();

        //2
        ArrayList<Pegawai> pegawai = new ArrayList<Pegawai>();

        Pegawai dosen1=new Dosen("Adi", 5000000, 10);
        Pegawai dosen2=new Dosen("Dani", 6000000, 7);
        Pegawai staf1=new StafAdministrasi("Caca", 4500000,2);
        Pegawai staf2 =new StafAdministrasi("Rara", 4000000,6);

        pegawai.add(dosen1);
        pegawai.add(dosen2);
        pegawai.add(staf1);
        pegawai.add(staf2);

        for(Pegawai p : pegawai){
            p.getInfo();
        }

    }

}
