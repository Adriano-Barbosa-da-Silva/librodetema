/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Dao.LocalidadDAO;
import Dao.ProvinciaDAO;
import Entidades.Localidad;
import Entidades.Provincia;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author CFP36
 */
public class ProvinciaUI extends javax.swing.JFrame {

    /**
     * Creates new form ProvinciaUI
     */
    public ProvinciaUI() {
        initComponents();
                        
        String s = DigestUtils.sha256Hex("diego");
        System.out.println(s);  
             
        s = DigestUtils.sha256Hex("diego");
        System.out.println(s); 
             
        s = DigestUtils.sha256Hex("diegoa");
        System.out.println(s); 
        ProvinciaDAO provDAO = new ProvinciaDAO();
        LinkedList<Provincia> lista = provDAO.listar();

        for (Provincia provincia : lista) {
            ProvinciaCombo.addItem(provincia);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProvinciaCombo = new javax.swing.JComboBox<>();
        verIDbtn = new javax.swing.JButton();
        IDtxt = new javax.swing.JTextField();
        localidadesCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        ProvinciaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinciaComboActionPerformed(evt);
            }
        });

        verIDbtn.setText("Ver ID");
        verIDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verIDbtnActionPerformed(evt);
            }
        });

        localidadesCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                localidadesComboFocusLost(evt);
            }
        });
        localidadesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadesComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(ProvinciaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verIDbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(localidadesCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ProvinciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(localidadesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(verIDbtn)
                .addGap(34, 34, 34)
                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verIDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verIDbtnActionPerformed
       /*Provincia p = (Provincia)ProvinciaCombo.getSelectedItem();
       
       IDtxt.setText("");
       IDtxt.setText(String.valueOf(p.getId()));*/
       
       Localidad l = (Localidad)localidadesCombo.getSelectedItem();
       
       IDtxt.setText("");
       IDtxt.setText(String.valueOf(l.getIdLocalidad()));
       
    }//GEN-LAST:event_verIDbtnActionPerformed

    private void ProvinciaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinciaComboActionPerformed
        actualizarLocalidades();// TODO add your handling code here:
    }//GEN-LAST:event_ProvinciaComboActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          localidadesCombo.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void localidadesComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_localidadesComboFocusLost
        localidadesCombo.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_localidadesComboFocusLost

    private void localidadesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadesComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localidadesComboActionPerformed

    
        
    private void actualizarLocalidades(){
        localidadesCombo.setEnabled(false);
        Provincia prov = (Provincia)ProvinciaCombo.getSelectedItem();                
        LocalidadDAO locDAO = new LocalidadDAO();
        LinkedList<Localidad> li = locDAO.getLocalidadByIdProvincia(prov.getId());        
//        for (Localidad localidad : li) {
//            localidadesCombo.addItem(localidad);
//        }
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Localidad localidad : li) {
            modelo.addElement(localidad.getNom_departamento()+ " - " + localidad.getNombre());
        }
        localidadesCombo.setModel(modelo);
        localidadesCombo.setModel(modelo);
        localidadesCombo.setEnabled(true);
    }
    
     
        
        
        
        
     public void initLocalidadesCombo(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        
        localidadesCombo.setModel(modelo);
        localidadesCombo.setEnabled(false);
    }
        
    
   /*  
     private void actualizarCombo(JComboBox combo, String descripcion, Class clase){        
        for (int i = 0; i < combo.getItemCount(); i++) {              
            if(clase.cast(combo.getItemAt(i)).toString().equals(descripcion)){
                combo.setSelectedIndex(i);                  
                return;
            }                        
        }
    }
    */
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDtxt;
    private javax.swing.JComboBox<Provincia> ProvinciaCombo;
    private javax.swing.JComboBox<Localidad> localidadesCombo;
    private javax.swing.JButton verIDbtn;
    // End of variables declaration//GEN-END:variables
}
