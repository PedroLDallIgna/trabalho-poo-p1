/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FileHandler;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import model.Estagiario;
import model.Funcionario;

/**
 *
 * @author Computacao
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemCadastroFuncionario = new javax.swing.JMenuItem();
        mItemCadastroEstagiario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mItemVisualizarFuncionario = new javax.swing.JMenuItem();
        mItemVisualizarEstagiario = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        mItemCadastroFuncionario.setText("Funcionario");
        mItemCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCadastroFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(mItemCadastroFuncionario);

        mItemCadastroEstagiario.setText("Estagiario");
        mItemCadastroEstagiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCadastroEstagiarioActionPerformed(evt);
            }
        });
        jMenu1.add(mItemCadastroEstagiario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar");

        mItemVisualizarFuncionario.setText("Funcionario");
        mItemVisualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVisualizarFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(mItemVisualizarFuncionario);

        mItemVisualizarEstagiario.setText("Estagiario");
        mItemVisualizarEstagiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVisualizarEstagiarioActionPerformed(evt);
            }
        });
        jMenu2.add(mItemVisualizarEstagiario);

        jMenuBar1.add(jMenu2);

        menuDelete.setText("Deletar");
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });

        jMenuItem1.setText("deletar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem1);

        jMenuBar1.add(menuDelete);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCadastroFuncionarioActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_mItemCadastroFuncionarioActionPerformed

    private void mItemCadastroEstagiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCadastroEstagiarioActionPerformed
        CadastroEstagiario cadastroEstagiario = new CadastroEstagiario();
        cadastroEstagiario.setVisible(true);
    }//GEN-LAST:event_mItemCadastroEstagiarioActionPerformed

    private void mItemVisualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVisualizarFuncionarioActionPerformed
        FileHandler<Funcionario> fileHandler = new FileHandler();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione o arquivo");
        
        int opt = fileChooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filename = selectedFile.getAbsolutePath();
            
            try {
                Funcionario funcionario = fileHandler.read(filename);
                
                VisualizarFuncionario visualizarFuncionario = new VisualizarFuncionario();
                visualizarFuncionario.setFuncionario(funcionario);
                
                visualizarFuncionario.setVisible(true);
                visualizarFuncionario.showContent();
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mItemVisualizarFuncionarioActionPerformed

    private void mItemVisualizarEstagiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVisualizarEstagiarioActionPerformed
        FileHandler<Estagiario> fileHandler = new FileHandler();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione o arquivo");
        
        int opt = fileChooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filename = selectedFile.getAbsolutePath();
            
            try {
                Estagiario estagiario = fileHandler.read(filename);
                
                VisualizarEstagiario visualizarEstagiario = new VisualizarEstagiario();
                visualizarEstagiario.setEstagiario(estagiario);
                
                visualizarEstagiario.setVisible(true);
                visualizarEstagiario.showContent();
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mItemVisualizarEstagiarioActionPerformed

    private void menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteActionPerformed
        
    }//GEN-LAST:event_menuDeleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogType(0);
        fileChooser.setApproveButtonText("Deletar");
        fileChooser.setDialogTitle("Selecione o arquivo");
        
        int opt = fileChooser.showOpenDialog(this);
        if (opt == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            selectedFile.delete();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mItemCadastroEstagiario;
    private javax.swing.JMenuItem mItemCadastroFuncionario;
    private javax.swing.JMenuItem mItemVisualizarEstagiario;
    private javax.swing.JMenuItem mItemVisualizarFuncionario;
    private javax.swing.JMenu menuDelete;
    // End of variables declaration//GEN-END:variables
}