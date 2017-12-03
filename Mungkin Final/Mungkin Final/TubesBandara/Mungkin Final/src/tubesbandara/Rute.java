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
public class Rute {
   private String kotaAsal; 
   private String kotaTujuan;
   private String jarak;

    public Rute(String kotaAsal, String kotaTujuan, String jarak) {
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.jarak = jarak;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
   
   
}
