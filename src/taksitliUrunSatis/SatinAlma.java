/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksitliUrunSatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony
 */
public class SatinAlma extends javax.swing.JFrame {
    DefaultListModel dlm=new DefaultListModel();
    /**
     * Creates new form SatinAlma
     */
    public SatinAlma() {
        initComponents();
        
        jPanel1.setVisible(false);
        
        lblGiris.setText("Toplam odenecek tutariniz: "+Musteri.odemeMiktari + " TL");
        cmbOdeme.addItem("");
        cmbOdeme.addItem("Nakit");
        cmbOdeme.addItem("Taksit");
        try {
            
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB","sa","as");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM SATIS WHERE MUSTERIID="+Musteri.id);
            while(rs.next()){
                dlm.addElement(rs.getInt(6)+" adet "+rs.getString(4));
                jList1.setModel(dlm);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblGiris = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbOdeme = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        taksit3 = new javax.swing.JRadioButton();
        taksit5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        lblAylikTaksit = new javax.swing.JLabel();
        Ode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        odemeYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Odeme Secenekleri");

        cmbOdeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOdemeActionPerformed(evt);
            }
        });

        jLabel3.setText("Taksit Secenekleri:");

        buttonGroup1.add(taksit3);
        taksit3.setText("3 ay");
        taksit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taksit3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(taksit5);
        taksit5.setText("5 ay");
        taksit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taksit5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Aylik Taksit Tutariniz:");

        Ode.setText("Alisverisi Tamamla");
        Ode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdeActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Alisveris Listeniz");

        odemeYap.setText("Odeme Yap");
        odemeYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(odemeYap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(odemeYap)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblAylikTaksit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(taksit5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(taksit3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ode)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOdeme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taksit3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taksit5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAylikTaksit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ode)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOdemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOdemeActionPerformed
        // TODO add your handling code here:
        if (cmbOdeme.getSelectedItem().equals(null)) {
            return;
        } else if (cmbOdeme.getSelectedItem().equals("Nakit")) {
            Musteri.odemeSekli="Nakit";
            JOptionPane.showMessageDialog(this, "Alisverisinizi tamamlayabilirsiniz.");
        } else if (cmbOdeme.getSelectedItem().equals("Taksit")) {
            Musteri.odemeSekli="Taksit";
            JOptionPane.showMessageDialog(this, "Lutfen odemek istediginiz aylik taksit turunu seciniz");
        }
    }//GEN-LAST:event_cmbOdemeActionPerformed

    private void taksit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taksit3ActionPerformed
        // TODO add your handling code here:
        if (cmbOdeme.getSelectedItem().equals("Nakit") || cmbOdeme.getSelectedItem().equals(null)) {
            return;
        } else if (cmbOdeme.getSelectedItem().equals("Taksit")) {
            Musteri.taksitSayisi=3;
            Musteri.aylikTaksit=Musteri.odemeMiktari/(double)3.0;
            lblAylikTaksit.setText(Musteri.aylikTaksit+" TL");
            
        }
    }//GEN-LAST:event_taksit3ActionPerformed

    private void OdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdeActionPerformed
        // TODO add your handling code here:
        try {
            
            if (cmbOdeme.getSelectedItem().equals("Taksit")) {
                jPanel1.setVisible(true);
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB", "sa", "as");
                Statement st = con.createStatement();
                
                String query = "SELECT MUSTERIID FROM SATIS WHERE MUSTERIID=";
                ResultSet rs = st.executeQuery(query + Musteri.id);
                if (rs.next()) {
                    ///max id bul
                    query = "SELECT MAX(ID) max_id FROM TAKSITLISATIS";
                    st = con.createStatement();

                    ResultSet idMax = st.executeQuery(query);
                    int id2 = 0;
                    if (idMax.next()) {
                        id2 = idMax.getInt("max_id");
                    }
                    id2++;
                    //**********************
                    query="INSERT INTO TAKSITLISATIS (ID,MUSTERIID,TOPLAMTUTAR,TAKSITSAYISI,AYLIKTAKSIT) VALUES (?,?,?,?,?)";
                    PreparedStatement stm=con.prepareStatement(query);
                    stm.setInt(1, id2);
                    stm.setInt(2, Musteri.id);
                    stm.setDouble(3, Musteri.odemeMiktari);
                    stm.setInt(4, Musteri.taksitSayisi);
                    stm.setDouble(5, Musteri.aylikTaksit);
                    stm.executeUpdate();
                    
                    
                }
            }else if(cmbOdeme.getSelectedItem().equals("Nakit")){
                Connection connect=DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB","sa","as");
                Statement state =connect.createStatement();
                String q="SELECT MUSTERIID FROM SATIS WHERE MUSTERIID=";
                ResultSet result=state.executeQuery(q+Musteri.id);
                while(result.next()){
                    q="SELECT MAX(ID) max_id FROM TAKSITLISATIS";
                    state=connect.createStatement();
                    ResultSet idMax2 = state.executeQuery(q);
                    int id3 = 0;
                    if (idMax2.next()) {
                        id3 = idMax2.getInt("max_id");
                    }
                    id3++;
                    //**********************
                    q="INSERT INTO NAKITSATIS (ID,MUSTERIID,TOPLAMTUTAR) VALUES (?,?,?)";
                    PreparedStatement prst=connect.prepareStatement(q);
                    prst.setInt(1, id3);
                    prst.setInt(2, Musteri.id);
                    prst.setDouble(3, Musteri.odemeMiktari);
                    prst.executeUpdate();
                }
                JOptionPane.showMessageDialog(this, "Odemeniz tamamlanmistir.");
                this.dispose();
            }else if(cmbOdeme.getSelectedItem().toString()==""){
                        JOptionPane.showMessageDialog(this, "Lutfen odeme turunu seciniz.");
                        return;
                        }
                     } catch (Exception e) {
        }
    }//GEN-LAST:event_OdeActionPerformed

    private void taksit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taksit5ActionPerformed
        // TODO add your handling code here:
        if (cmbOdeme.getSelectedItem().equals("Nakit") || cmbOdeme.getSelectedItem().equals(null)) {
            return;
        } else if (cmbOdeme.getSelectedItem().equals("Taksit")) {
            Musteri.taksitSayisi=5;
            Musteri.aylikTaksit=Musteri.odemeMiktari/(double)5.0;
            lblAylikTaksit.setText(Musteri.aylikTaksit+" TL");
        }
    }//GEN-LAST:event_taksit5ActionPerformed

    private void odemeYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeYapActionPerformed
        // TODO add your handling code here:
        Odeme od=new Odeme();
        od.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_odemeYapActionPerformed

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
            java.util.logging.Logger.getLogger(SatinAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SatinAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SatinAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SatinAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatinAlma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbOdeme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAylikTaksit;
    private javax.swing.JLabel lblGiris;
    private javax.swing.JButton odemeYap;
    private javax.swing.JRadioButton taksit3;
    private javax.swing.JRadioButton taksit5;
    // End of variables declaration//GEN-END:variables
}
