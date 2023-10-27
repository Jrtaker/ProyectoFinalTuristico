/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import main.AccesoDatos.AlojamientoData;
import main.AccesoDatos.CiudadData;
import main.AccesoDatos.PaqueteData;
import main.AccesoDatos.PasajeData;
import main.entidades.Alojamiento;
import main.entidades.Ciudad;
import main.entidades.Paquete;
import main.entidades.Pasaje;

/**
 *
 * @author Joni
 */
public class PaquetePreparar extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel();
 
    /**
     * Creates new form PaqueteCrear
     */
    public PaquetePreparar() {
        initComponents();
        armarCabecera();
        refrescarLista();
        refrescarLista2();
      
    }
  
    public void limpiarTexto(){
        
        jTServicio.setText("");
    }
    public void refrescarLista() {
        CiudadData cData = new CiudadData();
        PasajeData pasajeData = new PasajeData();
        List<Ciudad> listaCiudad = (List<Ciudad>) cData.listarCiudad();
        jCListaCiudadOrigen.removeAllItems();

        for (Ciudad item : listaCiudad) {
            try{
                Pasaje pasaje =pasajeData.buscarPasajeActivoporCiudad(item.getIdCiudad());
                if(pasaje!=null){
                    jCListaCiudadOrigen.addItem(item);
                }
            }catch(NullPointerException ex){
                    
            }
        }

    }
    public void refrescarLista2() {
        
        CiudadData cData = new CiudadData();
        AlojamientoData alojamientoData = new AlojamientoData();
        List<Ciudad> listaCiudad2 = (List<Ciudad>) cData.listarCiudad();

        jCListaCiudadDestino.removeAllItems();

        for (Ciudad items : listaCiudad2) {
            try{
                Alojamiento alojamiento = alojamientoData.buscarAlojamientoActivoporCiudad(items.getIdCiudad());
                if(alojamiento!=null){
                    jCListaCiudadDestino.addItem(items);
                }
            }catch(NullPointerException ex){
                
            }
            
        }

    }
       public void cargarTabla(List<Pasaje> pasaje) {
        model.setRowCount(0);

        for (Pasaje pasajes : pasaje) {

            model.addRow(new Object[]{pasajes.getTipoTransporte(), pasajes.getImporte(), pasajes.getIdPasaje()});
        }
    }

    public void armarCabecera() {
        
        model.addColumn("Tipo de Transporte");
        model.addColumn("Importe");
        model.addColumn("ID");
        jTabla.setModel(model);
    }
    public void armarAlojamiento(List<Alojamiento> alojamientos){
        jCAlojamiento.removeAllItems();
        limpiarTexto();
        for(Alojamiento item : alojamientos){
            jCAlojamiento.addItem(item);
            
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ImageIcon icon = new ImageIcon(getClass().getResource("/main/Vistas/Imagenes/fondoParaPaqueteCrear.jpeg"));
        Image img=icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),
                    getHeight(),this);
            }
        };
        jCListaCiudadOrigen = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBnuevoPaquete = new javax.swing.JButton();
        jCAlojamiento = new javax.swing.JComboBox<>();
        jCcantidadPersonas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTServicio = new javax.swing.JTextArea();
        jCListaCiudadDestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jDEntrada = new com.toedter.calendar.JDateChooser();
        jDSalida = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTnombreUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(683, 569));

        jCListaCiudadOrigen.setBackground(new java.awt.Color(209, 237, 251));
        jCListaCiudadOrigen.setForeground(new java.awt.Color(0, 0, 0));
        jCListaCiudadOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCListaCiudadOrigenMouseClicked(evt);
            }
        });
        jCListaCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListaCiudadOrigenActionPerformed(evt);
            }
        });

        jTabla.setBackground(new java.awt.Color(209, 237, 251));
        jTabla.setForeground(new java.awt.Color(0, 0, 0));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTablaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jBnuevoPaquete.setBackground(new java.awt.Color(102, 204, 255));
        jBnuevoPaquete.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jBnuevoPaquete.setForeground(new java.awt.Color(0, 0, 0));
        jBnuevoPaquete.setText("Nuevo Paquete");
        jBnuevoPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoPaqueteActionPerformed(evt);
            }
        });

        jCAlojamiento.setBackground(new java.awt.Color(209, 237, 251));
        jCAlojamiento.setForeground(new java.awt.Color(0, 0, 0));
        jCAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlojamientoActionPerformed(evt);
            }
        });

        jCcantidadPersonas.setBackground(new java.awt.Color(209, 237, 251));
        jCcantidadPersonas.setForeground(new java.awt.Color(0, 0, 0));
        jCcantidadPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad de Personas");

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ciudad de Destino");

        jTServicio.setBackground(new java.awt.Color(195, 220, 244));
        jTServicio.setColumns(20);
        jTServicio.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jTServicio.setForeground(new java.awt.Color(0, 0, 0));
        jTServicio.setRows(5);
        jScrollPane1.setViewportView(jTServicio);

        jCListaCiudadDestino.setBackground(new java.awt.Color(209, 237, 251));
        jCListaCiudadDestino.setForeground(new java.awt.Color(0, 0, 0));
        jCListaCiudadDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCListaCiudadDestinoMouseClicked(evt);
            }
        });
        jCListaCiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCListaCiudadDestinoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ciudad de Origen");

        jLabel4.setText("Entrada");

        jLabel5.setText("Salida");

        jTnombreUsuario.setBackground(new java.awt.Color(209, 237, 251));
        jTnombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre de la persona");

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Paquete > ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Crear");

        jDesktopPane1.setLayer(jCListaCiudadOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBnuevoPaquete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCAlojamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCcantidadPersonas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCListaCiudadDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnombreUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jCAlojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jBnuevoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jDSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jCcantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCListaCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCListaCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 681, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCListaCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCListaCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCcantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBnuevoPaquete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 527, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCListaCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListaCiudadOrigenActionPerformed
        // crea la tabla usa una idCiudad
            
            Ciudad ciudad = (Ciudad) jCListaCiudadOrigen.getSelectedItem();    
            if(ciudad!=null){
                int idCiudad = ciudad.getIdCiudad();
                PasajeData pasajeData = new PasajeData();
                List<Pasaje> pasaje = pasajeData.pasajesActivos(idCiudad);
                cargarTabla(pasaje);
            }
   
    }//GEN-LAST:event_jCListaCiudadOrigenActionPerformed
 
    private void jBnuevoPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoPaqueteActionPerformed
        Ciudad ciudadOrigen = (Ciudad) jCListaCiudadOrigen.getSelectedItem();
        Ciudad ciudadDestino = (Ciudad) jCListaCiudadDestino.getSelectedItem();
        Alojamiento alojamiento = (Alojamiento) jCAlojamiento.getSelectedItem();
        int codigo = jTabla.getSelectedRow();
        if(ciudadOrigen==null || ciudadDestino == null || alojamiento == null || codigo == -1){
            return;
        }
        if (codigo != -1){
            int idPasaje = Integer.parseInt(jTabla.getValueAt(codigo, 2).toString());
            PasajeData pasajeData = new PasajeData();
            Pasaje pasaje = pasajeData.buscarPasaje(idPasaje);
            double totalPara1;
            int cantidadDePersonas = Integer.parseInt(jCcantidadPersonas.getSelectedItem().toString());
            //fechas
                Date fechaEnt = Date.from(jDEntrada.getDate().toInstant());
                Date fechaSal = Date.from(jDSalida.getDate().toInstant());
                Instant instantFechaEnt = fechaEnt.toInstant();
                Instant instantFechaSal = fechaSal.toInstant();


                long daysDifference = ChronoUnit.DAYS.between(
                    instantFechaEnt.atZone(ZoneId.systemDefault()),
                    instantFechaSal.atZone(ZoneId.systemDefault())
                    );
                int comparar = fechaEnt.compareTo(fechaSal);
            if(comparar<0){
                totalPara1 = (alojamiento.getImporteDiario()*daysDifference) + (pasaje.getImporte()*2);
                double totalParaVarios = cantidadDePersonas*totalPara1;
            
                int confirmResult = JOptionPane.showConfirmDialog(this,
                        "                El total seria de: " + totalPara1 + "$  para una persona por "+ daysDifference+" dias \n                                  Desea confirmar la accion? \nTambien se puede reducir la cantidad de dias para abatir costos.",
                        "Confirmar",
                    
                        JOptionPane.YES_NO_OPTION
                        );
                if(confirmResult == JOptionPane.YES_OPTION){
                    int confirmResult2 = JOptionPane.showConfirmDialog(this,
                        "                     El total seria de: " + totalParaVarios + "  para "+cantidadDePersonas+" personas. \n                                  Desea confirmar la accion? \nTambien se puede reducir la cantidad de personas para abatir costos.",
                        "Confirmar",
                    
                        JOptionPane.YES_NO_OPTION
                        );
                    if(confirmResult2 == JOptionPane.YES_OPTION){
                        //Crea paquete en programa
                        Paquete paquete = new Paquete();
                        paquete.setAlojamiento(alojamiento);
                        paquete.setDestino(ciudadDestino);
                        paquete.setOrigen(ciudadOrigen);
                        paquete.setPasaje(pasaje);
                        paquete.setNombre(jTnombreUsuario.getText());
                        //Crea paquete en BD
                        PaqueteData paqueteData = new PaqueteData();
                        paqueteData.agregarPaquete(paquete);
                    }else{
                        JOptionPane.showMessageDialog(this, "Porfavor ingrese una nueva cantidad de personas para continuar.");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Porfavor ingrese una nueva cantidad de dias para continuar.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Porfavor ingrese una fecha de salida posterior a la de entrada.");
            }
        }
    }//GEN-LAST:event_jBnuevoPaqueteActionPerformed

    private void jCAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlojamientoActionPerformed
        limpiarTexto();
       
        try{
                Alojamiento alojamiento = (Alojamiento) jCAlojamiento.getSelectedItem();
                Date fechaEnt = Date.from(alojamiento.getFechaInicio().atStartOfDay(ZoneId.systemDefault()).toInstant());//Done
                Date fechaSal = Date.from(alojamiento.getFechaFin().atStartOfDay(ZoneId.systemDefault()).toInstant());
                String Servicio = alojamiento.getServicio();
                
                jTServicio.setText(Servicio);
                jDEntrada.setDate(fechaEnt);
                jDSalida.setDate(fechaSal);
        }catch(NullPointerException ex){
            
        }
        
    }//GEN-LAST:event_jCAlojamientoActionPerformed
    
    private void jTablaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablaAncestorAdded

    private void jCListaCiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCListaCiudadDestinoActionPerformed
        // crea Alojamiento toma AlojamientoPorCiudad(Ciudad)
        
        Ciudad ciudad = (Ciudad) jCListaCiudadDestino.getSelectedItem();
        if(ciudad!=null){
            AlojamientoData alojamientoData=new AlojamientoData();
            List<Alojamiento> alojamientos= alojamientoData.alojamientosPorCiudad(ciudad);
            limpiarTexto();
            armarAlojamiento(alojamientos);
        }
        
    }//GEN-LAST:event_jCListaCiudadDestinoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCListaCiudadOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCListaCiudadOrigenMouseClicked
        refrescarLista();
    }//GEN-LAST:event_jCListaCiudadOrigenMouseClicked

    private void jCListaCiudadDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCListaCiudadDestinoMouseClicked
        refrescarLista2();
    }//GEN-LAST:event_jCListaCiudadDestinoMouseClicked

    private void jTnombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreUsuarioActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnuevoPaquete;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Alojamiento> jCAlojamiento;
    private javax.swing.JComboBox<Ciudad> jCListaCiudadDestino;
    private javax.swing.JComboBox<Ciudad> jCListaCiudadOrigen;
    private javax.swing.JComboBox<String> jCcantidadPersonas;
    private com.toedter.calendar.JDateChooser jDEntrada;
    private com.toedter.calendar.JDateChooser jDSalida;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTServicio;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTnombreUsuario;
    // End of variables declaration//GEN-END:variables
}
