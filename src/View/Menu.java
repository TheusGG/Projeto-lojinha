/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    public Menu(String nome, String cargo) {
        initComponents();
        
        lblSaudacao.setText("Bem-vindo " + nome);
        lblCargo.setText("Cargo: " + cargo);
        if (cargo.equalsIgnoreCase("Atendente")) {
            btnCadUsuario.setEnabled(false);

        } else if (cargo.equalsIgnoreCase("Supervisor")) {
        }

        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrada = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnCadUsuario = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setIconImage(new ImageIcon(getClass().getResource("/Imagem/iconloja.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrada.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/documento-48.png"))); // NOI18N
        btnEntrada.setText("Entrada dos Produtos");
        btnEntrada.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
        });
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 40));

        btnVenda.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/caixa-registradora.png"))); // NOI18N
        btnVenda.setText("Venda dos Produtos");
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, -1));

        btnCadUsuario.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Users_v3.png"))); // NOI18N
        btnCadUsuario.setText("Cadastro de Usuarios");
        btnCadUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 240, -1));
        getContentPane().add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, 30));

        lblSaudacao.setBackground(new java.awt.Color(255, 0, 0));
        lblSaudacao.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblSaudacao.setText("Bem vindo");
        getContentPane().add(lblSaudacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/capa.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 360));

        jMenuCadastro.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Logoff.png"))); // NOI18N
        jMenuItem1.setText("Logoff");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-sair-24.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem3);

        jMenuBar1.add(jMenuCadastro);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(420, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        Entrada a;
        a = new Entrada();
        a.setVisible(true);

    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        Venda a;
        a = new Venda();
        a.setVisible(true);

    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuarioActionPerformed
        CadastroUsuario a;
        a = new CadastroUsuario();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Login t = new Login();
        t.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadUsuario;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnVenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblSaudacao;
    // End of variables declaration//GEN-END:variables
}
