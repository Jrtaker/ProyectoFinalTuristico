/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import main.Vistas.Imagenes.MiPanelLateral;

/**
 * @author Programita
 */
public class Menu3 extends javax.swing.JFrame {

    PaquetePreparar Pqt = new PaquetePreparar();
    CiudadCrear ciudadCrear = new CiudadCrear();
    AlojamientoCrear alojamientoCrear = new AlojamientoCrear();
    PasajeCrear psjeCrear = new PasajeCrear();

    public Menu3() {
        initComponents();
        // Crea un panel con fondo y agrégalo al JFrame

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscritorioLateral = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        PanelLateral = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        labelPrincipal = new javax.swing.JLabel();
        PAdmin2 = new javax.swing.JPanel();
        labelAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelPaquete = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EscritorioPrincipal = new javax.swing.JDesktopPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        panelPaquete = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelFondoCiudad = new javax.swing.JLabel();
        labelFondoAlojamiento = new javax.swing.JLabel();
        labelFondoPasaje = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        PanelCiudad = new javax.swing.JPanel();
        BotonLabelCiudad = new javax.swing.JLabel();
        PanelAlojamiento = new javax.swing.JPanel();
        botonLabelAlojamiento = new javax.swing.JLabel();
        PanelPasajes = new javax.swing.JPanel();
        BotonLabelPasajes = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(153, 204, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Minimalist Celeste v2.jpeg"))); // NOI18N
        jLabel1.setText(".");

        PanelLateral.setBackground(new java.awt.Color(153, 204, 255));
        PanelLateral.setOpaque(false);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(null);
        panel1.setOpaque(false);

        labelPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        labelPrincipal.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        labelPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        labelPrincipal.setText("  Principal");
        labelPrincipal.setLayout(null);
        labelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        PAdmin2.setBackground(new java.awt.Color(255, 255, 255));
        PAdmin2.setOpaque(false);
        panelAdmin.setVisible(true);
        PAdmin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAdmin2MouseClicked(evt);
            }
        });

        labelAdmin.setBackground(new java.awt.Color(0, 0, 0));
        labelAdmin.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        labelAdmin.setForeground(new java.awt.Color(0, 0, 0));
        labelAdmin.setText("  Administración");
        labelAdmin.setMaximumSize(new java.awt.Dimension(146, 36));
        labelAdmin.setMinimumSize(new java.awt.Dimension(146, 36));
        labelAdmin.setPreferredSize(new java.awt.Dimension(146, 36));
        labelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdminjLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PAdmin2Layout = new javax.swing.GroupLayout(PAdmin2);
        PAdmin2.setLayout(PAdmin2Layout);
        PAdmin2Layout.setHorizontalGroup(
            PAdmin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAdmin2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PAdmin2Layout.setVerticalGroup(
            PAdmin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAdmin2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        labelPaquete.setBackground(new java.awt.Color(0, 0, 0));
        labelPaquete.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        labelPaquete.setForeground(new java.awt.Color(0, 0, 0));
        labelPaquete.setText("  Paquete   ");
        labelPaquete.setMaximumSize(new java.awt.Dimension(146, 36));
        labelPaquete.setMinimumSize(new java.awt.Dimension(146, 36));
        labelPaquete.setPreferredSize(new java.awt.Dimension(146, 36));
        labelPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPaquete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Iconov3TrazoNegro.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Turistic World");

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(81, 81, 81)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(PAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        /*/ Crear el borde redondeado
        Border roundedBorder = new LineBorder(new Color(0, 0, 0), 1, true);

        // Crear el borde vacío para redondear las esquinas
        Border emptyBorder = new EmptyBorder(5, 5, 5, 5); // Ajusta el espacio según tus preferencias

        // Combina ambos bordes
        PAdmin2.setBorder(new CompoundBorder(roundedBorder, emptyBorder));
        */

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelLateral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE))
        );

        EscritorioLateral.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLateralLayout = new javax.swing.GroupLayout(EscritorioLateral);
        EscritorioLateral.setLayout(EscritorioLateralLayout);
        EscritorioLateralLayout.setHorizontalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLateralLayout.createSequentialGroup()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        EscritorioLateralLayout.setVerticalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );

        panelPaquete.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Crear");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cambios");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPaqueteLayout = new javax.swing.GroupLayout(panelPaquete);
        panelPaquete.setLayout(panelPaqueteLayout);
        panelPaqueteLayout.setHorizontalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaqueteLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        panelPaqueteLayout.setVerticalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaqueteLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        labelFondoCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Ciudad10V3.png"))); // NOI18N

        labelFondoAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Alojamiento15V3.png"))); // NOI18N

        labelFondoPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Pasajes15V3.png"))); // NOI18N

        panelAdmin.setBackground(new Color (255,255,255,110));
        panelAdmin.setOpaque(false);
        panelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAdminMouseEntered(evt);
            }
        });

        PanelCiudad.setBackground(new Color (255,255,255,110));
        PanelCiudad.setOpaque(false);
        PanelCiudad.setPreferredSize(new java.awt.Dimension(252, 55));
        PanelCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCiudadmouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCiudadmouseExited(evt);
            }
        });

        BotonLabelCiudad.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        BotonLabelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelCiudad.setText("       Ciudad");
        BotonLabelCiudad.setPreferredSize(new java.awt.Dimension(147, 33));
        BotonLabelCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLabelCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonLabelCiudadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLabelCiudadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelCiudadLayout = new javax.swing.GroupLayout(PanelCiudad);
        PanelCiudad.setLayout(PanelCiudadLayout);
        PanelCiudadLayout.setHorizontalGroup(
            PanelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );
        PanelCiudadLayout.setVerticalGroup(
            PanelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        PanelAlojamiento.setBackground(new Color (255,255,255,110));
        PanelAlojamiento.setOpaque(false);

        botonLabelAlojamiento.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        botonLabelAlojamiento.setForeground(new java.awt.Color(0, 0, 0));
        botonLabelAlojamiento.setText("     Alojamiento");
        botonLabelAlojamiento.setMaximumSize(new java.awt.Dimension(156, 27));
        botonLabelAlojamiento.setMinimumSize(new java.awt.Dimension(156, 27));
        botonLabelAlojamiento.setPreferredSize(new java.awt.Dimension(147, 33));
        botonLabelAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLabelAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLabelAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLabelAlojamientoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelAlojamientoLayout = new javax.swing.GroupLayout(PanelAlojamiento);
        PanelAlojamiento.setLayout(PanelAlojamientoLayout);
        PanelAlojamientoLayout.setHorizontalGroup(
            PanelAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        PanelAlojamientoLayout.setVerticalGroup(
            PanelAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        PanelPasajes.setBackground(new Color(255,255,255,110));
        PanelPasajes.setOpaque(false);
        PanelPasajes.setPreferredSize(new java.awt.Dimension(252, 55));

        BotonLabelPasajes.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        BotonLabelPasajes.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelPasajes.setText("      Pasajes");
        BotonLabelPasajes.setPreferredSize(new java.awt.Dimension(147, 33));
        BotonLabelPasajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLabelPasajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonLabelPasajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLabelPasajesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelPasajesLayout = new javax.swing.GroupLayout(PanelPasajes);
        PanelPasajes.setLayout(PanelPasajesLayout);
        PanelPasajesLayout.setHorizontalGroup(
            PanelPasajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPasajesLayout.setVerticalGroup(
            PanelPasajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelPasajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(PanelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(PanelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(PanelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(panelPaquete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelFondoCiudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelFondoAlojamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(labelFondoPasaje, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(panelAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(panelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(panelPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelFondoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelFondoAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelFondoPasaje, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(labelFondoCiudad)
                    .addGap(0, 377, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(labelFondoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 365, Short.MAX_VALUE)
                    .addComponent(labelFondoPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelFondoAlojamiento.setOpaque(false); // Esto permite que el fondo del JLabel sea transparente
        labelFondoAlojamiento.setBackground(new Color(0, 0, 0, 0)); // Establece el fondo como transparente

        EscritorioPrincipal.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioPrincipalLayout = new javax.swing.GroupLayout(EscritorioPrincipal);
        EscritorioPrincipal.setLayout(EscritorioPrincipalLayout);
        EscritorioPrincipalLayout.setHorizontalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioPrincipalLayout.createSequentialGroup()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        EscritorioPrincipalLayout.setVerticalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EscritorioLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EscritorioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioLateral)
            .addComponent(EscritorioPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        setFalse();
        Pqt.setVisible(true);
        EscritorioPrincipal.add(Pqt);
        EscritorioPrincipal.moveToFront(Pqt);
        
         // mauseAdminPanel = !mauseAdminPanel;///Paquete Preparar
    }//GEN-LAST:event_jLabel8MouseClicked

    private void BotonLabelCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseClicked
        setFalse();
        ciudadCrear.setVisible(true);
        EscritorioPrincipal.add(ciudadCrear);
        EscritorioPrincipal.moveToFront(ciudadCrear);
        // enlazar CiudadCrear
    }//GEN-LAST:event_BotonLabelCiudadMouseClicked

    private void botonLabelAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseClicked
        setFalse();
        alojamientoCrear.setVisible(true);
        EscritorioPrincipal.add(alojamientoCrear);
        EscritorioPrincipal.moveToFront(alojamientoCrear);
        //alojamientoCrear -
    }//GEN-LAST:event_botonLabelAlojamientoMouseClicked

    private void BotonLabelPasajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseClicked
        setFalse();
        psjeCrear.setVisible(true);
        EscritorioPrincipal.add(psjeCrear);
        EscritorioPrincipal.moveToFront(psjeCrear);
        // Pasaje Crear         // TODO add your handling code here:
    }//GEN-LAST:event_BotonLabelPasajesMouseClicked

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseEntered

    private void labelPaqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseExited
        labelPaquete.setOpaque(false);
        labelPaquete.setBackground(null);
    }//GEN-LAST:event_labelPaqueteMouseExited

    private void labelPaqueteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseEntered
        labelPaquete.setOpaque(true);
        labelPaquete.setBackground(new Color(0xBAEAFB));
    }//GEN-LAST:event_labelPaqueteMouseEntered

    private void labelPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseClicked

        fijarAbierto();
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(true);
        panelAdmin.setVisible(false);
    }//GEN-LAST:event_labelPaqueteMouseClicked

    private void labelAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseExited
        labelAdmin.setOpaque(false);
        labelAdmin.setBackground(null);  
        labelAdmin.setForeground(Color.BLACK);
// TODO add your handling code here:
    }//GEN-LAST:event_labelAdminMouseExited

    private void labelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminMouseEntered
        labelAdmin.setOpaque(true);
        labelAdmin.setBackground(new Color(0xBAEAFB));
    }//GEN-LAST:event_labelAdminMouseEntered

    private void labelAdminjLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdminjLabel1MouseClicked
        fijarAbierto();
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(true);
    }//GEN-LAST:event_labelAdminjLabel1MouseClicked

    private void labelPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseExited
        labelPrincipal.setOpaque(false);
        labelPrincipal.setBackground(null);

// TODO add your handling code here:
    }//GEN-LAST:event_labelPrincipalMouseExited

    private void labelPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseEntered
        labelPrincipal.setOpaque(true);
        labelPrincipal.setBackground(new Color(0xBAEAFB));

        
    }//GEN-LAST:event_labelPrincipalMouseEntered

    private void labelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPrincipalMouseClicked
        fijarAbierto();
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(true);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);
    }//GEN-LAST:event_labelPrincipalMouseClicked
 
  
    private void BotonLabelCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseEntered
         if (evt.getSource() == BotonLabelCiudad) {
             PanelCiudad.setBackground(new Color(255,255,255,200));
        PanelCiudad.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2)); 
      
    }
      
        
    }//GEN-LAST:event_BotonLabelCiudadMouseEntered

    private void BotonLabelCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseExited
       if (evt.getSource() == BotonLabelCiudad) {
            PanelCiudad.setBackground(null);
        PanelCiudad.setBorder(null); // Elimina el borde al salir del ratón de BotonLabelCiudad
    PanelCiudad.setPreferredSize(null);
       }
       
    }//GEN-LAST:event_BotonLabelCiudadMouseExited

    private void botonLabelAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseEntered
        if (evt.getSource() == botonLabelAlojamiento) {
             PanelAlojamiento.setBackground(new Color(255,255,255,200));
        PanelAlojamiento.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2)); 
      
    }
    }//GEN-LAST:event_botonLabelAlojamientoMouseEntered

    private void BotonLabelPasajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseEntered
          if (evt.getSource() == BotonLabelPasajes) {
             PanelPasajes.setBackground(new Color(255,255,255,200));
        PanelPasajes.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2)); 
      
    }
        
          
          
    }//GEN-LAST:event_BotonLabelPasajesMouseEntered

    private void botonLabelAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseExited
         if (evt.getSource() == botonLabelAlojamiento) {
            PanelAlojamiento.setBackground(null);
        PanelAlojamiento.setBorder(null); // Elimina el borde al salir del ratón de BotonLabelCiudad
    }
    }//GEN-LAST:event_botonLabelAlojamientoMouseExited

    private void BotonLabelPasajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseExited
     if (evt.getSource() == BotonLabelPasajes) {
            PanelPasajes.setBackground(null);
        PanelPasajes.setBorder(null); // Elimina el borde al salir del ratón de BotonLabelCiudad
    }
    }//GEN-LAST:event_BotonLabelPasajesMouseExited

    private void PanelCiudadmouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCiudadmouseEntered
      /*
        
        PanelPrincipal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
       BotonLabelCiudad.setForeground(Color.black);
       BotonLabelCiudad.setOpaque(false);*/
