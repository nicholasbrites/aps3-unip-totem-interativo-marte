package apresentacao;

import apresentacao.frmResumo;  // importando o formulário frmResumo
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit
import modelo.Pessoa;  // importando a classe Pessoa da pasta modelo

public class frmAvaliacao extends javax.swing.JDialog {

    public frmAvaliacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false); // Impede de mudar o tamanho da janela
 
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize(); // instancia de uma classe para poder detectar o tamanho da tela
        setSize(tamanhoTela.width, tamanhoTela.height); // deixa a janela do tamanho da tela, deixando assim em fullscreen
        setLocation(0, 0); // faz com que a janela abra o mais no canto superior esquerdo possível da tela
    }
    
    int avaliacao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAPS = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        lblAlienNeutra = new javax.swing.JLabel();
        lblAlienOtima = new javax.swing.JLabel();
        lblAlienRuim1 = new javax.swing.JLabel();
        lblAlienOtima1 = new javax.swing.JLabel();
        lblAlienRuim = new javax.swing.JLabel();
        lblFrase2 = new javax.swing.JLabel();
        btnOtima = new javax.swing.JButton();
        btnRuim = new javax.swing.JButton();
        btnBoa = new javax.swing.JButton();
        btnPessima = new javax.swing.JButton();
        btnRegular = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avaliação");
        setMinimumSize(new java.awt.Dimension(839, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAPS.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS.setText("Ciência da Computação - APS 2024");
        getContentPane().add(lblAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        getContentPane().add(lblParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblAlienNeutra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alien-regular.png"))); // NOI18N
        getContentPane().add(lblAlienNeutra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        lblAlienOtima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alien-boa.png"))); // NOI18N
        getContentPane().add(lblAlienOtima, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        lblAlienRuim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alien-pessima.png"))); // NOI18N
        getContentPane().add(lblAlienRuim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, -1, -1));

        lblAlienOtima1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alien-otima.png"))); // NOI18N
        getContentPane().add(lblAlienOtima1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        lblAlienRuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alien-ruim.png"))); // NOI18N
        getContentPane().add(lblAlienRuim, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        lblFrase2.setFont(new java.awt.Font("Segoe UI Black", 0, 55)); // NOI18N
        lblFrase2.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase2.setText("AVALIE SUA EXPERIÊNCIA PARA FINALIZAR!");
        getContentPane().add(lblFrase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1330, -1));

        btnOtima.setBackground(new java.awt.Color(255, 255, 255));
        btnOtima.setFont(new java.awt.Font("Segoe UI Black", 0, 42)); // NOI18N
        btnOtima.setForeground(new java.awt.Color(102, 0, 0));
        btnOtima.setText("ÓTIMA");
        btnOtima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnOtima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtimaActionPerformed(evt);
            }
        });
        getContentPane().add(btnOtima, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 210, 90));

        btnRuim.setBackground(new java.awt.Color(255, 255, 255));
        btnRuim.setFont(new java.awt.Font("Segoe UI Black", 0, 42)); // NOI18N
        btnRuim.setForeground(new java.awt.Color(102, 0, 0));
        btnRuim.setText("RUIM");
        btnRuim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnRuim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuimActionPerformed(evt);
            }
        });
        getContentPane().add(btnRuim, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 210, 90));

        btnBoa.setBackground(new java.awt.Color(255, 255, 255));
        btnBoa.setFont(new java.awt.Font("Segoe UI Black", 0, 42)); // NOI18N
        btnBoa.setForeground(new java.awt.Color(102, 0, 0));
        btnBoa.setText("BOA");
        btnBoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnBoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 210, 90));

        btnPessima.setBackground(new java.awt.Color(255, 255, 255));
        btnPessima.setFont(new java.awt.Font("Segoe UI Black", 0, 42)); // NOI18N
        btnPessima.setForeground(new java.awt.Color(102, 0, 0));
        btnPessima.setText("PÉSSIMA");
        btnPessima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnPessima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessimaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPessima, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 510, 210, 90));

        btnRegular.setBackground(new java.awt.Color(255, 255, 255));
        btnRegular.setFont(new java.awt.Font("Segoe UI Black", 0, 42)); // NOI18N
        btnRegular.setForeground(new java.awt.Color(102, 0, 0));
        btnRegular.setText("REGULAR");
        btnRegular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegularActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 210, 90));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avaliacao-background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtimaActionPerformed
        dispose(); // fecha a janela
        avaliacao = 14; // uma nota que vai de 0 a 14, ele dita o ótimo como 9  p/ calcular-se a média depois
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setAvaliacao(avaliacao); // associa a avaliação a última cadastrada na lista de visitantes
        // instancia o próximo formulário, dita uma mensagem personalizada para a nota, e por fim torna-o visível
        frmResumo frmR = new frmResumo(null, true);
        frmR.lblFeedback.setText("Obrigado por nos dizer que sua experiência foi ÓTIMA, isso nos ajuda muito!");
        frmR.setVisible(true);
    }//GEN-LAST:event_btnOtimaActionPerformed

    private void btnPessimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessimaActionPerformed
        dispose(); // fecha a janela
        avaliacao = 0; // uma nota que vai de 0 a 14, ele dita o péssima como 1 p/ calcular-se a média depois
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setAvaliacao(avaliacao); // associa a avaliação a última cadastrada na lista de visitantes
        // instancia o próximo formulário, dita uma mensagem personalizada para a nota, e por fim torna-o visível
        frmResumo frmR = new frmResumo(null, true);
        frmR.lblFeedback.setText("Obrigado por nos dizer que sua experiência foi PÉSSIMA, isso nos ajuda muito!");
        frmR.setVisible(true);
    }//GEN-LAST:event_btnPessimaActionPerformed

    private void btnRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegularActionPerformed
        dispose(); // fecha a janela
        avaliacao = 7; // uma nota que vai de 0 a 14, ele dita o regular como 5  p/ calcular-se a média depois
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setAvaliacao(avaliacao); // associa a avaliação a última cadastrada na lista de visitantes
        // instancia o próximo formulário, dita uma mensagem personalizada para a nota, e por fim torna-o visível
        frmResumo frmR = new frmResumo(null, true); 
        frmR.lblFeedback.setText("Obrigado por nos dizer que sua experiência foi REGULAR, isso nos ajuda muito!");
        frmR.setVisible(true);
    }//GEN-LAST:event_btnRegularActionPerformed

    private void btnRuimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuimActionPerformed
        dispose(); // fecha a janela
        avaliacao = 4; // uma nota que vai de 0 a 14, ele dita o ruim como 5  p/ calcular-se a média depois
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setAvaliacao(avaliacao); // associa a avaliação a última cadastrada na lista de visitantes
        // instancia o próximo formulário, dita uma mensagem personalizada para a nota, e por fim torna-o visível
        frmResumo frmR = new frmResumo(null, true); 
        frmR.lblFeedback.setText("Obrigado por nos dizer que sua experiência foi RUIM, isso nos ajuda muito!");
        frmR.setVisible(true);
    }//GEN-LAST:event_btnRuimActionPerformed

    private void btnBoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoaActionPerformed
        dispose(); // fecha a janela
        avaliacao = 10; // uma nota que vai de 0 a 14, ele dita o boa como 5  p/ calcular-se a média depois
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setAvaliacao(avaliacao); // associa a avaliação a última cadastrada na lista de visitantes
        // instancia o próximo formulário, dita uma mensagem personalizada para a nota, e por fim torna-o visível
        frmResumo frmR = new frmResumo(null, true); 
        frmR.lblFeedback.setText("Obrigado por nos dizer que sua experiência foi BOA, isso nos ajuda muito!");
        frmR.setVisible(true);
    }//GEN-LAST:event_btnBoaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmAvaliacao dialog = new frmAvaliacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBoa;
    private javax.swing.JButton btnOtima;
    private javax.swing.JButton btnPessima;
    private javax.swing.JButton btnRegular;
    private javax.swing.JButton btnRuim;
    private javax.swing.JLabel lblAPS;
    private javax.swing.JLabel lblAlienNeutra;
    private javax.swing.JLabel lblAlienOtima;
    private javax.swing.JLabel lblAlienOtima1;
    private javax.swing.JLabel lblAlienRuim;
    private javax.swing.JLabel lblAlienRuim1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFrase2;
    private javax.swing.JLabel lblParticipantes;
    // End of variables declaration//GEN-END:variables
}
