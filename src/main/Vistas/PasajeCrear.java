/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.PasajeData;
import main.entidades.Ciudad;
import main.entidades.Pasaje;

/**
 *
 * @author Joni
 */
public class PasajeCrear extends javax.swing.JInternalFrame {
        private List<Ciudad> listaCiudad;
    
    public PasajeCrear() {
        initComponents();
        refrescarLista();
        refrescarListaPasaje();
    }
    private void refrescarLista(){
        jCOrigen.removeAllItems();
        CiudadData ciudadData = new CiudadData();
        listaCiudad =(List<Ciudad>)ciudadData.listarCiudad();
        
        for (Ciudad ciudad : listaCiudad) {
            jCOrigen.addItem(ciudad);
        }
    }    
        private void refrescarListaPasaje(){
            jCListarPasaje.removeAllItems();
            PasajeData pasajeData =new PasajeData();
            List <Pasaje> listaPasaje =(List<Pasaje>)pasajeData.PasajesTodo() ;
        for (Pasaje pasaje :listaPasaje)
            jCListarPasaje.addItem(pasaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/main/Vistas/Imagenes/fondoPaqueteCambio1.jpg"));
        Image img=icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),
                    getHeight(),this);
            }
        };
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(683, 569));

        jCOrigen.setBackground(new java.awt.Color(209, 237, 251));
        jCOrigen.setForeground(new java.awt.Color(0, 0, 0));
        jCOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCOrigenMouseEntered(evt);
            }
        });
        jCOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOrigenActionPerformed(evt);
            }
        });

        jCTransporte.setBackground(new java.awt.Color(209, 237, 251));
        jCTransporte.setForeground(new java.awt.Color(0, 0, 0));
        jCTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Taxi", "Tren", "Colectivo" }));
        jCTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTransporteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de transporte");

        jTImporte.setBackground(new java.awt.Color(209, 237, 251));
        jTImporte.setForeground(new java.awt.Color(0, 0, 0));
        jTImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTImporteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe");

        jREstado.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jREstado.setForeground(new java.awt.Color(0, 0, 0));
        jREstado.setText("Estado");
        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        jBNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jBNuevo.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBSalir.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Selecione Ciudad de Origen");

        jCListarPasaje.setBackground(new java.awt.Color(209, 237, 251));
        jCListarPasaje.setForeground(new java.awt.Color(0, 0, 0));
        jCListarPasaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCListarPasajeMouseEntered(evt);
            }
        });
        jCListarPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListarPasajeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Selecione Pasaje");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Administración >");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Pasajes");

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
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jREstado)
                            .addComponent(jCListarPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(46, 46, 46))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCListarPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTImporte)
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
        try {
            Ciudad OrigenidCiudad = (Ciudad) jCOrigen.getSelectedItem();
            String tipoTransporte = jCTransporte.getSelectedItem().toString();
            double importe = Double.parseDouble(jTImporte.getText());
            String importeComparar = jTImporte.getText();
            for(int i=0;i<importeComparar.length();i++){
                String x = importeComparar.substring(i, i+1);
                try{
                    double y = Double.parseDouble(x);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "Solo numeros en el importe.");
                    return;
                }
            }
            boolean estado = jREstado.isSelected();
            PasajeData pData =new PasajeData();
       
            Pasaje pasaje = new Pasaje(tipoTransporte, importe, OrigenidCiudad , estado);
            pData.agregarPasaje(pasaje);
            refrescarListaPasaje();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un valor apropiado.");
        }
        
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCListarPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListarPasajeActionPerformed
        if (jCListarPasaje==null){
            return;
        }
        try{
        Pasaje pasaje = (Pasaje) jCListarPasaje.getSelectedItem();
        Ciudad ciudad = pasaje.getOrigenCiudad();
        for (Ciudad item : listaCiudad) {
                    if (item.getIdCiudad() == ciudad.getIdCiudad()) {
                        jCOrigen.setSelectedItem(item);
                        break;
                    }
                }
        jCTransporte.setSelectedItem(pasaje.getTipoTransporte());
        jTImporte.setText(String.valueOf(pasaje.getImporte()));
        jREstado.setSelected(pasaje.isEstado());
        }catch(NullPointerException ex){
            
        }
        
    }//GEN-LAST:event_jCListarPasajeActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if(jCListarPasaje==null){
        return;
        }
        int confirmResult = JOptionPane.showConfirmDialog(
                this, 
                "¿Está seguro que desea borrar el Pasaje?", 
                "Confirmar Borrado", 
                JOptionPane.YES_NO_OPTION
        );
        
        if (confirmResult == JOptionPane.YES_OPTION) {
            int idPasaje = jCListarPasaje.getSelectedItem().hashCode();
        
            PasajeData pData = new PasajeData();
            
            pData.borrarPasaje(idPasaje);
            refrescarLista();
            refrescarListaPasaje();
            jTImporte.setText("");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try{
            int idPasaje = jCListarPasaje.getSelectedItem().hashCode();
        
            Ciudad OrigenidCiudad = (Ciudad) jCOrigen.getSelectedItem();
            String tipoTransporte = jCTransporte.getSelectedItem().toString();
            try{
                double importe = Double.parseDouble(jTImporte.getText());
                String importeComparar = jTImporte.getText();
            for(int i=0;i<importeComparar.length();i++){
                String x = importeComparar.substring(i, i+1);
                try{
                    double y = Double.parseDouble(x);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "Solo numeros en el importe.");
                    return;
                }
            }
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
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Porfavor ingrese solo numeros en importe.");
            }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "Porfavor cree unas ciudades");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jCOrigenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCOrigenMouseEntered

    }//GEN-LAST:event_jCOrigenMouseEntered

    private void jCListarPasajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCListarPasajeMouseEntered
       refrescarListaPasaje();
       refrescarLista();
    }//GEN-LAST:event_jCListarPasajeMouseEntered


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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTImporte;
    // End of variables declaration//GEN-END:variables
}
