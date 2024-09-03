package apresentacao;

import apresentacao.frmCadastro; // importando o formulário frmCadastro
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit

public class frmPrincipal extends javax.swing.JDialog {
    
    
    public frmPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false); // Impede de mudar o tamanho da janela
 
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize(); // instancia de uma classe para poder detectar o tamanho da tela
        setSize(tamanhoTela.width, tamanhoTela.height); // deixa a janela do tamanho da tela, deixando assim em fullscreen
        setLocation(0, 0); // faz com que a janela abra o mais no canto superior esquerdo possível da tela
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        lblBemVindo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblAPS = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("UNIPADOS MUSEU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setMaximumSize(new java.awt.Dimension(1440, 900));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setSize(new java.awt.Dimension(1440, 900));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindo.setFont(new java.awt.Font("Segoe UI Black", 1, 130)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("SEJA BEM-VINDO");
        lblBemVindo.setMaximumSize(getMaximumSize());
        lblBemVindo.setMinimumSize(getMaximumSize());
        lblBemVindo.setPreferredSize(getMaximumSize());
        getContentPane().add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 1350, 100));

        btnIniciar.setBackground(new java.awt.Color(243, 243, 243));
        btnIniciar.setFont(new java.awt.Font("Bookman Old Style", 1, 100)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(107, 0, 0));
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 23, 23), 5));
        btnIniciar.setPreferredSize(getMaximumSize());
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 160));

        lblAPS.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS.setText("Ciência da Computação - APS 2024");
        getContentPane().add(lblAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        getContentPane().add(lblParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        lblLogo.setPreferredSize(getMaximumSize());
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 1330, 180));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/marte-background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 910));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        dispose(); //fechar a tela do frmPrincipal após o botão ser clicado
        frmCadastro frmC = new frmCadastro(null, true); // instancia um objeto para exibir o formulário do frmCadastro
        frmC.setVisible(true); // torna o objeto do frmCadastro visível
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel lblAPS;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblParticipantes;
    // End of variables declaration//GEN-END:variables
}
