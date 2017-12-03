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
public class Jadwal {
    public String kdt_kbr;
    private String tanggal;
    private String terminal;
    private String kodePenerbangan;

    public Jadwal(String kdt_kbr, String tanggal, String terminal, String kodePenerbangan) {
       this.kdt_kbr=kdt_kbr;
        this.tanggal = tanggal;
        this.terminal = terminal;
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getKdt_kbr() {
        return kdt_kbr;
    }

    public void setKdt_kbr(String kdt_kbr) {
        this.kdt_kbr = kdt_kbr;
    }


    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

  
    
}
