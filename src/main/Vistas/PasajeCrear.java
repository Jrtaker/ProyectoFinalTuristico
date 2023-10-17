/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Vistas;

import java.util.ArrayList;
import java.util.List;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.PasajeData;
import main.entidades.Ciudad;
import main.entidades.Pasaje;

/**
 *
 * @author Joni
 */
public class PasajeCrear extends javax.swing.JInternalFrame {
    
    
    public PasajeCrear() {
        initComponents();
        refrescarLista();
    }
    private void refrescarLista(){
        CiudadData ciudadData = new CiudadData();
        List <Ciudad> listaCiudad =(List<Ciudad>)ciudadData.listarCiudad();
        for (Ciudad ciudad : listaCiudad) {
            jCOrigen.addItem(ciudad);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCOrigen = new javax.swing.JComboBox<>();
        jCTransporte = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTImporte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jCOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOrigenActionPerformed(evt);
            }
        });

        jCTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Taxi", "Tren", "Colectivo", " " }));
        jCTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTransporteActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de transporte");

        jTImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTImporteActionPerformed(evt);
            }
        });

        jLabel5.setText("Importe");

        jREstado.setText("Estado");
        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");

        jBEliminar.setText("Eliminar");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione Ciudad de Origen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBNuevo)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jREstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTransporteActionPerformed

    private void jREstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jREstadoActionPerformed

    private void jTImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTImporteActionPerformed

    private void jCOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOrigenActionPerformed
    
    }//GEN-LAST:event_jCOrigenActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        
        Ciudad OrigenidCiudad = (Ciudad) jCOrigen.getSelectedItem();
        String tipoTransporte = jCTransporte.getSelectedItem().toString();
        double importe = Double.parseDouble(jTImporte.getText());
        boolean estado = jREstado.isSelected();
        
        PasajeData pData =new PasajeData();
       
        Pasaje pasaje = new Pasaje(tipoTransporte, importe, OrigenidCiudad , estado);
        pData.agregarPasaje(pasaje);
        jTImporte.setText("");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Ciudad> jCOrigen;
    private javax.swing.JComboBox<String> jCTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTImporte;
    // End of variables declaration//GEN-END:variables
}
