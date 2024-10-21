/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TeladeLogin;
import telaChamado.telaChamado;
import TeladeCadastro.CadastroJava;
import javax.swing.JLabel;
import classes.Usuario;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telaChamadoTec.telaChamadoTec;

/**
 *
 * @author renan.losantos
 */
public class TelaLogin extends javax.swing.JFrame {

    private Boolean usuarioValido;
    /*
    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JLabel txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JLabel getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JLabel txtSenha) {
        this.txtSenha = txtSenha;
    }
*/
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaLogin() {
        initComponents();
        entrarJava.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Usuario usuario = new Usuario();
                System.out.println(emailJava.getText());
                
                usuario.setEmail(emailJava.getText());
                usuario.setSenha(senhaJava.getText());
        
                if("".equals(usuario.getEmail())){
                    JOptionPane.showMessageDialog(null, "Campo e-mail precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    emailJava.grabFocus();
                }
                else if("".equals(usuario.getSenha())){
                    
                    JOptionPane.showMessageDialog(null, "Campo senha precisa ser informado!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    senhaJava.grabFocus();
                }
                else{
                    usuarioValido = usuario.VerificarUsuario(usuario.getEmail(), usuario.getSenha());
                    
                    if(usuarioValido == true){
                        JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao sistema JDesk!!!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                        Usuario usuarioDados = new Usuario();

                        if(usuarioDados.TIPO.trim().equals("F")){
                            System.out.println("MAINPAGE COMO F");
                            telaChamado telaChamado = new telaChamado();
                            telaChamado.abrirTela();
                            dispose();
                        } else {
                            System.out.println("MAINPAGE COMO T");
                            telaChamadoTec telaChamadoTec = new telaChamadoTec();
                            telaChamadoTec.abrirTela();
                                    
                            dispose();
                        }
                        
                    }
                     else{
                        JOptionPane.showMessageDialog(null, "Usuario invalido ou inexistente!!!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                }
                }
            });
        
        cadastroJava.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CadastroJava telaDeCadastro = new CadastroJava();
                telaDeCadastro.abrirTela();
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

        jButton1 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JLabel();
        emailJava = new javax.swing.JTextField();
        senhaJava = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JLabel();
        entrarJava = new javax.swing.JButton();
        bemvindoJava = new javax.swing.JLabel();
        cadastroJava = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Login");
        setLocation(new java.awt.Point(680, 280));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanel1.setLayout(null);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setText("E-mail:");
        jPanel1.add(txtEmail);
        txtEmail.setBounds(150, 150, 48, 22);

        emailJava.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        emailJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJavaActionPerformed(evt);
            }
        });
        jPanel1.add(emailJava);
        emailJava.setBounds(150, 180, 260, 30);

        senhaJava.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(senhaJava);
        senhaJava.setBounds(150, 250, 260, 30);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSenha.setText("Senha:");
        jPanel1.add(txtSenha);
        txtSenha.setBounds(150, 220, 80, 20);

        entrarJava.setBackground(new java.awt.Color(244, 68, 52));
        entrarJava.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarJava.setText("Entrar");
        entrarJava.setBorder(null);
        entrarJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarJavaActionPerformed(evt);
            }
        });
        jPanel1.add(entrarJava);
        entrarJava.setBounds(190, 300, 180, 34);

        bemvindoJava.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bemvindoJava.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemvindoJava.setText("Bem vindo usuario faça login com sua conta ou cadastra-se!");
        jPanel1.add(bemvindoJava);
        bemvindoJava.setBounds(80, 360, 420, 20);

        cadastroJava.setBackground(new java.awt.Color(37, 150, 190));
        cadastroJava.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cadastroJava.setText("Cadastrar");
        cadastroJava.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(cadastroJava);
        cadastroJava.setBounds(220, 400, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-logo-java-coffee-cup-144.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 120, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJavaActionPerformed

    private void entrarJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarJavaActionPerformed
        // TODO add your handling code here           
    }//GEN-LAST:event_entrarJavaActionPerformed
    public void abrirTela(){
        new TelaLogin().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindoJava;
    private javax.swing.JButton cadastroJava;
    private javax.swing.JTextField emailJava;
    private javax.swing.JButton entrarJava;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaJava;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
