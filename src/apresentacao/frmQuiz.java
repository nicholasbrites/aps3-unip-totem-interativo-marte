package apresentacao;

import apresentacao.frmAvaliacao; // importando o formulário frmAvaliacao
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit
import modelo.Pessoa;  // importando a classe Pessoa da pasta modelo

public class frmQuiz extends javax.swing.JDialog{

    public frmQuiz(java.awt.Frame parent, boolean modal) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tdpMenu = new javax.swing.JTabbedPane();
        panPergunta1 = new javax.swing.JPanel();
        lblPergunta1 = new javax.swing.JLabel();
        rdbResposta1A = new javax.swing.JRadioButton();
        lblImagem1 = new javax.swing.JLabel();
        rdbResposta1B = new javax.swing.JRadioButton();
        rdbResposta1C = new javax.swing.JRadioButton();
        rdbResposta1D = new javax.swing.JRadioButton();
        rdbResposta1E = new javax.swing.JRadioButton();
        lblAPS = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        panPergunta2 = new javax.swing.JPanel();
        lblPergunta2 = new javax.swing.JLabel();
        rdbResposta2A = new javax.swing.JRadioButton();
        rdbResposta2B = new javax.swing.JRadioButton();
        rdbResposta2C = new javax.swing.JRadioButton();
        rdbResposta2D = new javax.swing.JRadioButton();
        rdbResposta2E = new javax.swing.JRadioButton();
        lblImagem2 = new javax.swing.JLabel();
        lblAPS1 = new javax.swing.JLabel();
        lblParticipantes1 = new javax.swing.JLabel();
        lblBackgroundSoujoner = new javax.swing.JLabel();
        panPergunta3 = new javax.swing.JPanel();
        lblAPS2 = new javax.swing.JLabel();
        rdbResposta3A = new javax.swing.JRadioButton();
        rdbResposta3B = new javax.swing.JRadioButton();
        rdbResposta3C = new javax.swing.JRadioButton();
        rdbResposta3D = new javax.swing.JRadioButton();
        rdbResposta3E = new javax.swing.JRadioButton();
        lblPergunta3 = new javax.swing.JLabel();
        lblParticipantes2 = new javax.swing.JLabel();
        lblImagem3 = new javax.swing.JLabel();
        lblBackgroundPerseverance = new javax.swing.JLabel();
        panPergunta4 = new javax.swing.JPanel();
        lblAPS3 = new javax.swing.JLabel();
        lblImagem4 = new javax.swing.JLabel();
        rdbResposta4A = new javax.swing.JRadioButton();
        rdbResposta4B = new javax.swing.JRadioButton();
        rdbResposta4C = new javax.swing.JRadioButton();
        rdbResposta4D = new javax.swing.JRadioButton();
        rdbResposta4E = new javax.swing.JRadioButton();
        lblPergunta4 = new javax.swing.JLabel();
        lblParticipantes3 = new javax.swing.JLabel();
        lblBackgroundCuriosity = new javax.swing.JLabel();
        panPergunta5 = new javax.swing.JPanel();
        lblTextoSoujoner4 = new javax.swing.JLabel();
        rdbResposta5A = new javax.swing.JRadioButton();
        rdbResposta5B = new javax.swing.JRadioButton();
        rdbResposta5C = new javax.swing.JRadioButton();
        rdbResposta5D = new javax.swing.JRadioButton();
        rdbResposta5E = new javax.swing.JRadioButton();
        lblAPS4 = new javax.swing.JLabel();
        lblImagem5 = new javax.swing.JLabel();
        lblPergunta5 = new javax.swing.JLabel();
        lblBackgroundSpiritOpportunity = new javax.swing.JLabel();
        panQuiz = new javax.swing.JPanel();
        lblTexto2 = new javax.swing.JLabel();
        lblAPS5 = new javax.swing.JLabel();
        lblParticipantes5 = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        btnResponder = new javax.swing.JButton();
        lblBackgroundQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quiz");
        setMinimumSize(new java.awt.Dimension(839, 684));
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("Exposições");
        jPanel1.setMaximumSize(getSize());

