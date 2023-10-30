/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.Vistas;

import Login.Login;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Menu3 extends javax.swing.JFrame {

    PaqueteModificar paqueteCambios = new PaqueteModificar();
    PaquetePreparar Pqt = new PaquetePreparar();
    PasajeCrear psjeCrear = new PasajeCrear();

    CiudadCrear ciudadCrear = new CiudadCrear();
    AlojamientoCrear alojamientoCrear = new AlojamientoCrear();

    public Menu3() {
        // setUndecorated(true); // pa eliminar borde
           
           
        initComponents();
         
        setTitle("Paquete Turistico - Turistic World");
        
        
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        EscritorioPrincipal = new javax.swing.JDesktopPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        panelPaquete = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/main/Vistas/Imagenes/FondoPaquete.jpeg"));
        Image img=icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),
                    getHeight(),this);
            }
        };
        panelCrear = new javax.swing.JPanel();
        labelCrear = new javax.swing.JLabel();
        panelCambios = new javax.swing.JPanel();
        labelCambios = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DirectorEjecutivo = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecursosHumanos = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        GerenteReservas = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        RespFinanzas = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        RepresentatesVentas = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        SoporteTecnico = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
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
                .addGap(0, 0, 0)
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
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
                .addComponent(labelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(labelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPaquete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Iconov3TrazoNegro.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Turistic World");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cerrar Sesión");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(PAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 577, Short.MAX_VALUE))
        );

        EscritorioLateral.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLateralLayout = new javax.swing.GroupLayout(EscritorioLateral);
        EscritorioLateral.setLayout(EscritorioLateralLayout);
        EscritorioLateralLayout.setHorizontalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLateralLayout.createSequentialGroup()
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        EscritorioLateralLayout.setVerticalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
            .addGroup(EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1))
        );

        EscritorioPrincipal.setBackground(new java.awt.Color(204, 255, 255));

        jLayeredPane2.setBackground(new java.awt.Color(204, 255, 255));

        panelPaquete.setBackground(new java.awt.Color(255, 255, 255));

        panelCrear.setBackground(new java.awt.Color(203, 227, 251));
        panelCrear.setMaximumSize(new java.awt.Dimension(132, 25));
        panelCrear.setLayout(new java.awt.BorderLayout());

        labelCrear.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labelCrear.setForeground(new java.awt.Color(0, 0, 0));
        labelCrear.setText("                Crear");
        labelCrear.setPreferredSize(new java.awt.Dimension(260, 54));
        labelCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCrearMouseExited(evt);
            }
        });
        panelCrear.add(labelCrear, java.awt.BorderLayout.CENTER);

        panelCambios.setBackground(new java.awt.Color(188, 219, 249));
        panelCambios.setLayout(new java.awt.BorderLayout());

        labelCambios.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        labelCambios.setForeground(new java.awt.Color(0, 0, 0));
        labelCambios.setText("            Cambios");
        labelCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCambiosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCambiosMouseExited(evt);
            }
        });
        panelCambios.add(labelCambios, java.awt.BorderLayout.CENTER);

        jDesktopPane1.setLayer(panelCrear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelCambios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(panelCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPaqueteLayout = new javax.swing.GroupLayout(panelPaquete);
        panelPaquete.setLayout(panelPaqueteLayout);
        panelPaqueteLayout.setHorizontalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaqueteLayout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        panelPaqueteLayout.setVerticalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        labelFondoCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Ciudad10V3.png"))); // NOI18N
        labelFondoCiudad.setPreferredSize(new java.awt.Dimension(690, 190));
        labelFondoCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelFondoCiudadMouseEntered(evt);
            }
        });

        labelFondoAlojamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Alojamiento15V3.png"))); // NOI18N

        labelFondoPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Vistas/Imagenes/Pasajes15V3.png"))); // NOI18N

        panelAdmin.setBackground(new Color (255,255,255,110));
        panelAdmin.setOpaque(false);
        panelAdmin.setPreferredSize(new java.awt.Dimension(684, 214));
        panelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAdminMouseEntered(evt);
            }
        });

        PanelCiudad.setBackground(new Color (255,255,255,110));
        PanelCiudad.setPreferredSize(new java.awt.Dimension(252, 55));
        PanelCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCiudadmouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCiudadmouseExited(evt);
            }
        });

        BotonLabelCiudad.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        BotonLabelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelCiudad.setText("Ciudad");
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
            .addGroup(PanelCiudadLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        PanelCiudadLayout.setVerticalGroup(
            PanelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        PanelAlojamiento.setBackground(new Color (255,255,255,110));
        PanelAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelAlojamientoMouseExited(evt);
            }
        });

        botonLabelAlojamiento.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        botonLabelAlojamiento.setForeground(new java.awt.Color(0, 0, 0));
        botonLabelAlojamiento.setText("Alojamiento");
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
            .addGroup(PanelAlojamientoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelAlojamientoLayout.setVerticalGroup(
            PanelAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlojamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelPasajes.setBackground(new Color(255,255,255,110));
        PanelPasajes.setPreferredSize(new java.awt.Dimension(252, 55));
        PanelPasajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPasajesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelPasajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelPasajesMouseExited(evt);
            }
        });

        BotonLabelPasajes.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        BotonLabelPasajes.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelPasajes.setText("Pasajes");
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
            .addGroup(PanelPasajesLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        PanelPasajesLayout.setVerticalGroup(
            PanelPasajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPasajesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(PanelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(PanelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(PanelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(684, 567));
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Impact", 0, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("TURISTICWORLD");

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nuestra Misión: Hacer Realidad Tus Sueños ");

        jLabel15.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Contactos:");

        DirectorEjecutivo.setEditable(false);
        DirectorEjecutivo.setBackground(new java.awt.Color(186, 219, 252));
        DirectorEjecutivo.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(DirectorEjecutivo);
        StyledDocument styledDocument = DirectorEjecutivo.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument.insertString(styledDocument.getLength(), "Director Ejecutivo:", bold);
            styledDocument.insertString(styledDocument.getLength(), "\nStanley Pines\n+54 351 656 8464", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //DirectorEjecutivo= new javax.swing.JTextPane();// Comentado porque ya está ceado un obj tipo director ejecutivo
        DirectorEjecutivo.setEditable(false); // Establece la edición en falso
        jScrollPane2.setViewportView(DirectorEjecutivo);

        RecursosHumanos.setEditable(false);
        RecursosHumanos.setBackground(new java.awt.Color(186, 219, 252));
        RecursosHumanos.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(RecursosHumanos);
        StyledDocument styledDocument2 = RecursosHumanos.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold2 = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument2.insertString(styledDocument2.getLength(), "Recursos Humanos:", bold);
            styledDocument2.insertString(styledDocument2.getLength(), "\nStanford Pines\n+54 351 912 2348", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //RecursosHumanos = new javax.swing.JTextPane();
        RecursosHumanos.setEditable(false); // Establece la edición en falso
        jScrollPane1.setViewportView(RecursosHumanos);

        // Resto del código para aplicar el formato de negritas

        GerenteReservas.setEditable(false);
        GerenteReservas.setBackground(new java.awt.Color(186, 219, 252));
        GerenteReservas.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(GerenteReservas);
        StyledDocument styledDocument3 = GerenteReservas.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold3 = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument3.insertString(styledDocument3.getLength(), "Gerente de Reservas:", bold);
            styledDocument3.insertString(styledDocument3.getLength(), "\n Ydhira Rebaza \n+54 351 295 4663", null);
            // styledDocument3.insertString(styledDocument3.getLength(), "\\n", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //GerenteReservas = new javax.swing.JTextPane();
        GerenteReservas.setEditable(false); // Establece la edición en falso
        jScrollPane3.setViewportView(GerenteReservas);

        // Resto del código para aplicar el formato de negritas

        RespFinanzas.setEditable(false);
        RespFinanzas.setBackground(new java.awt.Color(186, 219, 252));
        RespFinanzas.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(RespFinanzas);
        StyledDocument styledDocument4 = RespFinanzas.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold4 = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument4.insertString(styledDocument4.getLength(), "Responzable de Finanzas:", bold);
            styledDocument4.insertString(styledDocument4.getLength(), "\n Ana Pianetti \n  +54 11 2751 3577", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //RespFinanzas = new javax.swing.JTextPane();
        RespFinanzas.setEditable(false); // Establece la edición en falso
        jScrollPane4.setViewportView(RespFinanzas);

        // Resto del código para aplicar el formato de negritas

        jScrollPane5.setMinimumSize(new java.awt.Dimension(62, 20));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(62, 20));

        RepresentatesVentas.setEditable(false);
        RepresentatesVentas.setBackground(new java.awt.Color(186, 219, 252));
        RepresentatesVentas.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        RepresentatesVentas.setMinimumSize(new java.awt.Dimension(62, 20));
        RepresentatesVentas.setPreferredSize(new java.awt.Dimension(62, 25));
        jScrollPane5.setViewportView(RepresentatesVentas);
        StyledDocument styledDocument5 = RepresentatesVentas.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold5 = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument5.insertString(styledDocument5.getLength(), "Representantes de Ventas:", bold);
            styledDocument5.insertString(styledDocument5.getLength(), "\n Enzo Barvaro \n+54 381 660 0652", null);
            // styledDocument5.insertString(styledDocument5.getLength(), "\n @enzo_jb135\n ", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //RepresentatesVentas = new javax.swing.JTextPane();
        RepresentatesVentas.setEditable(false); // Establece la edición en falso
        jScrollPane5.setViewportView(RepresentatesVentas);

        // Resto del código para aplicar el formato de negritas

        SoporteTecnico.setEditable(false);
        SoporteTecnico.setBackground(new java.awt.Color(186, 219, 252));
        SoporteTecnico.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        jScrollPane6.setViewportView(SoporteTecnico);
        StyledDocument styledDocument6 = SoporteTecnico.getStyledDocument();

        // Crear un atributo para aplicar negritas
        SimpleAttributeSet bold6 = new SimpleAttributeSet();
        StyleConstants.setBold(bold, true);

        try {
            styledDocument6.insertString(styledDocument6.getLength(), "Soporte Tecnico Interno ", bold);
            styledDocument6.insertString(styledDocument6.getLength(), "\n Jonathan Ramirez \n+54 351 266 512 7132", null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }

        //SoporteTecnico = new javax.swing.JTextPane();
        SoporteTecnico.setEditable(false); // Establece la edición en falso
        jScrollPane6.setViewportView(SoporteTecnico);

        // Resto del código para aplicar el formato de negritas

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel3))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(panelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelFondoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(labelFondoAlojamiento)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(labelFondoPasaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(labelFondoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 387, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(labelFondoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(368, Short.MAX_VALUE)
                    .addComponent(labelFondoPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        labelFondoAlojamiento.setOpaque(false); // Esto permite que el fondo del JLabel sea transparente
        labelFondoAlojamiento.setBackground(new Color(0, 0, 0, 0)); // Establece el fondo como transparente

        EscritorioPrincipal.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioPrincipalLayout = new javax.swing.GroupLayout(EscritorioPrincipal);
        EscritorioPrincipal.setLayout(EscritorioPrincipalLayout);
        EscritorioPrincipalLayout.setHorizontalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioPrincipalLayout.createSequentialGroup()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EscritorioPrincipalLayout.setVerticalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
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
                .addComponent(EscritorioPrincipal)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioLateral)
            .addComponent(EscritorioPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearMouseClicked
        //setFalse();
        try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) Pqt.getUI();
        borraVentana.setNorthPane(null);
        Pqt.setResizable(false);
        Pqt.setVisible(true);
        EscritorioPrincipal.add(Pqt);
        EscritorioPrincipal.moveToFront(Pqt);
        }catch(IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) Pqt.getUI();
            borraVentana.setNorthPane(null);
            Pqt.setResizable(false);
            Pqt.setVisible(true);
            EscritorioPrincipal.add(Pqt);
            EscritorioPrincipal.moveToFront(Pqt);
        }
        // mauseAdminPanel = !mauseAdminPanel;///Paquete Preparar
    }//GEN-LAST:event_labelCrearMouseClicked

    private void BotonLabelCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseClicked
         try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) ciudadCrear.getUI();
        borraVentana.setNorthPane(null);
        ciudadCrear.setResizable(false);
        ciudadCrear.setVisible(true);
        EscritorioPrincipal.add(ciudadCrear);
        EscritorioPrincipal.moveToFront(ciudadCrear); 
        }catch(IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) ciudadCrear.getUI();
            borraVentana.setNorthPane(null);
            ciudadCrear.setResizable(false);
            ciudadCrear.setVisible(true);
            EscritorioPrincipal.add(ciudadCrear);
            EscritorioPrincipal.moveToFront(ciudadCrear); 
        }// TODO add your handling code here:
        
    }//GEN-LAST:event_BotonLabelCiudadMouseClicked

    private void botonLabelAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseClicked
        //setFalse();
        try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
        borraVentana.setNorthPane(null);
        alojamientoCrear.setResizable(false);
        alojamientoCrear.setVisible(true);
        EscritorioPrincipal.add(alojamientoCrear);
        EscritorioPrincipal.moveToFront(alojamientoCrear);
        }catch(IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
            borraVentana.setNorthPane(null);
            alojamientoCrear.setResizable(false);
            alojamientoCrear.setVisible(true);
            EscritorioPrincipal.add(alojamientoCrear);
            EscritorioPrincipal.moveToFront(alojamientoCrear);  
        }
        //alojamientoCrear -
    }//GEN-LAST:event_botonLabelAlojamientoMouseClicked

    private void BotonLabelPasajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseClicked
        //setFalse();
        try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) psjeCrear.getUI();
        borraVentana.setNorthPane(null);
        psjeCrear.setResizable(false);
        psjeCrear.setVisible(true);
        EscritorioPrincipal.add(psjeCrear);
        EscritorioPrincipal.moveToFront(psjeCrear);
        }catch (IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
            borraVentana.setNorthPane(null);
            alojamientoCrear.setResizable(false);
            alojamientoCrear.setVisible(true);
            EscritorioPrincipal.add(alojamientoCrear);
            EscritorioPrincipal.moveToFront(alojamientoCrear);
        }
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
        PaquetePreparar paqt = new PaquetePreparar();
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
        if (evt.getSource() == BotonLabelCiudad || evt.getSource() == PanelCiudad) {
            PanelCiudad.setOpaque(true);
            PanelCiudad.setBackground(Color.WHITE);
            
        }

    }//GEN-LAST:event_BotonLabelCiudadMouseEntered

    private void BotonLabelCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseExited
    if (evt.getSource() != BotonLabelCiudad) {
             PanelCiudad.setOpaque(false);
            Color semi = new Color(255,255,255,110);
            
            PanelCiudad.setBackground(semi); 
           
        }
    }//GEN-LAST:event_BotonLabelCiudadMouseExited

    private void botonLabelAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseEntered
       if (evt.getSource() == botonLabelAlojamiento || evt.getSource() == PanelAlojamiento) {
           PanelAlojamiento.setOpaque(true);
            PanelAlojamiento.setBackground(Color.WHITE);
        } 
    }//GEN-LAST:event_botonLabelAlojamientoMouseEntered

    private void BotonLabelPasajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseEntered
        if (evt.getSource() == BotonLabelPasajes || evt.getSource() == PanelPasajes) {
            PanelPasajes.setOpaque(true);
            PanelPasajes.setBackground(Color.WHITE);
        } 
    }//GEN-LAST:event_BotonLabelPasajesMouseEntered

    private void botonLabelAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseExited
        if (evt.getSource() == botonLabelAlojamiento || evt.getSource() == PanelAlojamiento) { 
            PanelAlojamiento.setOpaque(false);
            PanelAlojamiento.setBackground(new Color(255, 255, 255, 110));//color inical
        } 
    }//GEN-LAST:event_botonLabelAlojamientoMouseExited

    private void BotonLabelPasajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseExited
        if (evt.getSource() == BotonLabelPasajes || evt.getSource() == PanelPasajes) {
            PanelPasajes.setOpaque(false);
            PanelPasajes.setBackground(new Color(255, 255, 255, 110)); // Color inicial
        }
    }//GEN-LAST:event_BotonLabelPasajesMouseExited

    private void PanelCiudadmouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCiudadmouseEntered
        if (evt.getSource() == BotonLabelCiudad || evt.getSource() == PanelCiudad) {
            PanelCiudad.setOpaque(true);
            PanelCiudad.setBackground(Color.WHITE);
           
        }
    }//GEN-LAST:event_PanelCiudadmouseEntered

    private void PanelCiudadmouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCiudadmouseExited
        if (evt.getSource() != BotonLabelCiudad) {
            PanelCiudad.setOpaque(false);
            Color semi = new Color(255,255,255,110);
            
            PanelCiudad.setBackground(semi); 
            
        }
    }//GEN-LAST:event_PanelCiudadmouseExited

    private void panelPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseEntered

    }//GEN-LAST:event_panelPrincipalMouseEntered

    private void panelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAdminMouseEntered
        /*  if (evt.getSource()==panelPrincipal) {
            PanelPasajes.setVisible(true);
            PanelCiudad.setVisible(true);
            PanelAlojamiento.setVisible(true);
            
        }*/
    }//GEN-LAST:event_panelAdminMouseEntered

    private void PAdmin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAdmin2MouseClicked
        if (evt.getSource() == panelPrincipal) {
            PanelPasajes.setVisible(true);
            PanelCiudad.setVisible(true);
            PanelAlojamiento.setVisible(true);

        }
    }//GEN-LAST:event_PAdmin2MouseClicked

    private void labelCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearMouseEntered
        if (evt.getSource() == labelCrear) {
            panelCrear.setBackground(new Color(51, 51, 255, 255));
            labelCrear.setForeground(Color.white);
            panelCrear.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        }
    }//GEN-LAST:event_labelCrearMouseEntered

    private void labelCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambiosMouseEntered
        if (evt.getSource() == labelCambios) {
            panelCambios.setBackground(new Color(51, 51, 255, 255));
            labelCambios.setForeground(Color.white);
            panelCambios.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        }
    }//GEN-LAST:event_labelCambiosMouseEntered

    private void labelCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearMouseExited
        if (evt.getSource() == labelCrear) {
            panelCrear.setBackground(new Color(188, 219, 249, 255));
            labelCrear.setForeground(Color.black);
            panelCrear.setBorder(null);
        }
    }//GEN-LAST:event_labelCrearMouseExited

    private void labelCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambiosMouseExited
        if (evt.getSource() == labelCambios) {
            panelCambios.setBackground(new Color(188, 219, 249, 255));
            labelCambios.setForeground(Color.black);
            panelCambios.setBorder(null);
        }
    }//GEN-LAST:event_labelCambiosMouseExited

    private void labelCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambiosMouseClicked
        try{
        BasicInternalFrameUI borraVentanaa = (BasicInternalFrameUI) paqueteCambios.getUI();
        borraVentanaa.setNorthPane(null);
        paqueteCambios.setResizable(false);
        paqueteCambios.setVisible(true);
        EscritorioPrincipal.add(paqueteCambios);
        EscritorioPrincipal.moveToFront(paqueteCambios);
        }catch (IllegalArgumentException ex){
            BasicInternalFrameUI borraVentanaa = (BasicInternalFrameUI) paqueteCambios.getUI();
            borraVentanaa.setNorthPane(null);
            paqueteCambios.setResizable(false);
            paqueteCambios.setVisible(true);
            EscritorioPrincipal.add(paqueteCambios);
            EscritorioPrincipal.moveToFront(paqueteCambios);
        }
    }//GEN-LAST:event_labelCambiosMouseClicked

    private void labelFondoCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFondoCiudadMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_labelFondoCiudadMouseEntered

    private void PanelAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAlojamientoMouseEntered
        if (evt.getSource() == botonLabelAlojamiento || evt.getSource() == PanelAlojamiento) {
           PanelAlojamiento.setOpaque(true);
            PanelAlojamiento.setBackground(Color.WHITE);
        } 
    }//GEN-LAST:event_PanelAlojamientoMouseEntered

    private void PanelAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAlojamientoMouseExited
        if (evt.getSource() == botonLabelAlojamiento || evt.getSource() == PanelAlojamiento) { 
            PanelAlojamiento.setOpaque(false);
            PanelAlojamiento.setBackground(new Color(255, 255, 255, 110));//color inical
        } 
    }//GEN-LAST:event_PanelAlojamientoMouseExited

    private void PanelPasajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPasajesMouseEntered
        if (evt.getSource() == BotonLabelPasajes || evt.getSource() == PanelPasajes) {
            PanelPasajes.setOpaque(true);
            PanelPasajes.setBackground(Color.WHITE);
        } 
    }//GEN-LAST:event_PanelPasajesMouseEntered

    private void PanelPasajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPasajesMouseExited
        if (evt.getSource() == BotonLabelPasajes || evt.getSource() == PanelPasajes) {
            PanelPasajes.setOpaque(false);
            PanelPasajes.setBackground(new Color(255, 255, 255, 110)); // Color inicial
        }
        
    }//GEN-LAST:event_PanelPasajesMouseExited

    private void PanelCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCiudadMouseClicked
        try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) ciudadCrear.getUI();
        borraVentana.setNorthPane(null);
        ciudadCrear.setResizable(false);
        ciudadCrear.setVisible(true);
        EscritorioPrincipal.add(ciudadCrear);
        EscritorioPrincipal.moveToFront(ciudadCrear); 
        }catch(IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) ciudadCrear.getUI();
            borraVentana.setNorthPane(null);
            ciudadCrear.setResizable(false);
            ciudadCrear.setVisible(true);
            EscritorioPrincipal.add(ciudadCrear);
            EscritorioPrincipal.moveToFront(ciudadCrear); 
        }// TODO add your handling code here:
        
    }//GEN-LAST:event_PanelCiudadMouseClicked

    private void PanelAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelAlojamientoMouseClicked

        try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
        borraVentana.setNorthPane(null);
        alojamientoCrear.setResizable(false);
        alojamientoCrear.setVisible(true);
        EscritorioPrincipal.add(alojamientoCrear);
        EscritorioPrincipal.moveToFront(alojamientoCrear);
        }catch(IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
            borraVentana.setNorthPane(null);
            alojamientoCrear.setResizable(false);
            alojamientoCrear.setVisible(true);
            EscritorioPrincipal.add(alojamientoCrear);
            EscritorioPrincipal.moveToFront(alojamientoCrear);
        }
    }//GEN-LAST:event_PanelAlojamientoMouseClicked

    private void PanelPasajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPasajesMouseClicked
     try{
        BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) psjeCrear.getUI();
        borraVentana.setNorthPane(null);
        psjeCrear.setResizable(false);
        psjeCrear.setVisible(true);
        EscritorioPrincipal.add(psjeCrear);
        EscritorioPrincipal.moveToFront(psjeCrear);
        }catch (IllegalArgumentException ex){
            BasicInternalFrameUI borraVentana = (BasicInternalFrameUI) alojamientoCrear.getUI();
            borraVentana.setNorthPane(null);
            alojamientoCrear.setResizable(false);
            alojamientoCrear.setVisible(true);
            EscritorioPrincipal.add(alojamientoCrear);
            EscritorioPrincipal.moveToFront(alojamientoCrear);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_PanelPasajesMouseClicked
      public void cerrarSesion() {
          

}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        if (evt.getSource() == jButton1) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                this.dispose();
                Login loginWindow = new Login();
                loginWindow.setVisible(true);
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Se produjo un error al cerrar sesión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    public void fijarAbierto() {
        if (ciudadCrear.isVisible() || Pqt.isVisible() || alojamientoCrear.isVisible() || psjeCrear.isVisible() || paqueteCambios.isVisible()) {
            paqueteCambios.dispose();
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
                Menu3 ventana = new Menu3();
               ventana.setVisible(true);
               // new Menu3().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonLabelCiudad;
    private javax.swing.JLabel BotonLabelPasajes;
    private javax.swing.JTextPane DirectorEjecutivo;
    private javax.swing.JDesktopPane EscritorioLateral;
    private javax.swing.JDesktopPane EscritorioPrincipal;
    private javax.swing.JTextPane GerenteReservas;
    private javax.swing.JPanel PAdmin2;
    private javax.swing.JPanel PanelAlojamiento;
    private javax.swing.JPanel PanelCiudad;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelPasajes;
    private javax.swing.JTextPane RecursosHumanos;
    private javax.swing.JTextPane RepresentatesVentas;
    private javax.swing.JTextPane RespFinanzas;
    private javax.swing.JTextPane SoporteTecnico;
    private javax.swing.JLabel botonLabelAlojamiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelAdmin;
    private javax.swing.JLabel labelCambios;
    private javax.swing.JLabel labelCrear;
    private javax.swing.JLabel labelFondoAlojamiento;
    private javax.swing.JLabel labelFondoCiudad;
    private javax.swing.JLabel labelFondoPasaje;
    private javax.swing.JLabel labelPaquete;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelCambios;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelPaquete;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