// TODO add your handling code here:
    }//GEN-LAST:event_PanelCiudadmouseEntered

    private void PanelCiudadmouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCiudadmouseExited
        /*PanelPrincipal.setBorder(null);
          BotonLabelCiudad.setForeground(Color.black);
       BotonLabelCiudad.setOpaque(false);*/
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCiudadmouseExited

    private void panelPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseEntered
       /* if (evt.getSource()==panelPrincipal) {
            PanelPasajes.setVisible(false);
            PanelCiudad.setVisible(false);
            PanelAlojamiento.setVisible(false);
            
        }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_panelPrincipalMouseEntered

    private void panelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAdminMouseEntered
       /*  if (evt.getSource()==panelPrincipal) {
            PanelPasajes.setVisible(true);
            PanelCiudad.setVisible(true);
            PanelAlojamiento.setVisible(true);
            
        }*/
    }//GEN-LAST:event_panelAdminMouseEntered

    private void PAdmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAdmin2MouseClicked
         if (evt.getSource()==panelPrincipal) {
            PanelPasajes.setVisible(true);
            PanelCiudad.setVisible(true);
            PanelAlojamiento.setVisible(true);
            
        }
    }//GEN-LAST:event_PAdmin2MouseClicked
    
    
    
    
    
    public void fijarAbierto() {
        if (ciudadCrear.isVisible() || Pqt.isVisible() || alojamientoCrear.isVisible() || psjeCrear.isVisible()) {
            ciudadCrear.dispose();
            Pqt.dispose();
            alojamientoCrear.dispose();
            psjeCrear.dispose();
        }
    }

    public void setFalse() {
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);
    }

    public static void menu3() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu3().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonLabelCiudad;
    private javax.swing.JLabel BotonLabelPasajes;
    private javax.swing.JDesktopPane EscritorioLateral;
    private javax.swing.JDesktopPane EscritorioPrincipal;
    private javax.swing.JPanel PAdmin2;
    private javax.swing.JPanel PanelAlojamiento;
    private javax.swing.JPanel PanelCiudad;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelPasajes;
    private javax.swing.JLabel botonLabelAlojamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelFondoAlojamiento;
    private javax.swing.JLabel labelFondoCiudad;
    private javax.swing.JLabel labelFondoPasaje;
    private javax.swing.JLabel labelPaquete;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelPaquete;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
