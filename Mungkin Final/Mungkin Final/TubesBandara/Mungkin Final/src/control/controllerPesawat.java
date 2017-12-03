
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import tubesbandara.*;
import control.*;
import database.Database;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
/**
 *
 * @author FARIS
 */
public class controllerPesawat implements ActionListener {
    private PesawatView view;
    private ArrayList daftarPesawat;
    private ArrayList<Maskapai> daftarMaskapai;
    private ArrayList<Rute> daftarRute;
    private ArrayList<Jadwal> daftarJadwal;
    private Database db;
    
        public controllerPesawat(){
            view = new PesawatView();
            view.setVisible(true);
            view.addListener(this);
            daftarPesawat = new ArrayList();
            daftarMaskapai = new ArrayList();
            daftarRute = new ArrayList();
            daftarJadwal = new ArrayList();
            this.daftarPesawat = daftarPesawat;
            this.daftarJadwal = daftarJadwal;
            this.daftarMaskapai = daftarMaskapai;
            this.daftarRute = daftarRute;
            db = new Database();
            db.connect();
        }
         public void refreshListPilot(){
        try{
            ResultSet rs = db.getData("select * from pilot");
            daftarPesawat.removeAll(daftarPesawat);
            String temp = "";
            
            while(rs.next()){
                Maskapai a = new Maskapai(rs.getString("nama_maskapai"), rs.getString("rating"));//ini gabung, instansiasi Buku
                jenisPesawat b = new jenisPesawat(rs.getString("jarak_Tempuh"),rs.getString("kapasitas_penumpang"));
                Jadwal c =new Jadwal(rs.getString("kdt_kbr"),rs.getString("tanggal"),rs.getString("terminal"),rs.getString("kode_penerbangan"));
                Rute d = new Rute(rs.getString("kota_asal"),rs.getString("kota_tujuan"),rs.getString("jarak"));
                daftarPesawat.add(a);
                daftarPesawat.add(b);
                daftarPesawat.add(c);
                daftarPesawat.add(d);
                 temp = temp + "===================" + "\n"
                         + "Nama : " + rs.getString("nama") + "\n"
                         + "Umur : " + rs.getString("umur") + "\n"
                         + "Jenis Kelamin : " + rs.getString("jenis_kelamin") + "\n"
                         + "Jabatan : " + rs.getString("jabatan") + "\n"
                         + "Jam Terbang : " + rs.getString("jam_terbang") + "\n";
            }
            view.getShowroom().setText(temp);
        }catch(Exception e){
            System.out.println("Error refresh" +e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnBack())){
            controllerHome ho = new controllerHome();
            view.dispose();
        }
        try{
            if (source.equals(view.getAddMaskapai())) {
                    String str = "insert into pesawat(nama_maskapai, rating, jarak_tempuh, kapasitas_penumpang,  kdt_kbr, tanggal, terminal, kode_penerbangan, kota_asal, kota_tujuan, jarak) "
                            + "values('"
                                  + view.getNamaMaskapai()+ "','" + view.getRatingMaskapai()+ "','" + view.getJarakTempuh() + "','"  
                            + view.getKapasitasPesawat()+ "','" + view.getBebas()
                             + "','" + view.getTanggal() + 
                            "','" + view.getTerminal() + "','" + view.getKodePenerbangan()+ 
                            "','" + view.getKotaAsal() + "','" + view.getKotaTujuan() +
                            "','" + view.getJarak() + "')";
                    db.query(str);
                    System.out.println(str);
                }
            }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        }
    }
