package EditaFuncionario;

import abrirChamados.*;
import java.awt.event.ActionListener;
import javax.swing.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import classes.Chamados;
import classes.Usuario;
import telaChamado.telaChamado;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author renan.losantos
 */
public class editarChamado extends javax.swing.JFrame {

    /**
     * Creates new form abrirChamado
     */
    private String patrimonio;
    private String problema;
    public editarChamado() {
        initComponents();
        
        btnCriar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Chamados chamados = new Chamados();
                Usuario usuario = new Usuario();
                int patrimonio = Integer.parseInt(textAreaPatri.getText());
                chamados.CriarChamados(patrimonio, textAreaProblema.getText(), usuario.idTecnico);
                JOptionPane.showMessageDialog(null, "Chamado cadastrado com sucesso, por favor, aguarde um técnico.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                telaChamado mainpage = new telaChamado();
                mainpage.abrirTela();
                dispose();
                
            }
        });
        btnVoltar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                telaChamado mainpage = new telaChamado();
                mainpage.abrirTela();
                dispose();
                
            }
        });
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
        txtCriarChamado = new javax.swing.JLabel();
        JavaLogo = new javax.swing.JLabel();
        txtProblema = new javax.swing.JLabel();
        txtPatri = new javax.swing.JLabel();
        textAreaProblema = new javax.swing.JFormattedTextField();
        textAreaPatri = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 420));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtCriarChamado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCriarChamado.setText("EDITAR CHAMADOS");
        jPanel1.add(txtCriarChamado);
        txtCriarChamado.setBounds(140, 50, 420, 20);

        JavaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-logo-java-coffee-cup-144.png"))); // NOI18N
        JavaLogo.setText("jLabel2");
        jPanel1.add(JavaLogo);
        JavaLogo.setBounds(170, 80, 130, 120);

        txtProblema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProblema.setText("Problema:");
        jPanel1.add(txtProblema);
        txtProblema.setBounds(110, 280, 70, 20);

        txtPatri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPatri.setText("Patrimônio:");
        jPanel1.add(txtPatri);
        txtPatri.setBounds(110, 220, 90, 20);
        jPanel1.add(textAreaProblema);
        textAreaProblema.setBounds(110, 300, 280, 30);
        jPanel1.add(textAreaPatri);
        textAreaPatri.setBounds(110, 240, 280, 30);

        btnVoltar.setBackground(new java.awt.Color(255, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(10, 10, 84, 30);

        btnCriar.setBackground(new java.awt.Color(255, 255, 204));
        btnCriar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCriar.setText("EDITAR");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCriar);
        btnCriar.setBounds(150, 340, 180, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Edite os chamados dos úsuarios para Concluir ou cancelar!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 390, 400, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarActionPerformed
     public void abrirTela(){
         new editarChamado().setVisible(true);
     }
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
            java.util.logging.Logger.getLogger(editarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarChamado().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaLogo;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField textAreaPatri;
    private javax.swing.JFormattedTextField textAreaProblema;
    private javax.swing.JLabel txtCriarChamado;
    private javax.swing.JLabel txtPatri;
    private javax.swing.JLabel txtProblema;
    // End of variables declaration//GEN-END:variables
}
