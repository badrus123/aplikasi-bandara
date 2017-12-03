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
public class Maskapai {
    private String namaMaskapai;
    private String rating;

    public Maskapai(String namaMaskapai, String rating) {
        this.namaMaskapai = namaMaskapai;
        this.rating = rating;
    }



    public String getNamaMaskapai() {
        return namaMaskapai;
    }

    public void setNamaMaskapai(String namaMaskapai) {
        this.namaMaskapai = namaMaskapai;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
}
