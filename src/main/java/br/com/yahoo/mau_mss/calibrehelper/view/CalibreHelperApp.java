package br.com.yahoo.mau_mss.calibrehelper.view;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import br.com.yahoo.mau_mss.calibrehelper.util.ActionSupport;

/**
 *
 * @author mauricio.soares
 */
public class CalibreHelperApp extends javax.swing.JFrame {
  private ActionSupport actionSupport = new ActionSupport();
  private static final long serialVersionUID = 1L;

  /**
   * Creates new form CalibreHelperApp
   */
  public CalibreHelperApp() {
    initComponents();
  }
  
  public String getJTextFieldInput() {
    return this.jTextFieldInput.getText();
  }
  
  public void setJTextFieldInput(String text) {
    this.jTextFieldInput.setText(text);
  }
  
  public boolean isJCheckBoxRenameChapter() {
    return this.jCheckBoxRenameChapter.isSelected();
  }
  
  public void setJCheckBoxRenameChapter(boolean select) {
    this.jCheckBoxRenameChapter.setSelected(select);
  }
  
  public boolean isJCheckBoxKeepImagesTogether() {
    return this.jCheckBoxKeepImagesTogether.isSelected();
  }
  
  public void setJCheckBoxKeepImagesTogether(boolean select) {
    this.jCheckBoxKeepImagesTogether.setSelected(select);
  }
  
  public int getJProgressBarEspecific() {
    return this.jProgressBarEspecific.getValue();
  }

  public void setJProgressBarEspecific(int posicao) {
    this.jProgressBarEspecific.setValue(posicao);
  }
  public void ajustaJProgressBarEspecific(int minimo, int maximo) {
    this.jProgressBarEspecific.setMinimum(minimo);
    this.jProgressBarEspecific.setMaximum(maximo);
  }

  public int getJProgressBarEspecificMin() {
    return this.jProgressBarEspecific.getMinimum();
  }

  public int getJProgressBarEspecificMax() {
    return this.jProgressBarEspecific.getMaximum();
  }

  public String getJLabelEspecific() {
    return this.jLabelEspecific.getText();
  }

  public void setJLabelEspecific(String label) {
    this.jLabelEspecific.setText(label);
  }

  public void desligaCursorEspera() {
    this.jButtonOk.setEnabled(true);
    setCursor(null); //desliga o cursor de espera
  }

  public void ligaCursorEspera() {
    this.jButtonOk.setEnabled(false);
    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
  }
  
  /**
    * Adiciona um listener para propagar eventos neste form
    * @param listener ActionListener
    */
  public void addActionListener(ActionListener listener) {
    this.actionSupport.addActionListener(listener);
  }

  /**
    * Remove um listener para propagar eventos neste form
    * @param listener ActionListener
    */
  public void removeActionListener(ActionListener listener) {
    this.actionSupport.removeActionListener(listener);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldInput = new javax.swing.JTextField();
        jToggleButtonInput = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jProgressBarEspecific = new javax.swing.JProgressBar();
        jLabelEspecific = new javax.swing.JLabel();
        jCheckBoxRenameChapter = new javax.swing.JCheckBox();
        jCheckBoxKeepImagesTogether = new javax.swing.JCheckBox();
        jButtonOk = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalibreHelper");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Diretório de entrada:");

        jToggleButtonInput.setText("...");
        jToggleButtonInput.setToolTipText("Digite o diretório de partida para busca de arquivos");
        jToggleButtonInput.setActionCommand("acharInput");
        jToggleButtonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonInputActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelEspecific.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBarEspecific, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEspecific, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBarEspecific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEspecific)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBoxRenameChapter.setText("Renomeia capítulos");

        jCheckBoxKeepImagesTogether.setText("Não quebra pág. por imagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonInput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxRenameChapter)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxKeepImagesTogether)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxRenameChapter)
                    .addComponent(jCheckBoxKeepImagesTogether))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonOk.setText("Processar");
        jButtonOk.setActionCommand("processar");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonExit.setText("Cancelar");
        jButtonExit.setActionCommand("cancelar");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
    this.actionSupport.fireActionEvent(evt);
  }//GEN-LAST:event_jButtonOkActionPerformed

  private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    this.actionSupport.fireActionEvent(evt);
  }//GEN-LAST:event_jButtonExitActionPerformed

  private void jToggleButtonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonInputActionPerformed
    this.actionSupport.fireActionEvent(evt);
  }//GEN-LAST:event_jToggleButtonInputActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the
     * default look and feel. For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(CalibreHelperApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CalibreHelperApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CalibreHelperApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CalibreHelperApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        new CalibreHelperApp().setVisible(true);
      }
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JCheckBox jCheckBoxKeepImagesTogether;
    private javax.swing.JCheckBox jCheckBoxRenameChapter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEspecific;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBarEspecific;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JToggleButton jToggleButtonInput;
    // End of variables declaration//GEN-END:variables
}
