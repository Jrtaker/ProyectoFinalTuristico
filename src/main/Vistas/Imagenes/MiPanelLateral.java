package main.Vistas.Imagenes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/* @author Programita  */
public class MiPanelLateral extends JPanel {

     private Image imagenFondo;

    public MiPanelLateral(String rutaImagen) {
        imagenFondo = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
    
    
    }
    /*
 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja la imagen de fondo
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
    }*/
}