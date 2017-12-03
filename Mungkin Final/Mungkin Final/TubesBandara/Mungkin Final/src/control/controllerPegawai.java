/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.*;
import database.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import view.*;
import tubesbandara.*;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
/**
 *
 * @author FARIS
 */
public class controllerPegawai implements ActionListener {
        private PegawaiView view;
        private ArrayList<Pilot> listPilot = new ArrayList<>();
        private ArrayList<Pramugari> listPramugari = new ArrayList<>();
        private Database db;
//yah iyalah gblk db nya belum lu instansiasi, baru lu inisilasi
        
        public controllerPegawai(){
            view = new PegawaiView();
            view.setVisible(true);
            view.addListener(this);
            db = new Database();
            db.connect();
        }
    public void refreshListPilot(){
        try{
            ResultSet rs = db.getData("select * from pilot");
            listPilot.removeAll(listPilot);
            listPramugari.removeAll(listPramugari);
            String temp = "";
            
            while(rs.next()){
                Pilot pilot = new Pilot(rs.getString("nama"), rs.getString("umur"), rs.getString("jenis_kelamin"), rs.getString("jabatan"), rs.getString("jam_terbang"));//ini gabung, instansiasi Buku
                 listPilot.add(pilot);
                 temp = temp + "===================" + "\n"
                         + "Nama : " + rs.getString("nama") + "\n"
                         + "Umur : " + rs.getString("umur") + "\n"
                         + "Jenis Kelamin : " + rs.getString("jenis_kelamin") + "\n"
                         + "Jabatan : " + rs.getString("jabatan") + "\n"
                         + "Jam Terbang : " + rs.getString("jam_terbang") + "\n";
            }
            view.getShow2().setText(temp);
        }catch(Exception e){
            System.out.println("Error refresh" +e.getMessage());
        }
    }
    public void refreshListPramugari(){
        try{
            ResultSet rs = db.getData("select * from pramugari");
            listPramugari.removeAll(listPramugari);
            String temp = "";
            
            while(rs.next()){
                Pramugari pramugari = new Pramugari(rs.getString("nama"), rs.getString("umur"), rs.getString("jenis_kelamin"), rs.getString("kedudukan"));//ini gabung, instansiasi Buku
                 listPramugari.add(pramugari);
                 temp = temp + "===================" + "\n"
                         + "Nama : " + rs.getString("nama") + "\n"
                         + "Umur : " + rs.getString("umur") + "\n"
                         + "Jenis Kelamin : " + rs.getString("jenis_kelamin") + "\n"
                         + "Kedudukan : " + rs.getString("Kedudukan") + "\n";
            }
            view.getShow2().setText(temp);
        }catch(Exception e){
            System.out.println("Error refresh" +e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnBack())){
            controllerHome pw = new controllerHome();
            view.dispose();
        }
        
        //koneksi lu bermasalah
        
        if (source.equals(view.getAddPilot())) {
            try{
                //string str lu nih salah
                //salahnya dmn
                
                     String str = "insert into pilot(nama, umur, jenis_kelamin, jabatan, jam_terbang) "
                        + "values('"
                              + view.getNamaPegawai() + "','" + view.getUmurPegawai()+ "','"  
                        + view.getKelaminPegawai() + "','" + view.getJabatanPilot() +"','"+ view.getJamPilot() + "')";
                     System.out.println(str);
                db.query(str);
                //kan gua bilangin query lu salah
                //panggil method show nya di sini
                refreshListPilot();
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }else if(source.equals(view.getAddPramugari())){
            try{    
                String ada = "insert into pramugari(nama, umur, jenis_kelamin, kedudukan) "
                        + "values('"
                             + view.getNamaPegawai() + "','" + view.getUmurPegawai() + "','"  
                            + view.getKelaminPegawai() + "','" + view.getKedudukanPramugari()+"')";
                System.out.println(ada);
                db.query(ada);
                refreshListPramugari();
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            } 
        }
        }
public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getShow1())){
            int i = view.getSelectedKaryawan();
            Pilot p = listPilot.get(i);
            view.setTextPegawai(p.toString());
        }
    }
    }
