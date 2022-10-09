/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.EmployeeHistory;

/**
 *
 * @author Brijesh
 */
public class MainJFrame extends javax.swing.JFrame {

    EmployeeHistory history;
    public MainJFrame() {
        history = new EmployeeHistory();
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

        jSplitPane = new javax.swing.JSplitPane();
        jLeftPanel = new javax.swing.JPanel();
        jCreateBtn = new javax.swing.JButton();
        jViewBtn = new javax.swing.JButton();
        jSearchBtn = new javax.swing.JButton();
        jRightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setPreferredSize(new java.awt.Dimension(800, 645));

        jCreateBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jCreateBtn.setText("Create ");
        jCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateBtnActionPerformed(evt);
            }
        });

        jViewBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jViewBtn.setText("View");
        jViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewBtnActionPerformed(evt);
            }
        });

        jSearchBtn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jSearchBtn.setText("Search");
        jSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLeftPanelLayout = new javax.swing.GroupLayout(jLeftPanel);
        jLeftPanel.setLayout(jLeftPanelLayout);
        jLeftPanelLayout.setHorizontalGroup(
            jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCreateBtn)
                    .addComponent(jViewBtn)
                    .addComponent(jSearchBtn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLeftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCreateBtn, jSearchBtn, jViewBtn});

        jLeftPanelLayout.setVerticalGroup(
            jLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLeftPanelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jCreateBtn)
                .addGap(18, 18, 18)
                .addComponent(jViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSearchBtn)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jLeftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCreateBtn, jViewBtn});

        jSplitPane.setLeftComponent(jLeftPanel);

        javax.swing.GroupLayout jRightPanelLayout = new javax.swing.GroupLayout(jRightPanel);
        jRightPanel.setLayout(jRightPanelLayout);
        jRightPanelLayout.setHorizontalGroup(
            jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jRightPanelLayout.setVerticalGroup(
            jRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(jRightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateBtnActionPerformed
        CreateJPanel createJPanel = new CreateJPanel(history);
        jSplitPane.setRightComponent(createJPanel);
    }//GEN-LAST:event_jCreateBtnActionPerformed

    private void jViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewBtnActionPerformed
        int size = history.getSize();
        if (size == 0){
            JOptionPane.showMessageDialog(this, "No data available. Please create a new employee record first.");
        }
        else{
            ViewJPanel viewJPanel = new ViewJPanel(history);
            jSplitPane.setRightComponent(viewJPanel);
        }
    }//GEN-LAST:event_jViewBtnActionPerformed

    private void jSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchBtnActionPerformed
        int size = history.getSize();
        if (size == 0){
            JOptionPane.showMessageDialog(this, "No data available. Please create a new employee record first.");
        }
        else{
            SearchJPanel searchJPanel = new SearchJPanel(history);
            jSplitPane.setRightComponent(searchJPanel);
        }
    }//GEN-LAST:event_jSearchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCreateBtn;
    private javax.swing.JPanel jLeftPanel;
    private javax.swing.JPanel jRightPanel;
    private javax.swing.JButton jSearchBtn;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JButton jViewBtn;
    // End of variables declaration//GEN-END:variables
}
