package clock.display;

import clock.handler.FrameController;
import clock.info.CustomDateFormats;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainClockFrame extends javax.swing.JFrame {

    // These var are used for the mouse clicked movement 
    int xMouse;
    int yMouse;

    public MainClockFrame() {

        initComponents();
        this.setBackground(new Color(0, 255, 0, 0)); // set color transparent

        // this thread is used to set the time in the clock 
        Thread thread = new Thread(() -> {
            while (true) {
                timeLabel.setText(CustomDateFormats.getTime()); // set time
                timePeriod.setText(CustomDateFormats.getAM_PM());
            }
        });
        thread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutButton = new javax.swing.JLabel();
        timePeriod = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        dragHandler = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutButtonMousePressed(evt);
            }
        });
        getContentPane().add(aboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        timePeriod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timePeriod.setForeground(new java.awt.Color(255, 255, 255));
        timePeriod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timePeriod.setText("AM");
        getContentPane().add(timePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        timeLabel.setFont(new java.awt.Font("DS-Digital", 1, 36)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00:00");
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, 170));

        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 30, 10));

        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 20, 30));

        dragHandler.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragHandlerMouseDragged(evt);
            }
        });
        dragHandler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragHandlerMousePressed(evt);
            }
        });
        getContentPane().add(dragHandler, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock/icons/backgroung-image.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragHandlerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragHandlerMouseDragged

        // Get mouse x and y coordinates
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse); // enable drag
    }//GEN-LAST:event_dragHandlerMouseDragged

    private void dragHandlerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragHandlerMousePressed

        // in case of clicked on frame , get x and y of the mouse
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragHandlerMousePressed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0); // exit the program
    }//GEN-LAST:event_exitButtonMouseClicked

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(MainClockFrame.ICONIFIED); // minimize frame
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void aboutButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMousePressed

        // Show About :P
        JOptionPane.showMessageDialog(this, "Clock 4.0 : Created By issa loubani @2018");
    }//GEN-LAST:event_aboutButtonMousePressed

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
            java.util.logging.Logger.getLogger(MainClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClockFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel dragHandler;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timePeriod;
    // End of variables declaration//GEN-END:variables
}
