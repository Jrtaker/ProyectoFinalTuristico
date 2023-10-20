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
        refrescarListaPasaje();
    }
    private void refrescarLista(){
        CiudadData ciudadData = new CiudadData();
        List <Ciudad> listaCiudad =(List<Ciudad>)ciudadData.listarCiudad();
        for (Ciudad ciudad : listaCiudad) {
            jCOrigen.addItem(ciudad);
        }
    }    
        private void refrescarListaPasaje(){
        PasajeData pasajeData =new PasajeData();
        List <Pasaje> listaPasaje =(List<Pasaje>)pasajeData.PasajesTodo() ;
        for (Pasaje pasaje :listaPasaje)
            jCListarPasaje.addItem(pasaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
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
        jCListarPasaje = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(683, 569));

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
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione Ciudad de Origen");

        jCListarPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListarPasajeActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione Pasaje");

        jDesktopPane1.setLayer(jCOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCTransporte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTImporte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jREstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCListarPasaje, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstado)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jCListarPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(46, 46, 46))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCListarPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addComponent(jREstado)
                .addGap(140, 140, 140)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        refrescarListaPasaje();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCListarPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListarPasajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCListarPasajeActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int idPasaje = jCListarPasaje.getSelectedItem().hashCode();
        Ciudad OrigenidCiudad = (Ciudad) jCOrigen.getSelectedItem();
        String tipoTransporte = jCTransporte.getSelectedItem().toString();
        double importe = Double.parseDouble(jTImporte.getText());
        boolean estado = jREstado.isSelected();
        
        PasajeData pData = new PasajeData();
        
        pData.borrarPasaje(idPasaje);
        refrescarLista();
        refrescarListaPasaje();
        jTImporte.setText("");
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        int idPasaje = jCListarPasaje.getSelectedItem().hashCode();
        Ciudad OrigenidCiudad = (Ciudad) jCOrigen.getSelectedItem();
        String tipoTransporte = jCTransporte.getSelectedItem().toString();
        double importe = Double.parseDouble(jTImporte.getText());
        boolean estado = jREstado.isSelected();
        
        PasajeData pData = new PasajeData();
        Pasaje pasaje =new Pasaje (idPasaje, tipoTransporte, importe, OrigenidCiudad, estado);
        pasaje.setIdPasaje(idPasaje);
        pasaje.setTipoTransporte(tipoTransporte);
        pasaje.setImporte(importe);
        pasaje.setOrigenCiudad(OrigenidCiudad);
        pasaje.setEstado(estado);
        
        pData.modificarPasaje(pasaje);
        refrescarLista();
        refrescarListaPasaje();
        jTImporte.setText("");
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Pasaje> jCListarPasaje;
    private javax.swing.JComboBox<Ciudad> jCOrigen;
    private javax.swing.JComboBox<String> jCTransporte;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTImporte;
    // End of variables declaration//GEN-END:variables
}
