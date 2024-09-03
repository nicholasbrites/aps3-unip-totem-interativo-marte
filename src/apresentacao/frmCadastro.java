package apresentacao;

import apresentacao.frmExposicao; // importando o formulário frmExposicao
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit
import javax.swing.JOptionPane; //importando o JOptionPane de uma biblioteca do Java para exibir as mensagem do Estaticos
import modelo.Controle; //importando o Controle da pasta modelo
import modelo.Estaticos; //importando o Estaticos da pasta modelo
import modelo.Pessoa; // importando a classe Pessoa da pasta modelo

public class frmCadastro extends javax.swing.JDialog {

    public frmCadastro(java.awt.Frame parent, boolean modal) {
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

        lblNome = new javax.swing.JLabel();
        lblAPS = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        btnAbrirTeclado = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txfIdade = new javax.swing.JTextField();
        btnAbrirNumerico = new javax.swing.JButton();
        btnProsseguir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 1, 45)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("DIGITE SEU NOME:");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblAPS.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS.setText("Ciência da Computação - APS 2024");
        getContentPane().add(lblAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        getContentPane().add(lblParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txfNome.setEditable(false);
        txfNome.setFont(new java.awt.Font("Dubai Medium", 1, 30)); // NOI18N
        txfNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        txfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 990, 50));

        btnAbrirTeclado.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnAbrirTeclado.setText("escrever");
        btnAbrirTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnAbrirTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrirTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 40));

        lblCPF.setFont(new java.awt.Font("Segoe UI Black", 1, 45)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("DIGITE SUA IDADE:");
        getContentPane().add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        txfIdade.setEditable(false);
        txfIdade.setFont(new java.awt.Font("Dubai Medium", 1, 30)); // NOI18N
        txfIdade.setText("  ");
        txfIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        txfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(txfIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 990, 50));

        btnAbrirNumerico.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        btnAbrirNumerico.setText("escrever");
        btnAbrirNumerico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnAbrirNumerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirNumericoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrirNumerico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 150, 40));

        btnProsseguir.setBackground(new java.awt.Color(255, 255, 255));
        btnProsseguir.setFont(new java.awt.Font("Arial Black", 0, 35)); // NOI18N
        btnProsseguir.setForeground(new java.awt.Color(102, 0, 0));
        btnProsseguir.setText("PROSSEGUIR");
        btnProsseguir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        btnProsseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirActionPerformed(evt);
            }
        });
        getContentPane().add(btnProsseguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 760, 120));

        lblTitulo.setBackground(new java.awt.Color(255, 124, 124));
        lblTitulo.setFont(new java.awt.Font("Bookman Old Style", 1, 115)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Dados Cadastrais");
        lblTitulo.setMaximumSize(new java.awt.Dimension(1080, 440));
        lblTitulo.setPreferredSize(size());
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1620, 120));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro-background.png"))); // NOI18N
        lblBackground.setPreferredSize(getMaximumSize());
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 1040));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeActionPerformed
    }//GEN-LAST:event_txfNomeActionPerformed

    private void btnAbrirTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirTecladoActionPerformed
        //ao clicar no botão abrirá o teclado virtual instanciando um objeto de frmTeclado
        frmTeclado frmT = new frmTeclado(null, true);
        frmT.setVisible(true);
        txfNome.setText(frmT.texto); // o texto que for escrito no teclado virtual será assumido pelo 'text field'
    }//GEN-LAST:event_btnAbrirTecladoActionPerformed

    private void txfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdadeActionPerformed
    }//GEN-LAST:event_txfIdadeActionPerformed

    private void btnAbrirNumericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirNumericoActionPerformed
        //ao clicar no botão abrirá o teclado virtual instanciando um objeto de frmNumerico
        frmNumerico frmN = new frmNumerico(null, true);
        frmN.setVisible(true);
        txfIdade.setText(frmN.texto + " anos");
        // os números que forem escritos no teclado numérico virtual será assumido pelo 'text field', e já formatado com "." e "-"
        // usando o comando substring, ele pegará a posição dos caracteres digitados e colocará então um "." após 3 números, depois após 6 números, e um "-" após o 9º 
    }//GEN-LAST:event_btnAbrirNumericoActionPerformed

    private void btnProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirActionPerformed

        if(txfNome.getText().length() < 1 || txfNome.getText().length() > 15) // se o usuário deixar o campo de texto vazio ou ultrapassar os 15 caracteres, ele envia um atributo vazio para a instância 
        {
            txfNome.setText("");
        }
        
        if(txfIdade.getText().length() < 6 || txfIdade.getText().length() > 8) // se o usuário deixar o campo de texto vazio ou acima de 3 caracteres(desconsiderado o " anos"), ele envia um atributo vazio para a instância
        {
            txfIdade.setText("");
        }
        
        // Instanciando um objeto da classe Controle, para que ele passe por uma validação e o programa entenda se é possível mesmo prosseguir
        Controle controle = new Controle(txfIdade.getText(), txfNome.getText());
        
        if(Estaticos.MENSAGEM.equals(""))
        {
            Pessoa visita = new Pessoa(txfIdade.getText().substring(0, txfIdade.getText().length() - 5), txfNome.getText(), 0, 0);
            Pessoa.pessoas.add(visita);
            //se a mensagem do Estaticos estiver vazia é por que não deu erro, então cria-se um item na lista estática de visitantes, com nome, idade, nota(ainda no 0) e avaliação(ainda no 0).
            dispose();
            frmExposicao frmE = new frmExposicao(null, true);
            frmE.setVisible(true);            
        }
        else
        {
            // se a mensagem do Estaticos não for vazia, então é por que deu erro, então mostrar uma mensagem de erros exibindo MENSAGEM e travando na mesma tela do frmCadastro
            JOptionPane.showMessageDialog(null, Estaticos.MENSAGEM);
        }
    }//GEN-LAST:event_btnProsseguirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadastro dialog = new frmCadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrirNumerico;
    private javax.swing.JButton btnAbrirTeclado;
    private javax.swing.JButton btnProsseguir;
    private javax.swing.JLabel lblAPS;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txfIdade;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables

    private void setEditable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String geTexto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