        tdpMenu.setBackground(new java.awt.Color(65, 10, 10));
        tdpMenu.setForeground(new java.awt.Color(255, 255, 255));
        tdpMenu.setToolTipText("");
        tdpMenu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        panPergunta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPergunta1.setBackground(new java.awt.Color(0, 0, 0));
        lblPergunta1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 30)); // NOI18N
        lblPergunta1.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta1.setText(" Dentre todos os rovers citados nessa apresentação, qual deles é o menor?");
        panPergunta1.add(lblPergunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1520, -1));

        rdbResposta1A.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup1.add(rdbResposta1A);
        rdbResposta1A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta1A.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta1A.setSelected(true);
        rdbResposta1A.setText("Curiosity");
        rdbResposta1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta1AActionPerformed(evt);
            }
        });
        panPergunta1.add(rdbResposta1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lblImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img-pergunta1.png"))); // NOI18N
        lblImagem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPergunta1.add(lblImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        rdbResposta1B.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup1.add(rdbResposta1B);
        rdbResposta1B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta1B.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta1B.setText("Opportunity");
        rdbResposta1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta1BActionPerformed(evt);
            }
        });
        panPergunta1.add(rdbResposta1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        rdbResposta1C.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup1.add(rdbResposta1C);
        rdbResposta1C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta1C.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta1C.setText("Soujoner");
        rdbResposta1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta1CActionPerformed(evt);
            }
        });
        panPergunta1.add(rdbResposta1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        rdbResposta1D.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup1.add(rdbResposta1D);
        rdbResposta1D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta1D.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta1D.setText("Spirit");
        rdbResposta1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta1DActionPerformed(evt);
            }
        });
        panPergunta1.add(rdbResposta1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        rdbResposta1E.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup1.add(rdbResposta1E);
        rdbResposta1E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta1E.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta1E.setText("Perseverance");
        rdbResposta1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta1EActionPerformed(evt);
            }
        });
        panPergunta1.add(rdbResposta1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblAPS.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS.setText("Ciência da Computação - APS 2024");
        panPergunta1.add(lblAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPergunta1.add(lblParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panPergunta1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tdpMenu.addTab("PERGUNTA 1", panPergunta1);

        panPergunta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPergunta2.setBackground(new java.awt.Color(0, 0, 0));
        lblPergunta2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 30)); // NOI18N
        lblPergunta2.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta2.setText("Qual foi a grande descoberta do Perseverance?");
        panPergunta2.add(lblPergunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1520, -1));

        rdbResposta2A.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup2.add(rdbResposta2A);
        rdbResposta2A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta2A.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta2A.setSelected(true);
        rdbResposta2A.setText("A existência de metais");
        rdbResposta2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta2AActionPerformed(evt);
            }
        });
        panPergunta2.add(rdbResposta2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        rdbResposta2B.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup2.add(rdbResposta2B);
        rdbResposta2B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta2B.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta2B.setText("Que marte aparenta não ser somente um deserto seco");
        rdbResposta2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta2BActionPerformed(evt);
            }
        });
        panPergunta2.add(rdbResposta2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        rdbResposta2C.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup2.add(rdbResposta2C);
        rdbResposta2C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta2C.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta2C.setText("A possibilidade de furar rochas marcianas");
        rdbResposta2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta2CActionPerformed(evt);
            }
        });
        panPergunta2.add(rdbResposta2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        rdbResposta2D.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup2.add(rdbResposta2D);
        rdbResposta2D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta2D.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta2D.setText("Moléculas orgânicas em uma cratera");
        rdbResposta2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta2DActionPerformed(evt);
            }
        });
        panPergunta2.add(rdbResposta2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        rdbResposta2E.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup2.add(rdbResposta2E);
        rdbResposta2E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta2E.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta2E.setText("Espécies de animais vivos em Marte");
        rdbResposta2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta2EActionPerformed(evt);
            }
        });
        panPergunta2.add(rdbResposta2E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img-pergunta2.png"))); // NOI18N
        lblImagem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPergunta2.add(lblImagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        lblAPS1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS1.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS1.setText("Ciência da Computação - APS 2024");
        panPergunta2.add(lblAPS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes1.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes1.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPergunta2.add(lblParticipantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblBackgroundSoujoner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panPergunta2.add(lblBackgroundSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("PERGUNTA 2", panPergunta2);

        panPergunta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAPS2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS2.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS2.setText("Ciência da Computação - APS 2024");
        panPergunta3.add(lblAPS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rdbResposta3A.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup3.add(rdbResposta3A);
        rdbResposta3A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta3A.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta3A.setSelected(true);
        rdbResposta3A.setText("Gêmeos marcianos");
        rdbResposta3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta3AActionPerformed(evt);
            }
        });
        panPergunta3.add(rdbResposta3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        rdbResposta3B.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup3.add(rdbResposta3B);
        rdbResposta3B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta3B.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta3B.setText("Dois rovers");
        rdbResposta3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta3BActionPerformed(evt);
            }
        });
        panPergunta3.add(rdbResposta3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        rdbResposta3C.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup3.add(rdbResposta3C);
        rdbResposta3C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta3C.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta3C.setText("Irmãos rovers");
        rdbResposta3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta3CActionPerformed(evt);
            }
        });
        panPergunta3.add(rdbResposta3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        rdbResposta3D.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup3.add(rdbResposta3D);
        rdbResposta3D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta3D.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta3D.setText("Dupla de marte");
        rdbResposta3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta3DActionPerformed(evt);
            }
        });
        panPergunta3.add(rdbResposta3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        rdbResposta3E.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup3.add(rdbResposta3E);
        rdbResposta3E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta3E.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta3E.setText("Rovers gêmeos");
        rdbResposta3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta3EActionPerformed(evt);
            }
        });
        panPergunta3.add(rdbResposta3E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblPergunta3.setBackground(new java.awt.Color(0, 0, 0));
        lblPergunta3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 30)); // NOI18N
        lblPergunta3.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta3.setText("Que apelido os rovers Spirit & Opportunity ganharam?");
        panPergunta3.add(lblPergunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1520, -1));

        lblParticipantes2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes2.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes2.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPergunta3.add(lblParticipantes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img-pergunta3.png"))); // NOI18N
        lblImagem3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPergunta3.add(lblImagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        lblBackgroundPerseverance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panPergunta3.add(lblBackgroundPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("PERGUNTA 3", panPergunta3);

        panPergunta4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAPS3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS3.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS3.setText("Ciência da Computação - APS 2024");
        panPergunta4.add(lblAPS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblImagem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img-pergunta4.png"))); // NOI18N
        lblImagem4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPergunta4.add(lblImagem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        rdbResposta4A.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup4.add(rdbResposta4A);
        rdbResposta4A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta4A.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta4A.setSelected(true);
        rdbResposta4A.setText("Painéis solares em sua carcaça");
        rdbResposta4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta4AActionPerformed(evt);
            }
        });
        panPergunta4.add(rdbResposta4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        rdbResposta4B.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup4.add(rdbResposta4B);
        rdbResposta4B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta4B.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta4B.setText("Carregadores via cabo, na base de suas naves");
        rdbResposta4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta4BActionPerformed(evt);
            }
        });
        panPergunta4.add(rdbResposta4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        rdbResposta4C.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup4.add(rdbResposta4C);
        rdbResposta4C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta4C.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta4C.setText("Carregadores via sensor, na base de suas naves");
        rdbResposta4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta4CActionPerformed(evt);
            }
        });
        panPergunta4.add(rdbResposta4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        rdbResposta4D.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup4.add(rdbResposta4D);
        rdbResposta4D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta4D.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta4D.setText("Energia eólica, devido aos fortes ventos em marte");
        rdbResposta4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta4DActionPerformed(evt);
            }
        });
        panPergunta4.add(rdbResposta4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        rdbResposta4E.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup4.add(rdbResposta4E);
        rdbResposta4E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta4E.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta4E.setText("Pilhas hiper potentes em parceria com uma empresa americana");
        rdbResposta4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta4EActionPerformed(evt);
            }
        });
        panPergunta4.add(rdbResposta4E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblPergunta4.setBackground(new java.awt.Color(0, 0, 0));
        lblPergunta4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 30)); // NOI18N
        lblPergunta4.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta4.setText("Qual a principal fonte de energia para que os primeiros rovers funcionassem?");
        panPergunta4.add(lblPergunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1520, -1));

        lblParticipantes3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes3.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes3.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPergunta4.add(lblParticipantes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblBackgroundCuriosity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panPergunta4.add(lblBackgroundCuriosity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tdpMenu.addTab("PERGUNTA 4", panPergunta4);

        panPergunta5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoSoujoner4.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 30)); // NOI18N
        lblTextoSoujoner4.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner4.setText("Em que ano marte recebeu o primeiro rover?");
        panPergunta5.add(lblTextoSoujoner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1520, -1));

        rdbResposta5A.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup5.add(rdbResposta5A);
        rdbResposta5A.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta5A.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta5A.setSelected(true);
        rdbResposta5A.setText("2004");
        rdbResposta5A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta5AActionPerformed(evt);
            }
        });
        panPergunta5.add(rdbResposta5A, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        rdbResposta5B.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup5.add(rdbResposta5B);
        rdbResposta5B.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta5B.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta5B.setText("1997");
        rdbResposta5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta5BActionPerformed(evt);
            }
        });
        panPergunta5.add(rdbResposta5B, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        rdbResposta5C.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup5.add(rdbResposta5C);
        rdbResposta5C.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta5C.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta5C.setText("1972");
        rdbResposta5C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta5CActionPerformed(evt);
            }
        });
        panPergunta5.add(rdbResposta5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        rdbResposta5D.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup5.add(rdbResposta5D);
        rdbResposta5D.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta5D.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta5D.setText("Será lançado em 2028");
        rdbResposta5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta5DActionPerformed(evt);
            }
        });
        panPergunta5.add(rdbResposta5D, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        rdbResposta5E.setBackground(new java.awt.Color(51, 0, 0));
        buttonGroup5.add(rdbResposta5E);
        rdbResposta5E.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        rdbResposta5E.setForeground(new java.awt.Color(255, 255, 255));
        rdbResposta5E.setText("2021");
        rdbResposta5E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbResposta5EActionPerformed(evt);
            }
        });
        panPergunta5.add(rdbResposta5E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        lblAPS4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS4.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS4.setText("Ciência da Computação - APS 2024");
        panPergunta5.add(lblAPS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblImagem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img-pergunta5.png"))); // NOI18N
        lblImagem5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPergunta5.add(lblImagem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        lblPergunta5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblPergunta5.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta5.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPergunta5.add(lblPergunta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblBackgroundSpiritOpportunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panPergunta5.add(lblBackgroundSpiritOpportunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("PERGUNTA 5", panPergunta5);

        panQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTexto2.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto2.setText("Lembrando que é recomendável ler o conteúdo antes, já que as perguntas serão sobre o mesmo.");
        panQuiz.add(lblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1390, -1));

        lblAPS5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS5.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS5.setText("Ciência da Computação - APS 2024");
        panQuiz.add(lblAPS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes5.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes5.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panQuiz.add(lblParticipantes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblTexto1.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto1.setText("Clique no botão para responder o Quiz!");
        panQuiz.add(lblTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 1280, -1));

        btnResponder.setBackground(new java.awt.Color(243, 243, 243));
        btnResponder.setFont(new java.awt.Font("Bookman Old Style", 1, 60)); // NOI18N
        btnResponder.setForeground(new java.awt.Color(102, 0, 0));
        btnResponder.setText("RESPONDER");
        btnResponder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 23, 23), 5));
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        panQuiz.add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 600, 140));

        lblBackgroundQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quiz-background.png"))); // NOI18N
        panQuiz.add(lblBackgroundQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("RESPONDER", panQuiz);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tdpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tdpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        int acertos = 0; // criando um atributo interno do tipo int e valor zero
        
        // vai conferir se cada um dos radio button's estão selecionados, e se sim, somar +1 no valor de acertos
        if(rdbResposta1C.isSelected()){acertos = acertos + 1;}
        if(rdbResposta2D.isSelected()){acertos = acertos + 1;}
        if(rdbResposta3E.isSelected()){acertos = acertos + 1;}
        if(rdbResposta4A.isSelected()){acertos = acertos + 1;}
        if(rdbResposta5B.isSelected()){acertos = acertos + 1;}
        
        Pessoa.pessoas.get(Pessoa.pessoas.size()-1).setNota(acertos); // pegar o número de acertos e associa como número de acertos da última pessoa cadastrada na lista de visitantes
        
        // fecha a tela do Quiz e cria um objeto para tornar visível a tela da classe frmAvaliacao
        dispose();
        frmAvaliacao frmA = new frmAvaliacao(null, true);
        frmA.setVisible(true);
    }//GEN-LAST:event_btnResponderActionPerformed

    private void rdbResposta1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta1EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta1EActionPerformed

    private void rdbResposta1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta1DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta1DActionPerformed

    private void rdbResposta1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta1CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta1CActionPerformed

    private void rdbResposta1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta1BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta1BActionPerformed

    private void rdbResposta1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta1AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta1AActionPerformed

    private void rdbResposta2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta2AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta2AActionPerformed

    private void rdbResposta2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta2BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta2BActionPerformed

    private void rdbResposta2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta2CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta2CActionPerformed

    private void rdbResposta2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta2DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta2DActionPerformed

    private void rdbResposta2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta2EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta2EActionPerformed

    private void rdbResposta3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta3AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta3AActionPerformed

    private void rdbResposta3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta3BActionPerformed

    }//GEN-LAST:event_rdbResposta3BActionPerformed

    private void rdbResposta3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta3CActionPerformed

    }//GEN-LAST:event_rdbResposta3CActionPerformed

    private void rdbResposta3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta3DActionPerformed

    }//GEN-LAST:event_rdbResposta3DActionPerformed

    private void rdbResposta3EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta3EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta3EActionPerformed

    private void rdbResposta4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta4AActionPerformed

    }//GEN-LAST:event_rdbResposta4AActionPerformed

    private void rdbResposta4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta4BActionPerformed

    }//GEN-LAST:event_rdbResposta4BActionPerformed

    private void rdbResposta4CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta4CActionPerformed

    }//GEN-LAST:event_rdbResposta4CActionPerformed

    private void rdbResposta4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta4DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta4DActionPerformed

    private void rdbResposta4EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta4EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta4EActionPerformed

    private void rdbResposta5AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta5AActionPerformed

    }//GEN-LAST:event_rdbResposta5AActionPerformed

    private void rdbResposta5BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta5BActionPerformed

    }//GEN-LAST:event_rdbResposta5BActionPerformed

    private void rdbResposta5CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta5CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbResposta5CActionPerformed

    private void rdbResposta5DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta5DActionPerformed

    }//GEN-LAST:event_rdbResposta5DActionPerformed

    private void rdbResposta5EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbResposta5EActionPerformed

    }//GEN-LAST:event_rdbResposta5EActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmQuiz dialog = new frmQuiz(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnResponder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAPS;
    private javax.swing.JLabel lblAPS1;
    private javax.swing.JLabel lblAPS2;
    private javax.swing.JLabel lblAPS3;
    private javax.swing.JLabel lblAPS4;
    private javax.swing.JLabel lblAPS5;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundCuriosity;
    private javax.swing.JLabel lblBackgroundPerseverance;
    private javax.swing.JLabel lblBackgroundQuiz;
    private javax.swing.JLabel lblBackgroundSoujoner;
    private javax.swing.JLabel lblBackgroundSpiritOpportunity;
    private javax.swing.JLabel lblImagem1;
    private javax.swing.JLabel lblImagem2;
    private javax.swing.JLabel lblImagem3;
    private javax.swing.JLabel lblImagem4;
    private javax.swing.JLabel lblImagem5;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblParticipantes1;
    private javax.swing.JLabel lblParticipantes2;
    private javax.swing.JLabel lblParticipantes3;
    private javax.swing.JLabel lblParticipantes5;
    private javax.swing.JLabel lblPergunta1;
    private javax.swing.JLabel lblPergunta2;
    private javax.swing.JLabel lblPergunta3;
    private javax.swing.JLabel lblPergunta4;
    private javax.swing.JLabel lblPergunta5;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTextoSoujoner4;
    private javax.swing.JPanel panPergunta1;
    private javax.swing.JPanel panPergunta2;
    private javax.swing.JPanel panPergunta3;
    private javax.swing.JPanel panPergunta4;
    private javax.swing.JPanel panPergunta5;
    private javax.swing.JPanel panQuiz;
    private javax.swing.JRadioButton rdbResposta1A;
    private javax.swing.JRadioButton rdbResposta1B;
    private javax.swing.JRadioButton rdbResposta1C;
    private javax.swing.JRadioButton rdbResposta1D;
    private javax.swing.JRadioButton rdbResposta1E;
    private javax.swing.JRadioButton rdbResposta2A;
    private javax.swing.JRadioButton rdbResposta2B;
    private javax.swing.JRadioButton rdbResposta2C;
    private javax.swing.JRadioButton rdbResposta2D;
    private javax.swing.JRadioButton rdbResposta2E;
    private javax.swing.JRadioButton rdbResposta3A;
    private javax.swing.JRadioButton rdbResposta3B;
    private javax.swing.JRadioButton rdbResposta3C;
    private javax.swing.JRadioButton rdbResposta3D;
    private javax.swing.JRadioButton rdbResposta3E;
    private javax.swing.JRadioButton rdbResposta4A;
    private javax.swing.JRadioButton rdbResposta4B;
    private javax.swing.JRadioButton rdbResposta4C;
    private javax.swing.JRadioButton rdbResposta4D;
    private javax.swing.JRadioButton rdbResposta4E;
    private javax.swing.JRadioButton rdbResposta5A;
    private javax.swing.JRadioButton rdbResposta5B;
    private javax.swing.JRadioButton rdbResposta5C;
    private javax.swing.JRadioButton rdbResposta5D;
    private javax.swing.JRadioButton rdbResposta5E;
    private javax.swing.JTabbedPane tdpMenu;
    // End of variables declaration//GEN-END:variables
}
