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
public class Pramugari extends Karyawan{
    private String kedudukan;

    public Pramugari(String nama, String umur, String jenisKelamin,String kedudukan) {
        super(nama, umur, jenisKelamin);
        setKedudukan(kedudukan);
    }

   

    public String getKedudukan() {
        return kedudukan;
    }

    public void setKedudukan(String kedudukan) {
        this.kedudukan = kedudukan;
    }
    
    
}
