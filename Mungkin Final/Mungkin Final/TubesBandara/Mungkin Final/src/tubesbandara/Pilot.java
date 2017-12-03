/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesbandara;

/**
 *
 * @author frsluthfi
 */
public class Pilot extends Karyawan{
    private String jabatan;
    private String jamTerbang;

    public Pilot(String nama, String umur, String jenisKelamin, String jabatan,String jamTerbang) {
        super(nama, umur, jenisKelamin);
        setJabatan(jabatan);
        setJamTerbang(jamTerbang);
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJamTerbang() {
        return jamTerbang;
    }

    public void setJamTerbang(String jamTerbang) {
        this.jamTerbang = jamTerbang;
    }
    
    
}
