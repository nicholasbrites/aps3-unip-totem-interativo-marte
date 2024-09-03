package apresentacao;

import apresentacao.frmQuiz; // importando o formulário frmQuiz
import java.awt.Dimension; // importando a biblioteca Dimesion
import java.awt.Toolkit; // importando a biblioteca Toolkit
import modelo.Pessoa;  // importando a classe Pessoa da pasta modelo

public class frmExposicao extends javax.swing.JDialog{

    public frmExposicao(java.awt.Frame parent, boolean modal) {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tdpMenu = new javax.swing.JTabbedPane();
        panGuia = new javax.swing.JPanel();
        lblFrase2 = new javax.swing.JLabel();
        lblFrase1 = new javax.swing.JLabel();
        lblFrase3 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        lblMensagem1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblAPS = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        panSoujoner = new javax.swing.JPanel();
        lblTextoSoujoner5 = new javax.swing.JLabel();
        lblTextoSoujoner6 = new javax.swing.JLabel();
        lblTextoSoujoner1 = new javax.swing.JLabel();
        lblTextoSoujoner8 = new javax.swing.JLabel();
        lblTextoSoujoner4 = new javax.swing.JLabel();
        lblTextoSoujoner3 = new javax.swing.JLabel();
        lblImgSoujoner = new javax.swing.JLabel();
        lblLarguraSoujoner = new javax.swing.JLabel();
        lblCustoSoujoner = new javax.swing.JLabel();
        lblAPS1 = new javax.swing.JLabel();
        lblParticipantes1 = new javax.swing.JLabel();
        lblComprimentoSoujoner = new javax.swing.JLabel();
        lblAlturaSoujoner = new javax.swing.JLabel();
        lblMassaSoujoner = new javax.swing.JLabel();
        lblTextoSoujoner2 = new javax.swing.JLabel();
        lblTextoSoujoner7 = new javax.swing.JLabel();
        lblLegenda = new javax.swing.JLabel();
        lblBackgroundSoujoner = new javax.swing.JLabel();
        panPerseverance = new javax.swing.JPanel();
        lblTextoPerseverance3 = new javax.swing.JLabel();
        lblTextoPerseverance4 = new javax.swing.JLabel();
        lblTextoPerseverance5 = new javax.swing.JLabel();
        lblAlturaPerseverance = new javax.swing.JLabel();
        lblComprimentoPerseverance = new javax.swing.JLabel();
        lblLarguraPerseverance = new javax.swing.JLabel();
        lblMassaPerseverance = new javax.swing.JLabel();
        lblCustoPerseverance = new javax.swing.JLabel();
        lblImgPerseverance = new javax.swing.JLabel();
        lblTextoPerseverance7 = new javax.swing.JLabel();
        lblAPS2 = new javax.swing.JLabel();
        lblParticipantes2 = new javax.swing.JLabel();
        lblTextoPerseverance2 = new javax.swing.JLabel();
        lblTextoPerseverance1 = new javax.swing.JLabel();
        lblLegendaPerseverance = new javax.swing.JLabel();
        lblTextoPerseverance6 = new javax.swing.JLabel();
        lblBackgroundPerseverance = new javax.swing.JLabel();
        panCuriosity = new javax.swing.JPanel();
        lblTextoCuriosity5 = new javax.swing.JLabel();
        lblTextoCuriosity4 = new javax.swing.JLabel();
        lblTextoCuriosity3 = new javax.swing.JLabel();
        lblTextoCuriosity2 = new javax.swing.JLabel();
        lblAPS3 = new javax.swing.JLabel();
        lblParticipantes3 = new javax.swing.JLabel();
        lblTextoCuriosity1 = new javax.swing.JLabel();
        lblImgCuriosity = new javax.swing.JLabel();
        lblImgRochaCuriosity = new javax.swing.JLabel();
        lblLegendaCuriosity = new javax.swing.JLabel();
        lblBackgroundCuriosity = new javax.swing.JLabel();
        panSpiritOpportunity = new javax.swing.JPanel();
        lblTextoSpiritOpportunity1 = new javax.swing.JLabel();
        lblTextoSpiritOpportunity2 = new javax.swing.JLabel();
        lblTextoSpiritOpportunity3 = new javax.swing.JLabel();
        lblTextoSpiritOpportunity4 = new javax.swing.JLabel();
        lblAPS4 = new javax.swing.JLabel();
        lblParticipantes4 = new javax.swing.JLabel();
        lblLegendaSpiritOpportunity = new javax.swing.JLabel();
        lblImgSpiritOpportunity = new javax.swing.JLabel();
        lblTextoSpiritOpportunity5 = new javax.swing.JLabel();
        lblTextoSpiritOpportunity6 = new javax.swing.JLabel();
        lblTextoSpiritOpportunity7 = new javax.swing.JLabel();
        lblBackgroundSpiritOpportunity = new javax.swing.JLabel();
        panQuiz = new javax.swing.JPanel();
        lblFraseQuiz = new javax.swing.JLabel();
        lblAPS5 = new javax.swing.JLabel();
        lblParticipantes5 = new javax.swing.JLabel();
        lblTituloQuiz = new javax.swing.JLabel();
        btnQuiz = new javax.swing.JButton();
        lblBackgroundQuiz = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel6.setText("Contava com um painel solar em sua carapaça para lhe manter vivo durante sua única semana de vida útil, além de");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel9.setText("conter uma antena de comunicação, um dispositivo que permitia realizar seus estudos sobre o solo, e rodas que");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel1.setText("Soujoner foi o primeiro rover a pousar em Marte em missão da NASA, em 25 de março de 1997.");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel12.setText("o permitia correr a 60cm por minuto, no planeta vermelho. Tudo isso em uma estrutura de 62cm de comprimento,");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel2.setText("Sua principal missão era estudar o solo marciano, analisar a composição das rochas e fotografar tudo que pudesse.");

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel13.setText("o permitia correr a 60cm por minuto, no planeta vermelho. Tudo isso em uma estrutura de 62cm de comprimento,");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel3.setText("afro-americanas, que se chamava Soujoner Truth.");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jLabel4.setText("O robô recebe este nome em homenagem a uma ativista norte-americana que lutava pelos direitos das mulheres");

        jLabel17.setText("ALTURA:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exposição");
        setMinimumSize(new java.awt.Dimension(839, 684));
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("Exposições");
        jPanel1.setMaximumSize(getSize());

        tdpMenu.setBackground(new java.awt.Color(65, 10, 10));
        tdpMenu.setForeground(new java.awt.Color(255, 255, 255));
        tdpMenu.setToolTipText("");
        tdpMenu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        panGuia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase2.setFont(new java.awt.Font("Segoe UI Black", 0, 25)); // NOI18N
        lblFrase2.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase2.setText("exposições, e algumas curiosidades sobre o tema em que tudo se decorre:");
        panGuia.add(lblFrase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 1160, -1));

