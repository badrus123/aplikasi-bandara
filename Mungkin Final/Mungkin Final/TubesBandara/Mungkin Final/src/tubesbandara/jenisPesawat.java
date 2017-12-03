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
public class jenisPesawat {
    private String jarakTempuh;
    private String kapasitasPenumpang;

    public jenisPesawat(String jarakTempuh, String kapasitasPenumpang) {
        this.jarakTempuh = jarakTempuh;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(String jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public String getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(String kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

  
    
}
