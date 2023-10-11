/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.AccesoDatos.CiudadData;
import main.entidades.Ciudad;

/**
 *
 * @author Joni
 */
public class CiudadCrear extends javax.swing.JInternalFrame {
    private List <Ciudad> cargarCiudad;
    private CiudadData cData;
    
    /**
     * Creates new form CiudadCambios
     */
    public CiudadCrear() {
        initComponents();
        
       refrescarLista();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCPais = new javax.swing.JComboBox<>();
        jTProvincia = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();
        jCListarCiudad = new javax.swing.JComboBox<>();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jCPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brazil", "Argentina", "Estados Unidos", "Colombia", "Chile", "" }));
        jCPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPaisActionPerformed(evt);
            }
        });

        jTProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProvinciaActionPerformed(evt);
            }
        });

        jTCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCiudadActionPerformed(evt);
            }
        });

        jLabel1.setText("Pais");

        jLabel2.setText("Provincia");

        jLabel3.setText("Ciudad");

        jREstado.setText("Estado");

        jCListarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListarCiudadActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCPais, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jBGuardar)
                                        .addGap(24, 24, 24)
                                        .addComponent(jBEliminar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCListarCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jCListarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jREstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jButton4)
                    .addComponent(jBEliminar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void refrescarLista(){
        cData =new CiudadData();
        cargarCiudad =(List<Ciudad>)cData.listarCiudad();
        for (Ciudad item: cargarCiudad)
            jCListarCiudad.addItem(item);
    
    }
    
    
    private void jTProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProvinciaActionPerformed

    private void jCPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPaisActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        String pais = jCPais.getSelectedItem().toString();

        String provincia = jTProvincia.getText();
        String ciudad = jTCiudad.getText();
        if (provincia.isEmpty() || ciudad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios.Rellenalos para continuar.");
            return;
        }
        boolean estado = jREstado.isSelected();

        Ciudad nuevaciudad = new Ciudad(ciudad, pais, estado, provincia);
        CiudadData ciudadData = new CiudadData();
        ciudadData.agregarCiudad(nuevaciudad);
        jTProvincia.setText("");
        jTCiudad.setText("");
        refrescarLista();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCiudadActionPerformed

    private void jCListarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListarCiudadActionPerformed
        
        Ciudad ciudad = (Ciudad)jCListarCiudad.getSelectedItem();
        int idCiudad =ciudad.getIdCiudad();
        String pais = ciudad.getPais();
        String provincia = ciudad.getProvincia();
        String nombre = ciudad.getNombre();
        boolean estado = ciudad.isEstado();
        
        jCPais.setSelectedItem(pais);
        jTProvincia.setText(provincia);
        jTCiudad.setText(nombre);
        jREstado.setSelected(estado);
        
        
    }//GEN-LAST:event_jCListarCiudadActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
       String pais = jCPais.getSelectedItem().toString();

        String provincia = jTProvincia.getText();
        String ciudad = jTCiudad.getText();
        
        cData.borrarCiudad(pais, provincia, ciudad);
        refrescarLista();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<Ciudad> jCListarCiudad;
    private javax.swing.JComboBox<String> jCPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTProvincia;
    // End of variables declaration//GEN-END:variables
}