        lblFrase1.setFont(new java.awt.Font("Segoe UI Black", 0, 25)); // NOI18N
        lblFrase1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase1.setText("Nesta tela você poderá viajar entre as janelas para conhecer um pouco sobre nossas");
        panGuia.add(lblFrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 1160, -1));

        lblFrase3.setFont(new java.awt.Font("Segoe UI Black", 0, 25)); // NOI18N
        lblFrase3.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase3.setText("Ao fim do conteúdo, você deverá concluir um quiz rápido de apenas 5 perguntas de múltipla escolha.");
        panGuia.add(lblFrase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 1280, -1));

        lblMensagem.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensagem.setText("BEM-VINDO, AMIGO MARCIANO!");
        panGuia.add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1910, -1));

        lblMensagem1.setFont(new java.awt.Font("Segoe UI Black", 1, 50)); // NOI18N
        lblMensagem1.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensagem1.setText("Como é bom ter você por aqui, " + Pessoa.pessoas.get(Pessoa.pessoas.size()-1).getNome() + "!");
        panGuia.add(lblMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1910, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        panGuia.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, -1, -1));

        lblAPS.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS.setText("Ciência da Computação - APS 2024");
        panGuia.add(lblAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panGuia.add(lblParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("\"Robôs Exploradores em Marte\"");
        panGuia.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panGuia.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tdpMenu.addTab("GUIA", panGuia);

        panSoujoner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoSoujoner5.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner5.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner5.setText("Contava com um painel solar em sua carapaça para lhe manter vivo durante sua única semana de vida útil, além de");
        panSoujoner.add(lblTextoSoujoner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1530, -1));

        lblTextoSoujoner6.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner6.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner6.setText("conter uma antena de comunicação, um dispositivo que permitia realizar seus estudos sobre o solo, e rodas que");
        panSoujoner.add(lblTextoSoujoner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1530, -1));

        lblTextoSoujoner1.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner1.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner1.setText("Um dos sucessos do museu, confira a réplica deste rover, que foi pioneiro na missão de explorar marte.");
        panSoujoner.add(lblTextoSoujoner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1520, -1));

        lblTextoSoujoner8.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner8.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner8.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner8.setText("tecnológico para a época.");
        panSoujoner.add(lblTextoSoujoner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1520, 40));

        lblTextoSoujoner4.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner4.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner4.setText("afro-americanas, que se chamava Soujoner Truth.");
        panSoujoner.add(lblTextoSoujoner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1520, -1));

        lblTextoSoujoner3.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner3.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner3.setText("O robô recebe este nome em homenagem a uma ativista norte-americana que lutava pelos direitos das mulheres");
        panSoujoner.add(lblTextoSoujoner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1520, -1));

        lblImgSoujoner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/soujoner.png"))); // NOI18N
        lblImgSoujoner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panSoujoner.add(lblImgSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        lblLarguraSoujoner.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblLarguraSoujoner.setForeground(new java.awt.Color(255, 255, 255));
        lblLarguraSoujoner.setText("LARGURA: 48cm");
        panSoujoner.add(lblLarguraSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, -1, -1));

        lblCustoSoujoner.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblCustoSoujoner.setForeground(new java.awt.Color(255, 255, 255));
        lblCustoSoujoner.setText("CUSTO: US$ 25 milhões");
        panSoujoner.add(lblCustoSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 660, -1, -1));

        lblAPS1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS1.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS1.setText("Ciência da Computação - APS 2024");
        panSoujoner.add(lblAPS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes1.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes1.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panSoujoner.add(lblParticipantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblComprimentoSoujoner.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblComprimentoSoujoner.setForeground(new java.awt.Color(255, 255, 255));
        lblComprimentoSoujoner.setText("COMPRIMENTO: 63cm");
        panSoujoner.add(lblComprimentoSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        lblAlturaSoujoner.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblAlturaSoujoner.setForeground(new java.awt.Color(255, 255, 255));
        lblAlturaSoujoner.setText("ALTURA:  28cm");
        panSoujoner.add(lblAlturaSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, -1, -1));

        lblMassaSoujoner.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblMassaSoujoner.setForeground(new java.awt.Color(255, 255, 255));
        lblMassaSoujoner.setText("MASSA: 10kg");
        panSoujoner.add(lblMassaSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        lblTextoSoujoner2.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner2.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner2.setText("Soujoner foi o primeiro rover a pousar em Marte em missão da NASA, em 25 de março de 1997.");
        panSoujoner.add(lblTextoSoujoner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1520, -1));

        lblTextoSoujoner7.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSoujoner7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSoujoner7.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSoujoner7.setText("o permitia correr a 60cm por minuto, no planeta vermelho. Algo que hoje possa parecer simples, mas muito");
        panSoujoner.add(lblTextoSoujoner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1520, -1));

        lblLegenda.setBackground(new java.awt.Color(0, 0, 0));
        lblLegenda.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 10)); // NOI18N
        lblLegenda.setForeground(new java.awt.Color(255, 255, 255));
        lblLegenda.setText("imagem ilustrativa");
        panSoujoner.add(lblLegenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 700, 100, -1));

        lblBackgroundSoujoner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panSoujoner.add(lblBackgroundSoujoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("SOUJONER", panSoujoner);

        panPerseverance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoPerseverance3.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance3.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance3.setText("Por mais recente que seja sua chegada, o maquinário já fez duas grandes descobertas até aqui:");
        panPerseverance.add(lblTextoPerseverance3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1450, -1));

        lblTextoPerseverance4.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance4.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance4.setText("   - Sedimento de antigos lagos em uma grande cratera, que um dia já foi preenchida por água em sua totalidade.");
        panPerseverance.add(lblTextoPerseverance4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1450, -1));

        lblTextoPerseverance5.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance5.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance5.setText("   - Existência de moléculas orgânicas, pré-requisito de evidência para a vida, na mesma cratera.");
        panPerseverance.add(lblTextoPerseverance5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1450, -1));

        lblAlturaPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblAlturaPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblAlturaPerseverance.setText("ALTURA:  2,2m");
        panPerseverance.add(lblAlturaPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, -1, -1));

        lblComprimentoPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblComprimentoPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblComprimentoPerseverance.setText("COMPRIMENTO: 3m");
        panPerseverance.add(lblComprimentoPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        lblLarguraPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblLarguraPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblLarguraPerseverance.setText("LARGURA: 2,7m");
        panPerseverance.add(lblLarguraPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, -1, -1));

        lblMassaPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblMassaPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblMassaPerseverance.setText("MASSA: 1.050kg");
        panPerseverance.add(lblMassaPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, -1, -1));

        lblCustoPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        lblCustoPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblCustoPerseverance.setText("CUSTO: US$ 2,4 bilhões");
        panPerseverance.add(lblCustoPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, -1, -1));

        lblImgPerseverance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perseverance.png"))); // NOI18N
        lblImgPerseverance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panPerseverance.add(lblImgPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        lblTextoPerseverance7.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance7.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance7.setText("O próximo rover tem previsão de lançamento para 2028, o ExoMars, feito pela Agência Espacial Européia(ESA).");
        panPerseverance.add(lblTextoPerseverance7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1450, -1));

        lblAPS2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS2.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS2.setText("Ciência da Computação - APS 2024");
        panPerseverance.add(lblAPS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes2.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes2.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panPerseverance.add(lblParticipantes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblTextoPerseverance2.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance2.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance2.setText("Perseverance é o robô explorador mais recente já lançado para Marte, pousando no planeta em 2021.");
        panPerseverance.add(lblTextoPerseverance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1420, -1));

        lblTextoPerseverance1.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance1.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance1.setText("Confira também a réplica deste rover, numa escala em tamanho real, com sua imponência de impressionar.");
        panPerseverance.add(lblTextoPerseverance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1420, -1));

        lblLegendaPerseverance.setBackground(new java.awt.Color(0, 0, 0));
        lblLegendaPerseverance.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 10)); // NOI18N
        lblLegendaPerseverance.setForeground(new java.awt.Color(255, 255, 255));
        lblLegendaPerseverance.setText("imagem ilustrativa");
        panPerseverance.add(lblLegendaPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 100, -1));

        lblTextoPerseverance6.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoPerseverance6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoPerseverance6.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoPerseverance6.setText("Este rover é o mais tecnológico já feito, e promete nos render muito conhecimento sobre marte no futuro.");
        panPerseverance.add(lblTextoPerseverance6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1450, -1));

        lblBackgroundPerseverance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panPerseverance.add(lblBackgroundPerseverance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("PERSEVERANCE", panPerseverance);

        panCuriosity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoCuriosity5.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoCuriosity5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoCuriosity5.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCuriosity5.setText("É possível dizer que ele foi um dos primeiros a nos fornecer imagens em altíssima qualidade de definição.");
        panCuriosity.add(lblTextoCuriosity5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1470, -1));

        lblTextoCuriosity4.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoCuriosity4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoCuriosity4.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCuriosity4.setText("realiza uma grande descoberta, encontrando uma rocha com um metal, que foi levado para estudo imediatamente");
        panCuriosity.add(lblTextoCuriosity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1470, -1));

        lblTextoCuriosity3.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoCuriosity3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoCuriosity3.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCuriosity3.setText("Como dito, ele possuia uma furadeira que foi testada em 1.200 tipos de rochas diferentes na Terra. E em 2016 ele");
        panCuriosity.add(lblTextoCuriosity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1470, -1));

        lblTextoCuriosity2.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoCuriosity2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoCuriosity2.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCuriosity2.setText("O Curiosity pousou em agosto de 2012 em missão interplanetária.");
        panCuriosity.add(lblTextoCuriosity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1470, -1));

        lblAPS3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS3.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS3.setText("Ciência da Computação - APS 2024");
        panCuriosity.add(lblAPS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes3.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes3.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panCuriosity.add(lblParticipantes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblTextoCuriosity1.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoCuriosity1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoCuriosity1.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCuriosity1.setText("Você também pode ver o primeiro grande rover, contendo até furadeira em seu desing, aqui em nosso museu.");
        panCuriosity.add(lblTextoCuriosity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1470, -1));

        lblImgCuriosity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curiosity.png"))); // NOI18N
        lblImgCuriosity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panCuriosity.add(lblImgCuriosity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 400, 240));

        lblImgRochaCuriosity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rocha.png"))); // NOI18N
        lblImgRochaCuriosity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panCuriosity.add(lblImgRochaCuriosity, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 150, 200));

        lblLegendaCuriosity.setBackground(new java.awt.Color(0, 0, 0));
        lblLegendaCuriosity.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 10)); // NOI18N
        lblLegendaCuriosity.setForeground(new java.awt.Color(255, 255, 255));
        lblLegendaCuriosity.setText("imagem ilustrativa");
        panCuriosity.add(lblLegendaCuriosity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 100, -1));

        lblBackgroundCuriosity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panCuriosity.add(lblBackgroundCuriosity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        tdpMenu.addTab("CURIOSITY", panCuriosity);

        panSpiritOpportunity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoSpiritOpportunity1.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity1.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity1.setText("Tem mais dois robôs para você ficar de olho em nossas exposições, não perca a chance de conferir as réplicas.");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1450, -1));

        lblTextoSpiritOpportunity2.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity2.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity2.setText("Spirit e Opportunity são conhecidos como \"Rovers Gêmeos\", e pousaram no planeta vermelho em janeiro de 2004.");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1450, -1));

        lblTextoSpiritOpportunity3.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity3.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity3.setText("Eles tinham exatamente o mesmo modelo, e não eram pequenos como os antigos robôs, mas ainda não tão");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1450, -1));

        lblTextoSpiritOpportunity4.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity4.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity4.setText("extravagantes como os robôs atualmente. A dupla exploradora tinha dimensões semelhantes a um carro de golfe.");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1460, -1));

        lblAPS4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS4.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS4.setText("Ciência da Computação - APS 2024");
        panSpiritOpportunity.add(lblAPS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes4.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes4.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panSpiritOpportunity.add(lblParticipantes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblLegendaSpiritOpportunity.setBackground(new java.awt.Color(0, 0, 0));
        lblLegendaSpiritOpportunity.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 10)); // NOI18N
        lblLegendaSpiritOpportunity.setForeground(new java.awt.Color(255, 255, 255));
        lblLegendaSpiritOpportunity.setText("imagem ilustrativa");
        panSpiritOpportunity.add(lblLegendaSpiritOpportunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 100, -1));

        lblImgSpiritOpportunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/spirit-e-opportunity.png"))); // NOI18N
        lblImgSpiritOpportunity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 5));
        panSpiritOpportunity.add(lblImgSpiritOpportunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        lblTextoSpiritOpportunity5.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity5.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity5.setText("O feito deles entrou pra história, já que eles foram responsáveis por apresentar o 'lado molhado' de Marte,");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1450, -1));

        lblTextoSpiritOpportunity6.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity6.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity6.setText("identificando solos úmidos, e fontes termais. Nos fazendo questionar se o planeta sempre foi esse grande deserto");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1450, -1));

        lblTextoSpiritOpportunity7.setBackground(new java.awt.Color(0, 0, 0));
        lblTextoSpiritOpportunity7.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 25)); // NOI18N
        lblTextoSpiritOpportunity7.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoSpiritOpportunity7.setText("que se encontra hoje.");
        panSpiritOpportunity.add(lblTextoSpiritOpportunity7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 1450, -1));

        lblBackgroundSpiritOpportunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panSpiritOpportunity.add(lblBackgroundSpiritOpportunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("SPIRIT & OPPORTUNITY", panSpiritOpportunity);

        panQuiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFraseQuiz.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lblFraseQuiz.setForeground(new java.awt.Color(255, 255, 255));
        lblFraseQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFraseQuiz.setText("Lembrando que é recomendável ler o conteúdo antes, já que as perguntas serão sobre o mesmo.");
        panQuiz.add(lblFraseQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1390, -1));

        lblAPS5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblAPS5.setForeground(new java.awt.Color(255, 255, 255));
        lblAPS5.setText("Ciência da Computação - APS 2024");
        panQuiz.add(lblAPS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblParticipantes5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lblParticipantes5.setForeground(new java.awt.Color(255, 255, 255));
        lblParticipantes5.setText("Cassiano Melo - Gabriel dos Santos - Nicholas Brites - Nicolas Machado");
        panQuiz.add(lblParticipantes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblTituloQuiz.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblTituloQuiz.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloQuiz.setText("Clique no botão para prosseguir e iniciar o Quiz!");
        panQuiz.add(lblTituloQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 1280, -1));

        btnQuiz.setBackground(new java.awt.Color(243, 243, 243));
        btnQuiz.setFont(new java.awt.Font("Bookman Old Style", 1, 60)); // NOI18N
        btnQuiz.setForeground(new java.awt.Color(102, 0, 0));
        btnQuiz.setText("COMEÇAR");
        btnQuiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 23, 23), 5));
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });
        panQuiz.add(btnQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 600, 140));

        lblBackgroundQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exposicao-background.png"))); // NOI18N
        panQuiz.add(lblBackgroundQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tdpMenu.addTab("QUIZ", panQuiz);

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
                .addGap(16, 16, 16)
                .addComponent(tdpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
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

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        // fecha a janela do frmExposicao que é puramente apenas o visual, para a leitura do conteúdo, e assim gerar a tela do frmQuiz
        dispose();
        frmQuiz frmQ = new frmQuiz(null, true);
        frmQ.setVisible(true);
    }//GEN-LAST:event_btnQuizActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmExposicao dialog = new frmExposicao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAPS;
    private javax.swing.JLabel lblAPS1;
    private javax.swing.JLabel lblAPS2;
    private javax.swing.JLabel lblAPS3;
    private javax.swing.JLabel lblAPS4;
    private javax.swing.JLabel lblAPS5;
    private javax.swing.JLabel lblAlturaPerseverance;
    private javax.swing.JLabel lblAlturaSoujoner;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackgroundCuriosity;
    private javax.swing.JLabel lblBackgroundPerseverance;
    private javax.swing.JLabel lblBackgroundQuiz;
    private javax.swing.JLabel lblBackgroundSoujoner;
    private javax.swing.JLabel lblBackgroundSpiritOpportunity;
    private javax.swing.JLabel lblComprimentoPerseverance;
    private javax.swing.JLabel lblComprimentoSoujoner;
    private javax.swing.JLabel lblCustoPerseverance;
    private javax.swing.JLabel lblCustoSoujoner;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblFrase2;
    private javax.swing.JLabel lblFrase3;
    private javax.swing.JLabel lblFraseQuiz;
    private javax.swing.JLabel lblImgCuriosity;
    private javax.swing.JLabel lblImgPerseverance;
    private javax.swing.JLabel lblImgRochaCuriosity;
    private javax.swing.JLabel lblImgSoujoner;
    private javax.swing.JLabel lblImgSpiritOpportunity;
    private javax.swing.JLabel lblLarguraPerseverance;
    private javax.swing.JLabel lblLarguraSoujoner;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblLegendaCuriosity;
    private javax.swing.JLabel lblLegendaPerseverance;
    private javax.swing.JLabel lblLegendaSpiritOpportunity;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMassaPerseverance;
    private javax.swing.JLabel lblMassaSoujoner;
    public javax.swing.JLabel lblMensagem;
    public javax.swing.JLabel lblMensagem1;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblParticipantes1;
    private javax.swing.JLabel lblParticipantes2;
    private javax.swing.JLabel lblParticipantes3;
    private javax.swing.JLabel lblParticipantes4;
    private javax.swing.JLabel lblParticipantes5;
    private javax.swing.JLabel lblTextoCuriosity1;
    private javax.swing.JLabel lblTextoCuriosity2;
    private javax.swing.JLabel lblTextoCuriosity3;
    private javax.swing.JLabel lblTextoCuriosity4;
    private javax.swing.JLabel lblTextoCuriosity5;
    private javax.swing.JLabel lblTextoPerseverance1;
    private javax.swing.JLabel lblTextoPerseverance2;
    private javax.swing.JLabel lblTextoPerseverance3;
    private javax.swing.JLabel lblTextoPerseverance4;
    private javax.swing.JLabel lblTextoPerseverance5;
    private javax.swing.JLabel lblTextoPerseverance6;
    private javax.swing.JLabel lblTextoPerseverance7;
    private javax.swing.JLabel lblTextoSoujoner1;
    private javax.swing.JLabel lblTextoSoujoner2;
    private javax.swing.JLabel lblTextoSoujoner3;
    private javax.swing.JLabel lblTextoSoujoner4;
    private javax.swing.JLabel lblTextoSoujoner5;
    private javax.swing.JLabel lblTextoSoujoner6;
    private javax.swing.JLabel lblTextoSoujoner7;
    private javax.swing.JLabel lblTextoSoujoner8;
    private javax.swing.JLabel lblTextoSpiritOpportunity1;
    private javax.swing.JLabel lblTextoSpiritOpportunity2;
    private javax.swing.JLabel lblTextoSpiritOpportunity3;
    private javax.swing.JLabel lblTextoSpiritOpportunity4;
    private javax.swing.JLabel lblTextoSpiritOpportunity5;
    private javax.swing.JLabel lblTextoSpiritOpportunity6;
    private javax.swing.JLabel lblTextoSpiritOpportunity7;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloQuiz;
    private javax.swing.JPanel panCuriosity;
    private javax.swing.JPanel panGuia;
    private javax.swing.JPanel panPerseverance;
    private javax.swing.JPanel panQuiz;
    private javax.swing.JPanel panSoujoner;
    private javax.swing.JPanel panSpiritOpportunity;
    private javax.swing.JTabbedPane tdpMenu;
    // End of variables declaration//GEN-END:variables
}
