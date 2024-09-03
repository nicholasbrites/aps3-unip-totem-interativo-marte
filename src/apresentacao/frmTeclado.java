package apresentacao;

public class frmTeclado extends javax.swing.JDialog {
    String texto = ""; // define o atributo interno que vai assumir o texto escrito como vazio
    // define os atributos internos referentes à acentuação como vazios
    String agudoTemp = "";
    String tilTemp = "";
    String circunflexoTemp = "";

    public frmTeclado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfTexto = new javax.swing.JTextField();
        btnQ = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnTil = new javax.swing.JButton();
        btnAgudo = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnEspaco = new javax.swing.JButton();
        btnHifen = new javax.swing.JButton();
        btnCircunflexo = new javax.swing.JButton();
        btnÇ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teclado virtual");

        txfTexto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        btnQ.setBackground(new java.awt.Color(224, 224, 224));
        btnQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQ.setText("Q");
        btnQ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnW.setBackground(new java.awt.Color(224, 224, 224));
        btnW.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnW.setText("W");
        btnW.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(224, 224, 224));
        btnE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnE.setText("E");
        btnE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnR.setBackground(new java.awt.Color(224, 224, 224));
        btnR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnR.setText("R");
        btnR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnT.setBackground(new java.awt.Color(224, 224, 224));
        btnT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnT.setText("T");
        btnT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnY.setBackground(new java.awt.Color(224, 224, 224));
        btnY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnY.setText("Y");
        btnY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnU.setBackground(new java.awt.Color(224, 224, 224));
        btnU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnU.setText("U");
        btnU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnI.setBackground(new java.awt.Color(224, 224, 224));
        btnI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnI.setText("I");
        btnI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnO.setBackground(new java.awt.Color(224, 224, 224));
        btnO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnO.setText("O");
        btnO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnP.setBackground(new java.awt.Color(224, 224, 224));
        btnP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnP.setText("P");
        btnP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnA.setBackground(new java.awt.Color(224, 224, 224));
        btnA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnA.setText("A");
        btnA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnS.setBackground(new java.awt.Color(224, 224, 224));
        btnS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnS.setText("S");
        btnS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnD.setBackground(new java.awt.Color(224, 224, 224));
        btnD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnD.setText("D");
        btnD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnF.setBackground(new java.awt.Color(224, 224, 224));
        btnF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnF.setText("F");
        btnF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setBackground(new java.awt.Color(224, 224, 224));
        btnG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnG.setText("G");
        btnG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setBackground(new java.awt.Color(224, 224, 224));
        btnH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnH.setText("H");
        btnH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnJ.setBackground(new java.awt.Color(224, 224, 224));
        btnJ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnJ.setText("J");
        btnJ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnK.setBackground(new java.awt.Color(224, 224, 224));
        btnK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnK.setText("K");
        btnK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnL.setBackground(new java.awt.Color(224, 224, 224));
        btnL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnL.setText("L");
        btnL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnTil.setBackground(new java.awt.Color(224, 224, 224));
        btnTil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTil.setText("~");
        btnTil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTilActionPerformed(evt);
            }
        });

        btnAgudo.setBackground(new java.awt.Color(224, 224, 224));
        btnAgudo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgudo.setText("´");
        btnAgudo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgudoActionPerformed(evt);
            }
        });

        btnM.setBackground(new java.awt.Color(224, 224, 224));
        btnM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnM.setText("M");
        btnM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnN.setBackground(new java.awt.Color(224, 224, 224));
        btnN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnN.setText("N");
        btnN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnB.setBackground(new java.awt.Color(224, 224, 224));
        btnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnB.setText("B");
        btnB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnV.setBackground(new java.awt.Color(224, 224, 224));
        btnV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnV.setText("V");
        btnV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(224, 224, 224));
        btnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnX.setBackground(new java.awt.Color(224, 224, 224));
        btnX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnX.setText("X");
        btnX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnZ.setBackground(new java.awt.Color(224, 224, 224));
        btnZ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnZ.setText("Z");
        btnZ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        btnPonto.setBackground(new java.awt.Color(224, 224, 224));
        btnPonto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnApagar.setBackground(new java.awt.Color(224, 224, 224));
        btnApagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApagar.setText("apagar");
        btnApagar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(224, 224, 224));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnter.setText("enter");
        btnEnter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnEspaco.setBackground(new java.awt.Color(224, 224, 224));
        btnEspaco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEspaco.setText("espaço");
        btnEspaco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEspaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspacoActionPerformed(evt);
            }
        });

        btnHifen.setBackground(new java.awt.Color(224, 224, 224));
        btnHifen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHifen.setText("-");
        btnHifen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHifen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHifenActionPerformed(evt);
            }
        });

        btnCircunflexo.setBackground(new java.awt.Color(224, 224, 224));
        btnCircunflexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCircunflexo.setText("^");
        btnCircunflexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCircunflexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircunflexoActionPerformed(evt);
            }
        });

        btnÇ.setBackground(new java.awt.Color(224, 224, 224));
        btnÇ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnÇ.setText("Ç");
        btnÇ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnÇ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÇActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnS, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(btnW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHifen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnE, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnR, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnT, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnY, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnU, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEspaco, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCircunflexo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnI, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnO, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(btnL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnÇ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txfTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnL, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(btnÇ, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(btnK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnM, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApagar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(btnHifen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEspaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCircunflexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgudo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(btnTil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // A letra "A" confere se os atributos de acentuação está vazio, e se tiver vazio ele digita a letra A comum
        // Mas qualquer acentuação que tiver seu atributo diferente de vazio, ele digitará a letra A com o acento
        if(agudoTemp.equals("´"))
        {
            txfTexto.setText(txfTexto.getText()+"Á");
            agudoTemp = "";
        }
        else
            if(tilTemp.equals("~"))
            {
                txfTexto.setText(txfTexto.getText()+"Ã");
                tilTemp = "";
            }
            else
            {
                if(circunflexoTemp.equals("^"))
                {
                    txfTexto.setText(txfTexto.getText()+"Â");
                    circunflexoTemp = "";
                }
                else
                {
                    txfTexto.setText(txfTexto.getText()+"A");
                }
            }
    }//GEN-LAST:event_btnAActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        txfTexto.setText(txfTexto.getText()+"W");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "W"
    }//GEN-LAST:event_btnWActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        String textoAtual = txfTexto.getText();
        if(!textoAtual.isEmpty())
        textoAtual = textoAtual.substring(0, textoAtual.length() - 1);
        txfTexto.setText(textoAtual);
        // cria um atributo interno para que textoAtual seja o mesmo que o texf field, e ele usa o substring pra realizar um recorte do primeiro caractere até o penúltimo
        // mas caso seja vazio então ele não apaga nada, e por fim volta a definir o texf field como o textoAtual
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnTilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTilActionPerformed
        // define o atributo do acento til diferente de vazio, e os demais acentos como vazio, para evitar de ter dois acentos com diferentes de vazio ao mesmo tempo
        tilTemp = "~";
        agudoTemp = "";
        circunflexoTemp = "";
    }//GEN-LAST:event_btnTilActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        txfTexto.setText(txfTexto.getText()+".");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona um ponto
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        txfTexto.setText(txfTexto.getText()+"Z");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "Z"
    }//GEN-LAST:event_btnZActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //define o atributo texto como o texto digitado no text field
        this.texto = txfTexto.getText();
        dispose();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnEspacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspacoActionPerformed
        txfTexto.setText(txfTexto.getText()+" ");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona um espaço
    }//GEN-LAST:event_btnEspacoActionPerformed

    private void btnAgudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgudoActionPerformed
        // define o atributo do acento agudo diferente de vazio, e os demais acentos como vazio, para evitar de ter dois acentos com diferentes de vazio ao mesmo tempo
        agudoTemp = "´";
        tilTemp = "";
        circunflexoTemp = "";
    }//GEN-LAST:event_btnAgudoActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        txfTexto.setText(txfTexto.getText()+"M");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "M"
    }//GEN-LAST:event_btnMActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        txfTexto.setText(txfTexto.getText()+"N");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "N"
    }//GEN-LAST:event_btnNActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        txfTexto.setText(txfTexto.getText()+"B");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "B"
    }//GEN-LAST:event_btnBActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        txfTexto.setText(txfTexto.getText()+"V");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "V"
    }//GEN-LAST:event_btnVActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txfTexto.setText(txfTexto.getText()+"C");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "C"
    }//GEN-LAST:event_btnCActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        txfTexto.setText(txfTexto.getText()+"X");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "X"
    }//GEN-LAST:event_btnXActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // A letra "E" confere se os atributos de acentuação está vazio, e se tiver vazio ele digita a letra E comum
        // Mas qualquer acentuação que tiver seu atributo diferente de vazio, ele digitará a letra E com o acento
        if(agudoTemp.equals("´"))
        {
            txfTexto.setText(txfTexto.getText()+"É");
            agudoTemp = "";
        }
        else
        {
            if(circunflexoTemp.equals("^"))
                {
                    txfTexto.setText(txfTexto.getText()+"Ê");
                    circunflexoTemp = "";
                }
                else
                {
                    txfTexto.setText(txfTexto.getText()+"E");
                }
        }
    }//GEN-LAST:event_btnEActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        txfTexto.setText(txfTexto.getText()+"R");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "R"
    }//GEN-LAST:event_btnRActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        txfTexto.setText(txfTexto.getText()+"T");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "T"
    }//GEN-LAST:event_btnTActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        txfTexto.setText(txfTexto.getText()+"Y");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "Y"
    }//GEN-LAST:event_btnYActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        // A letra "U" confere se os atributos de acentuação está vazio, e se tiver vazio ele digita a letra U comum
        // Mas qualquer acentuação que tiver seu atributo diferente de vazio, ele digitará a letra U com o acento
        if(agudoTemp.equals("´"))
        {
            txfTexto.setText(txfTexto.getText()+"Ú");
            agudoTemp = "";
        }
        else
        {
            txfTexto.setText(txfTexto.getText()+"U");
        }
    }//GEN-LAST:event_btnUActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        // A letra "I" confere se os atributos de acentuação está vazio, e se tiver vazio ele digita a letra I comum
        // Mas qualquer acentuação que tiver seu atributo diferente de vazio, ele digitará a letra I com o acento
        if(agudoTemp.equals("´"))
        {
            txfTexto.setText(txfTexto.getText()+"Í");
            agudoTemp = "";
        }
        else
        {
            txfTexto.setText(txfTexto.getText()+"I");
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        // A letra "O" confere se os atributos de acentuação está vazio, e se tiver vazio ele digita a letra O comum
        // Mas qualquer acentuação que tiver seu atributo diferente de vazio, ele digitará a letra O com o acento
        if(agudoTemp.equals("´"))
        {
            txfTexto.setText(txfTexto.getText()+"Ó");
            agudoTemp = "";
        }
        else
            if(tilTemp.equals("~"))
            {
                txfTexto.setText(txfTexto.getText()+"Õ");
                tilTemp = "";
            }
            else
            {
                if(circunflexoTemp.equals("^"))
                {
                    txfTexto.setText(txfTexto.getText()+"Ô");
                    circunflexoTemp = "";
                }
                else
                    txfTexto.setText(txfTexto.getText()+"O");
                }
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        txfTexto.setText(txfTexto.getText()+"P");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "P"
    }//GEN-LAST:event_btnPActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        txfTexto.setText(txfTexto.getText()+"S");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "S"
    }//GEN-LAST:event_btnSActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        txfTexto.setText(txfTexto.getText()+"D");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "D"
    }//GEN-LAST:event_btnDActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        txfTexto.setText(txfTexto.getText()+"F");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "F"
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        txfTexto.setText(txfTexto.getText()+"G");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "G"
    }//GEN-LAST:event_btnGActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        txfTexto.setText(txfTexto.getText()+"J");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "J"
    }//GEN-LAST:event_btnJActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        txfTexto.setText(txfTexto.getText()+"H");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "H"
    }//GEN-LAST:event_btnHActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        txfTexto.setText(txfTexto.getText()+"K");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "K"
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        txfTexto.setText(txfTexto.getText()+"L");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "L"
    }//GEN-LAST:event_btnLActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        txfTexto.setText(txfTexto.getText()+"Q");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "Q"
    }//GEN-LAST:event_btnQActionPerformed

    private void btnHifenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHifenActionPerformed
        txfTexto.setText(txfTexto.getText()+"-");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona um hífen
    }//GEN-LAST:event_btnHifenActionPerformed

    private void btnCircunflexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircunflexoActionPerformed
        // define o atributo do acento circunflexo diferente de vazio, e os demais acentos como vazio, para evitar de ter dois acentos com diferentes de vazio ao mesmo tempo
        circunflexoTemp = "^";
        tilTemp = "";
        agudoTemp = "";
    }//GEN-LAST:event_btnCircunflexoActionPerformed

    private void btnÇActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÇActionPerformed
        txfTexto.setText(txfTexto.getText()+"Ç");
        // pega o text field do texto, e assume ele como ele mesmo e adiciona a letra "Ç"
    }//GEN-LAST:event_btnÇActionPerformed
 
    // retornará o atributo texto para que na tela frmCadastro seja definido o que foi digitado pelo usuário
    @Override
    public String toString()
    {
        return texto;
    }
  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmTeclado dialog = new frmTeclado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAgudo;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCircunflexo;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEspaco;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnHifen;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnTil;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnÇ;
    private javax.swing.JTextField txfTexto;
    // End of variables declaration//GEN-END:variables

    private void enviarTexto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
