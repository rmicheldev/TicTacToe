package TicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MainFrame extends javax.swing.JFrame implements ActionListener {
    ImageIcon iconX = new ImageIcon(getClass().getResource("x.png"));
    ImageIcon iconO = new ImageIcon(getClass().getResource("o.png"));
    char vetor[][];
    
     
    public MainFrame( char vetor[][]) {
        initComponents();
        this.vetor = vetor;
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);
        jButton8.addActionListener(this);
        jButton9.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("# TicTacToe");
        setBackground(new java.awt.Color(255, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 430));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 119, 110));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 0, 119, 110));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 0, 119, 110));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 119, 110));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 110, 119, 110));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 110, 119, 110));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 119, 110));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 220, 119, 110));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setPreferredSize(new java.awt.Dimension(49, 40));
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 220, 119, 110));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel3.add(jPanel2, gridBagConstraints);

        jButton11.setBackground(new java.awt.Color(153, 153, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("restart");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel3.add(jButton11, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(389, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        startGame();
        
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        int position = 0;
        boolean hummanPlay = false;

        if(e.getSource() == jButton1){
            position = 1;
        }else if(e.getSource() == jButton2){
            position = 2;
        }else if(e.getSource() == jButton3){
            position = 3;
        }else if(e.getSource() == jButton4){
            position = 4;
        }else if(e.getSource() == jButton5){
            position = 5;
        }else if(e.getSource() == jButton6){
            position = 6;
        }else if(e.getSource() == jButton7){
            position = 7;
        }else if(e.getSource() == jButton8){
            position = 8;
        }else if(e.getSource() == jButton9){
            position = 9;
        }

        switch(position){
            case 1:
                if(vetor[0][0]=='V'){
                    vetor[0][0]='H';
                    jButton1.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 2:
                if(vetor[0][1]=='V'){
                    vetor[0][1]='H';
                    jButton2.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 3:
                if(vetor[0][2]=='V'){
                    vetor[0][2]='H';
                    jButton3.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 4:
                if(vetor[1][0]=='V'){
                    vetor[1][0]='H';
                    jButton4.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 5:
                if(vetor[1][1]=='V'){
                    vetor[1][1]='H';
                    jButton5.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 6:
                if(vetor[1][2]=='V'){
                    vetor[1][2]='H';
                    jButton6.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 7:
                if(vetor[2][0]=='V'){
                    vetor[2][0]='H';
                    jButton7.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 8:
                if(vetor[2][1]=='V'){
                    vetor[2][1]='H';
                    jButton8.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
            case 9:
                if(vetor[2][2]=='V'){
                    vetor[2][2]='H';
                    jButton9.setIcon(iconX);
                    hummanPlay = true;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "this place is busy");
                }
                break;
        }

        if(hummanPlay){
            if(!cpuPlay()){
                JOptionPane.showMessageDialog(rootPane, "We don't have more possibilities");
            }

            if(checkWinner() || checkTie()){
                endGame();
            }
            PrintTerminal();
        }
    }
    
    
    
    public void startGame(){
        jButton1.setIcon(null);
        jButton2.setIcon(null);
        jButton3.setIcon(null);
        jButton4.setIcon(null);
        jButton5.setIcon(null);
        jButton6.setIcon(null);
        jButton7.setIcon(null);
        jButton8.setIcon(null);
        jButton9.setIcon(null);
        
        for (int x=0; x < 3 ; x++){
            for (int y=0;y<3;y++){
                vetor[x][y] = 'V';
            }
        }
        int escolha = JOptionPane.showConfirmDialog(null, "would you like to start?");
        if (escolha == 1){
            cpuPlay();
        }
    }

    public boolean cpuPlay() {
        NextMove nMove = new NextMove();
        int movimento_m = nMove.generate(vetor);
        boolean jogou = false;
        switch (movimento_m) {
            case 1:
                vetor[0][0] = 'M';
                jButton1.setIcon(iconO);
                jogou = true;
                break;
            case 2:
                vetor[0][1] = 'M';
                jButton2.setIcon(iconO);
                jogou = true;
                break;
            case 3:
                vetor[0][2] = 'M';
                jButton3.setIcon(iconO);
                jogou = true;
                break;
            case 4:
                vetor[1][0] = 'M';
                jButton4.setIcon(iconO);
                jogou = true;
                break;
            case 5:
                vetor[1][1] = 'M';
                jButton5.setIcon(iconO);
                jogou = true;
                break;
            case 6:
                vetor[1][2] = 'M';
                jButton6.setIcon(iconO);
                jogou = true;
                break;
            case 7:
                vetor[2][0] = 'M';
                jButton7.setIcon(iconO);
                jogou = true;
                break;
            case 8:
                vetor[2][1] = 'M';
                jButton8.setIcon(iconO);
                jogou = true;
                break;
            case 9:
                vetor[2][2] = 'M';
                jButton9.setIcon(iconO);
                jogou = true;
                break;
        }
        //_____________________________________________________________________________
        return jogou;
    }

    public boolean checkTie() {
        int contador = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (vetor[x][y] == 'V') {
                    contador++;
                }
            }
        }
        if (contador <= 0) {
            JOptionPane.showMessageDialog(rootPane, "tied game");
            return true;
        } else {
            return false;
        }
    }

    public boolean checkWinner() {
        //first diagonal
        if (vetor[0][0] != 'V' && vetor[0][0] == vetor[1][1] && vetor[0][0] == vetor[2][2]) {
            if( vetor[0][0] == 'H' ){
                JOptionPane.showMessageDialog(rootPane, "You win");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You lost");
            }
            return true;
        //second diagonal
        } else if (vetor[0][2] != 'V' && vetor[0][2] == vetor[1][1] && vetor[0][2] == vetor[2][0]) {
            if( vetor[0][2] == 'H' ){
                JOptionPane.showMessageDialog(rootPane, "You win");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You lost");
            }
            return true;
        }
            
        //check line
        for (int x = 0; x < 3; x++) {
            if (vetor[x][0] != 'V' && vetor[x][0] == vetor[x][1] && vetor[x][0] == vetor[x][2]) {
                if( vetor[x][0] == 'H' ){
                    JOptionPane.showMessageDialog(rootPane, "You win");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "You lost");
                }
                return true;
            }
        }

        //check column
        for (int y = 0; y < 3; y++) {
            if (vetor[0][y] != 'V' && vetor[0][y] == vetor[1][y] && vetor[0][y] == vetor[2][y]) {
                if( vetor[0][y] == 'H' ){
                    JOptionPane.showMessageDialog(rootPane, "You win");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "You lost");
                }
                return true;
            }
        }
        return false;
    }

    public void PrintTerminal() {
        System.out.println("\n\n\n"
                + vetor[0][0] + " " + vetor[0][1] + " " + vetor[0][2] + "\n"
                + vetor[1][0] + " " + vetor[1][1] + " " + vetor[1][2] + "\n"
                + vetor[2][0] + " " + vetor[2][1] + " " + vetor[2][2]);
    }
    public void endGame(){
        System.out.println("cabou");
    }
}
