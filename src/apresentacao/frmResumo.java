package apresentacao;

import apresentacao.frmPrincipal;  // importando o formulário frmPrincipal
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit
import modelo.Pessoa;  // importando a classe Pessoa da pasta modelo

public class frmResumo extends javax.swing.JDialog {

    public frmResumo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false); // Impede de mudar o tamanho da janela
 
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize(); // instancia de uma classe para poder detectar o tamanho da tela
        setSize(tamanhoTela.width, tamanhoTela.height); // deixa a janela do tamanho da tela, deixando assim em fullscreen
        setLocation(0, 0); // faz com que a janela abra o mais no canto superior esquerdo possível da tela
    }
    
    // método para conferir a idade, e caso seja menor de idade, exibe uma mensagem de personalizada pedindo para andar com o responsável
    public String qualIdade()
    {
        if(Integer.valueOf(Pessoa.pessoas.get(Pessoa.pessoas.size()-1).getIdade()) < 18)
        {
            return "Acompanhe o responsável, aproveite o nosso museu e divirta-se!";
        }
        else
        {
            return "Aproveite o nosso museu e divirta-se!";
        }
    }
    
    // calcula a média de acertos de todos os visitantes através de uma estrutura repetitiva com um "for", conferindo a nota de todos, somando, e após sair do "for", divide pelo tamanho da lista, ou seja, o número de visitantes.
    public String media()
    {
        double media = 0;
        for(int i = 0 ; i < Pessoa.pessoas.size() ; i++)
        {
            media += Pessoa.pessoas.get(i).getNota();
        }
        media /= Pessoa.pessoas.size();
        return String.format("%.0f", media);
    }
    
    // calcula a média de avaliações de todos os visitantes, com base naquele atributo interno que vai de 0 a 14 através de uma estrutura repetitiva com um "for", conferindo a avaliação de todos, somando, e após sair do "for", divide pelo tamanho da lista, ou seja, o número de visitantes.
    public String feedback()
    {
        int media = 0;
        for(int i = 0 ; i < Pessoa.pessoas.size() ; i++)
        {
            media += Pessoa.pessoas.get(i).getAvaliacao();
        }
        media /= Pessoa.pessoas.size();
        
        if(media <= 2)
        {
            return "PÉSSIMA"; // se a média estiver entre 0 a 2, a média é péssima
        }
        else
        {
            if(media >= 12)
            {
                return "ÓTIMA"; // se não, se a média estiver entre 12 e 14, a média é ótima
            }
            else
            {
                if(media >= 9)
                {
                    return "BOA"; // se não, se a média estiver entre 9 e 11, a média é boa
                }
                else
                {
                    if(media <= 5)
                    {
                        return "RUIM"; // se não, se a média estiver entre 3 e 5, a média é ruim
                    }
                    else
                    {
                        return "REGULAR"; // se não, a média é regular
                    }
                }
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAPS1 = new javax.swing.JLabel();
        lblParticipantes1 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        lblFrase1 = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblFeedback1 = new javax.swing.JLabel();
        lblFeedback = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumo");
        setMaximumSize(new java.awt.Dimension(839, 684));
        setMinimumSize(new java.awt.Dimension(839, 684));
        setPreferredSize(new java.awt.Dimension(839, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAPS1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS1.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS1.setText("Ciência da Computação - APS 2024");
        getContentPane().add(lblAPS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes1.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes1.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        getContentPane().add(lblParticipantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblMensagem.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensagem.setText(qualIdade());
        getContentPane().add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 1390, -1));

        lblNota1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lblNota1.setForeground(new java.awt.Color(255, 255, 255));
        lblNota1.setText("A média de acerto das pessoas é de " + media() + "/5"
        );
        getContentPane().add(lblNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        lblNota2.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        lblNota2.setForeground(new java.awt.Color(255, 255, 255));
        lblNota2.setText("visita Nº " + Pessoa.pessoas.size()
        );
        getContentPane().add(lblNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        lblFrase1.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblFrase1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFrase1.setText("OBRIGADO PELA SUA VISITA, " + Pessoa.pessoas.get(Pessoa.pessoas.size()-1).getNome() + "!"
        );
        lblFrase1.setPreferredSize(getMaximumSize());
        getContentPane().add(lblFrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1530, 100));

        lblNota.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Sua nota em nosso quiz foi: " + Pessoa.pessoas.get(Pessoa.pessoas.size()-1).getNota() + "/5"
        );
        getContentPane().add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        lblFeedback1.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lblFeedback1.setForeground(new java.awt.Color(255, 255, 255));
        lblFeedback1.setText("A média baseada nas avaliações recebidas é de: " + feedback());
        getContentPane().add(lblFeedback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        lblFeedback.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lblFeedback.setForeground(new java.awt.Color(255, 255, 255));
        lblFeedback.setText("FEEDBACK");
        getContentPane().add(lblFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        btnFinalizar.setBackground(new java.awt.Color(243, 243, 243));
        btnFinalizar.setFont(new java.awt.Font("Bookman Old Style", 1, 60)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(107, 0, 0));
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 23, 23), 5));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 970, 101));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 170));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/resumo-background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1760, 1080));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // como a tela tem uma proposta de apenas entregar na parte visual, e os valores das label's já foram definidos anteriormente
        // o botão apenas fecha a tela frmResumo e gera a tela do frmPrincipal, retornando ao início de tudo
        dispose();
        frmPrincipal frmP = new frmPrincipal(null, true);
        frmP.setVisible(true);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmResumo dialog = new frmResumo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAPS1;
    private javax.swing.JLabel lblBackground;
    public javax.swing.JLabel lblFeedback;
    public javax.swing.JLabel lblFeedback1;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblMensagem;
    public javax.swing.JLabel lblNota;
    public javax.swing.JLabel lblNota1;
    public javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblParticipantes1;
    // End of variables declaration//GEN-END:variables
}
