/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Maestro
 */
public class MyImage extends javax.swing.JFrame {

    /**
     * Creates new form MyImage
     */
    BufferedImage img;
    float red,green,blue;
    JFrame myframe;
    static int increasingFactor=0;
    static int temp_sliderValue;
    int r=0,g=0,b=0;
    public MyImage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_chooseImage = new javax.swing.JButton();
        rbtn_grayscale = new javax.swing.JRadioButton();
        rbtn_negative = new javax.swing.JRadioButton();
        btn_edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        darker = new javax.swing.JButton();
        bright = new javax.swing.JButton();
        btn_subs = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_chooseImage.setText("choose image");
        btn_chooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseImageActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_grayscale);
        rbtn_grayscale.setText("Grayscale");

        buttonGroup1.add(rbtn_negative);
        rbtn_negative.setText("Negative");

        btn_edit.setText("edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel1.setText("Brightness");

        darker.setText("<");
        darker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkerActionPerformed(evt);
            }
        });

        bright.setText(">");
        bright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brightActionPerformed(evt);
            }
        });

        btn_subs.setText("substraction");
        btn_subs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subsActionPerformed(evt);
            }
        });

        btn_multiply.setText("multiply");
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_add.setText("addition");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_div.setText("division");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_subs, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_multiply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btn_div))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn_negative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(darker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_chooseImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtn_grayscale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_chooseImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtn_grayscale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_negative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(darker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_subs)
                    .addComponent(btn_multiply)
                    .addComponent(btn_add)
                    .addComponent(btn_div)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseImageActionPerformed
        // TODO add your handling code here:
        String userDir = System.getProperty("user.home");

        JFileChooser fileChooser = new JFileChooser(userDir + "/Desktop");

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                img = ImageIO.read(selectedFile);
                myframe = get_MYIMAGE();
            } catch (IOException ex) {
                Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_chooseImageActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        
        if(rbtn_grayscale.isSelected()){
            for (int i = 0; i < img.getWidth(); i++) {
                for (int j = 0; j < img.getHeight(); j++) {
                    Color c = new Color(img.getRGB(i, j));
                    float gray=  (float) (c.getRed()*0.299);
                    gray+= c.getGreen()*0.587;
                    gray+=(0.114*c.getBlue());
                    
                    int newC=Math.round(gray);
                    
                    Color newColor=new Color(newC, newC, newC);
                    img.setRGB(i, j,newColor.getRGB());
                     
                }
            }
            myframe.repaint();
        }
        else if(rbtn_negative.isSelected()){
            for (int i = 0; i < img.getWidth(); i++) {
                for (int j = 0; j < img.getHeight(); j++) {
                    Color c = new Color(img.getRGB(i, j));
                    
                    Color newColor=new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
                    img.setRGB(i, j, newColor.getRGB());                    
                }
            }
            myframe.repaint();
        }
        
    }//GEN-LAST:event_btn_editActionPerformed

    private void brightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brightActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                Color color = new Color(img.getRGB(i, j));
                r = (int) (color.getRed() + 20);
                g = (int) (color.getGreen() + 20);
                b = (int) (color.getBlue() + 20);
                if (r >= 256) {
                    r = 255;
                } else if (r < 0) {
                    r = 0;
                }

                if (g >= 256) {
                    g = 255;
                } else if (g < 0) {
                    g = 0;
                }

                if (b >= 256) {
                    b = 255;
                } else if (b < 0) {
                    b = 0;
                }
                Color newColor = new Color(r, g, b);
                img.setRGB(i, j, newColor.getRGB());
            }
        }
        myframe.repaint();
    }//GEN-LAST:event_brightActionPerformed

    private void darkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkerActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                Color color = new Color(img.getRGB(i, j));
                r = (int) (color.getRed() -20);
                g = (int) (color.getGreen() -20);
                b = (int) (color.getBlue() -20);
                if (r >= 256) {
                    r = 255;
                } else if (r < 0) {
                    r = 0;
                }

                if (g >= 256) {
                    g = 255;
                } else if (g < 0) {
                    g = 0;
                }

                if (b >= 256) {
                    b = 255;
                } else if (b < 0) {
                    b = 0;
                }
                Color newColor = new Color(r, g, b);
                img.setRGB(i, j, newColor.getRGB());
            }
        }
        myframe.repaint();
    }//GEN-LAST:event_darkerActionPerformed

    private void btn_subsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subsActionPerformed
        // TODO add your handling code here:
        BufferedImage img2;
        String userDir = System.getProperty("user.home");

        JFileChooser fileChooser = new JFileChooser(userDir + "/Desktop");
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                img2=ImageIO.read(selectedFile);  
                substract(img2);
                myframe.repaint();
            } catch (IOException ex) {
                Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_subsActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        // TODO add your handling code here:
        BufferedImage img2;
        String userDir = System.getProperty("user.home");

        JFileChooser fileChooser = new JFileChooser(userDir + "/Desktop");
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                img2=ImageIO.read(selectedFile);  
                multiply(img2);
                myframe.repaint();
            } catch (IOException ex) {
                Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        BufferedImage img2;
        String userDir = System.getProperty("user.home");

        JFileChooser fileChooser = new JFileChooser(userDir + "/Desktop");
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                img2=ImageIO.read(selectedFile);  
                addition(img2);
                myframe.repaint();
            } catch (IOException ex) {
                Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        // TODO add your handling code here:
        BufferedImage img2;
        String userDir = System.getProperty("user.home");

        JFileChooser fileChooser = new JFileChooser(userDir + "/Desktop");
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                img2=ImageIO.read(selectedFile);  
                division(img2);
                myframe.repaint();
            } catch (IOException ex) {
                Logger.getLogger(MyImage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_divActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bright;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_chooseImage;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_subs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton darker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbtn_grayscale;
    private javax.swing.JRadioButton rbtn_negative;
    // End of variables declaration//GEN-END:variables

    private JFrame get_MYIMAGE() {
        JFrame frame = new JFrame("picture");
        frame.setSize(img.getWidth(), img.getHeight());
        JLabel l = new JLabel();
        l.setSize(img.getWidth(), img.getHeight());
        l.setIcon((new ImageIcon(img)));
        frame.add(l);
        frame.setVisible(true);
        return frame;
    }

    private void substract(BufferedImage img2) {
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {   
                int argb0 = img.getRGB(i, j);
                int argb1 = img2.getRGB(i, j);

                int a0 = (argb0 >> 24) & 0xFF;
                int r0 = (argb0 >> 16) & 0xFF;
                int g0 = (argb0 >> 8) & 0xFF;
                int b0 = (argb0) & 0xFF;

                int a1 = (argb1 >> 24) & 0xFF;
                int r1 = (argb1 >> 16) & 0xFF;
                int g1 = (argb1 >> 8) & 0xFF;
                int b1 = (argb1) & 0xFF;

                int aDiff = Math.abs(a1 - a0);
                int rDiff = Math.abs(r1 - r0);
                int gDiff = Math.abs(g1 - g0);
                int bDiff = Math.abs(b1 - b0);

                int diff
                        = (aDiff << 24) | (rDiff << 16) | (gDiff << 8) | bDiff;
                img.setRGB(i, j, diff);

            }
        }       
    }

    private void multiply(BufferedImage img2) {
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {   
                int argb0 = img.getRGB(i, j);
                int argb1 = img2.getRGB(i, j);
                    
                int a0 = (argb0 >> 24) & 0xFF; 
                int r0 = (argb0 >> 16) & 0xFF;
                int g0 = (argb0 >> 8) & 0xFF;
                int b0 = (argb0) & 0xFF;

                int a1 = (argb1 >> 24) & 0xFF;
                int r1 = (argb1 >> 16) & 0xFF;
                int g1 = (argb1 >> 8) & 0xFF;
                int b1 = (argb1) & 0xFF;

                int aDiff = Math.abs(a1 * a0); 
                int rDiff = Math.abs(r1 * r0); 
                int gDiff = Math.abs(g1 * g0); 
                int bDiff = Math.abs(b1 * b0); 
//                if(aDiff>255 || rDiff>255 ||gDiff>255 ||bDiff>255 ){
//                    System.out.println("bbb");
//                }
                
                int diff
                        = (aDiff << 24) | (rDiff << 16) | (gDiff << 8) | bDiff;
                img.setRGB(i, j, diff);

            }
        }       
    }
    
    private void addition(BufferedImage img2){
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {   
                int argb0 = img.getRGB(i, j);
                int argb1 = img2.getRGB(i, j);

                int a0 = (argb0 >> 24) & 0xFF;
                int r0 = (argb0 >> 16) & 0xFF;
                int g0 = (argb0 >> 8) & 0xFF;
                int b0 = (argb0) & 0xFF;

                int a1 = (argb1 >> 24) & 0xFF;
                int r1 = (argb1 >> 16) & 0xFF;
                int g1 = (argb1 >> 8) & 0xFF;
                int b1 = (argb1) & 0xFF;

                int aDiff = Math.abs(a1 + a0);
                int rDiff = Math.abs(r1 + r0);
                int gDiff = Math.abs(g1 + g0);
                int bDiff = Math.abs(b1 + b0);

                int diff
                        = (aDiff << 24) | (rDiff << 16) | (gDiff << 8) | bDiff;
                img.setRGB(i, j, diff);

            }
        }       
    }

    private void division(BufferedImage img2) {
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {   
                int argb0 = img.getRGB(i, j);
                int argb1 = img2.getRGB(i, j);
                    
                int a0 = (argb0 >> 24) & 0xFF; 
                int r0 = (argb0 >> 16) & 0xFF;
                int g0 = (argb0 >> 8) & 0xFF;
                int b0 = (argb0) & 0xFF;

                int a1 = (argb1 >> 24) & 0xFF;
                int r1 = (argb1 >> 16) & 0xFF;
                int g1 = (argb1 >> 8) & 0xFF;
                int b1 = (argb1) & 0xFF;

                int aDiff = Math.abs(a1 / a0); 
                int rDiff = Math.abs(r1 / r0); 
                int gDiff = Math.abs(g1 / g0); 
                int bDiff = Math.abs(b1 / b0); 
//                if(aDiff>255 || rDiff>255 ||gDiff>255 ||bDiff>255 ){
//                    System.out.println("bbb");
//                }
                
                int diff
                        = (aDiff << 24) | (rDiff << 16) | (gDiff << 8) | bDiff;
                img.setRGB(i, j, diff);

            }
        }       
    }
}
