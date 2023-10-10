/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package main.Vistas;

/**@author Programita */
public class Menu3 extends javax.swing.JFrame {
    PaquetePreparar  Pqt =new PaquetePreparar();
    CiudadCrear  ciudadCrear =new CiudadCrear();
    AlojamientoCrear  alojamientoCrear =new AlojamientoCrear();
    PasajeCrear  psjeCrear =new PasajeCrear();
    public Menu3() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscritorioLateral = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelLateral = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLPrincipal = new javax.swing.JLabel();
        PAdmin2 = new javax.swing.JPanel();
        jLAdministracion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
<<<<<<< Updated upstream
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
=======
        jLPaquete = new javax.swing.JLabel();
>>>>>>> Stashed changes
        EscritorioPrincipal = new javax.swing.JDesktopPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        panelPaquete = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panelAdmin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BotonLabelCiudad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonLabelAlojamiento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotonLabelPasajes = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(153, 204, 255));

        PanelLateral.setBackground(new java.awt.Color(153, 204, 255));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

<<<<<<< Updated upstream
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("        Principal");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jLPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jLPrincipal.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        jLPrincipal.setText("Principal");
        jLPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> Stashed changes
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
=======
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );

        PAdmin2.setBackground(new java.awt.Color(255, 255, 255));
        panelAdmin.setVisible(true);

<<<<<<< Updated upstream
        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("  Administración");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jLAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        jLAdministracion.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLAdministracion.setForeground(new java.awt.Color(0, 0, 0));
        jLAdministracion.setText("Administración");
        jLAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> Stashed changes
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAdministracionjLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PAdmin2Layout = new javax.swing.GroupLayout(PAdmin2);
        PAdmin2.setLayout(PAdmin2Layout);
        PAdmin2Layout.setHorizontalGroup(
            PAdmin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAdmin2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
<<<<<<< Updated upstream
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addComponent(jLAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        PAdmin2Layout.setVerticalGroup(
            PAdmin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAdmin2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAdministracion)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

<<<<<<< Updated upstream
        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("      Paquete");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
=======
        jLPaquete.setBackground(new java.awt.Color(255, 255, 255));
        jLPaquete.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLPaquete.setForeground(new java.awt.Color(0, 0, 0));
        jLPaquete.setText("Paquete");
        jLPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
>>>>>>> Stashed changes
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPaqueteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Turistic");

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("World");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPaquete)
                .addContainerGap())
>>>>>>> Stashed changes
        );

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PAdmin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelLateralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(PAdmin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PanelLateral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EscritorioLateral.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLateralLayout = new javax.swing.GroupLayout(EscritorioLateral);
        EscritorioLateral.setLayout(EscritorioLateralLayout);
        EscritorioLateralLayout.setHorizontalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EscritorioLateralLayout.createSequentialGroup()
                    .addComponent(jLayeredPane1)
                    .addGap(0, 0, 0)))
        );
        EscritorioLateralLayout.setVerticalGroup(
            EscritorioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addGap(0, 551, Short.MAX_VALUE)
=======
            .addGap(0, 684, Short.MAX_VALUE)
>>>>>>> Stashed changes
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(panelPaqueteLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        panelPaqueteLayout.setVerticalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaqueteLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        panelAdmin.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        BotonLabelCiudad.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        BotonLabelCiudad.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelCiudad.setText("             Ciudad");
        BotonLabelCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLabelCiudadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonLabelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        botonLabelAlojamiento.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        botonLabelAlojamiento.setForeground(new java.awt.Color(0, 0, 0));
        botonLabelAlojamiento.setText("           Alojamiento");
        botonLabelAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLabelAlojamientoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonLabelAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        BotonLabelPasajes.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        BotonLabelPasajes.setForeground(new java.awt.Color(0, 0, 0));
        BotonLabelPasajes.setText("              Pasajes");
        BotonLabelPasajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLabelPasajesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonLabelPasajes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(panelPaquete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(panelAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(panelPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelPaquete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(panelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        EscritorioPrincipal.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioPrincipalLayout = new javax.swing.GroupLayout(EscritorioPrincipal);
        EscritorioPrincipal.setLayout(EscritorioPrincipalLayout);
        EscritorioPrincipalLayout.setHorizontalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
            .addGap(0, 631, Short.MAX_VALUE)
=======
            .addGap(0, 832, Short.MAX_VALUE)
>>>>>>> Stashed changes
            .addGroup(EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        EscritorioPrincipalLayout.setVerticalGroup(
            EscritorioPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addComponent(EscritorioPrincipal))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioLateral)
            .addComponent(EscritorioPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPrincipalMouseClicked
        fijarAbierto();
        PanelLateral.setVisible(true);        
        panelPrincipal.setVisible(true);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);
    }//GEN-LAST:event_jLPrincipalMouseClicked

    private void jLAdministracionjLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAdministracionjLabel1MouseClicked
        fijarAbierto();
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(true );
    }//GEN-LAST:event_jLAdministracionjLabel1MouseClicked

<<<<<<< Updated upstream
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      
       
=======
    
    private void jLPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPaqueteMouseClicked
       
       fijarAbierto();
        
>>>>>>> Stashed changes
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(true);
        panelAdmin.setVisible(false);
        
    }//GEN-LAST:event_jLPaqueteMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        
        Pqt.setVisible(true);
        EscritorioPrincipal.add(Pqt);
        EscritorioPrincipal.moveToFront(Pqt);
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);
        ///Paquete Preparar
    }//GEN-LAST:event_jLabel8MouseClicked

    private void BotonLabelCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelCiudadMouseClicked

        
        ciudadCrear.setVisible(true);
        EscritorioPrincipal.add(ciudadCrear);
        EscritorioPrincipal.moveToFront(ciudadCrear);
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);


        // enlazar CiudadCrear
    }//GEN-LAST:event_BotonLabelCiudadMouseClicked

    private void botonLabelAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLabelAlojamientoMouseClicked

        
        alojamientoCrear.setVisible(true);
        EscritorioPrincipal.add(alojamientoCrear);
        EscritorioPrincipal.moveToFront(alojamientoCrear);
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);


       
//alojamientoCrear -
    }//GEN-LAST:event_botonLabelAlojamientoMouseClicked

    private void BotonLabelPasajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLabelPasajesMouseClicked

        
        psjeCrear.setVisible(true);
        EscritorioPrincipal.add(psjeCrear);
        EscritorioPrincipal.moveToFront(psjeCrear);
        PanelLateral.setVisible(true);
        panelPrincipal.setVisible(false);
        panelPaquete.setVisible(false);
        panelAdmin.setVisible(false);
 

        // Pasaje Crear         // TODO add your handling code here:
    }//GEN-LAST:event_BotonLabelPasajesMouseClicked
    
    public void fijarAbierto(){
        if(ciudadCrear.isVisible()||Pqt.isVisible()||alojamientoCrear.isVisible()||psjeCrear.isVisible()){
            ciudadCrear.dispose();
            Pqt.dispose();
            alojamientoCrear.dispose();
            psjeCrear.dispose(); 
        }
    }
    
    /** @param args the command line arguments*/
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
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JLabel botonLabelAlojamiento;
    private javax.swing.JLabel jLAdministracion;
    private javax.swing.JLabel jLPaquete;
    private javax.swing.JLabel jLPrincipal;
    private javax.swing.JLabel jLabel3;
<<<<<<< Updated upstream
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
=======
>>>>>>> Stashed changes
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelPaquete;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
