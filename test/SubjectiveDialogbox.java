

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SubjectiveDialogbox extends javax.swing.JFrame {
    /**
     * Creates new form Dialogbox
     */
    
    public SubjectiveDialogbox() {
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

        AsktoSubmitPanel = new javax.swing.JPanel();
        AskToSubmitLabel = new javax.swing.JLabel();
        NoButton = new javax.swing.JButton();
        YesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AsktoSubmitPanel.setBackground(new java.awt.Color(255, 255, 255));

        AskToSubmitLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        AskToSubmitLabel.setText("Do you want to submit test?");

        NoButton.setBackground(new java.awt.Color(0, 0, 51));
        NoButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NoButton.setForeground(new java.awt.Color(255, 255, 255));
        NoButton.setText("No");
        NoButton.setToolTipText("");
        NoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NoButtonMousePressed(evt);
            }
        });
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });

        YesButton.setBackground(new java.awt.Color(0, 0, 51));
        YesButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        YesButton.setForeground(new java.awt.Color(255, 255, 255));
        YesButton.setText("Yes");
        YesButton.setToolTipText("");
        YesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YesButtonMousePressed(evt);
            }
        });
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AsktoSubmitPanelLayout = new javax.swing.GroupLayout(AsktoSubmitPanel);
        AsktoSubmitPanel.setLayout(AsktoSubmitPanelLayout);
        AsktoSubmitPanelLayout.setHorizontalGroup(
            AsktoSubmitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsktoSubmitPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(AsktoSubmitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AskToSubmitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AsktoSubmitPanelLayout.createSequentialGroup()
                        .addComponent(YesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(NoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        AsktoSubmitPanelLayout.setVerticalGroup(
            AsktoSubmitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsktoSubmitPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(AskToSubmitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AsktoSubmitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AsktoSubmitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AsktoSubmitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoButtonMousePressed
        // TODO add your handling code here
    }//GEN-LAST:event_NoButtonMousePressed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        // TODO add your handling code here:
       SubjectiveTestFrame.SFrame.setVisible(true);
        setVisible(false);
       this.dispose();
           //que.setVisible(true);
    }//GEN-LAST:event_NoButtonActionPerformed

    private void YesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YesButtonMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_YesButtonMousePressed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            SubjectiveTestFrame.SFrame.timer.stop();
        SubjectiveResultFrame result=new SubjectiveResultFrame();
        result.setVisible(true);
        setVisible(false);
        dispose();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_YesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialogbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dialogbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AskToSubmitLabel;
    private javax.swing.JPanel AsktoSubmitPanel;
    private javax.swing.JButton NoButton;
    private javax.swing.JButton YesButton;
    // End of variables declaration//GEN-END:variables
}
