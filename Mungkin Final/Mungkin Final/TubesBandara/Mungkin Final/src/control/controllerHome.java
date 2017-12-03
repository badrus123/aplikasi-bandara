/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

/**
 *
 * @author Badrus
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import tubesbandara.*;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
/**
 *
 * @author FARIS
 */
public class controllerHome implements ActionListener {
        private Home view;

        public controllerHome(){
            view = new Home();
            view.setVisible(true);
            view.addListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getHomeKaryawan())){
            controllerPegawai pw = new controllerPegawai();
            view.setVisible(true);
        } else if (source.equals(view.getHomePesawat())){
            controllerPesawat pv = new controllerPesawat();
            view.dispose();
            
        } 
    }
}
