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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class Mainpage extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage
     */
    List<Urun> urunler;
    ArrayList<Integer> urunIdler = new ArrayList();
    ArrayList<Integer> fiyatlar = new ArrayList();
    DefaultTableModel dtm = new DefaultTableModel();

    public Mainpage() {
        initComponents();
        try {
            dtm.setColumnIdentifiers(new Object[]{"ID", "URUN ID", "MUSTERI ID", "URUN ADI", "TUTAR", "ADET"});
            jTable3.setModel(dtm);
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB", "sa", "as");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM URUN");
            while (rs.next()) {
                String urunadi = rs.getString("URUNADI");
                urunIdler.add(rs.getInt("ID"));
                fiyatlar.add(rs.getInt("FIYAT"));
                cmb_urunler.addItem(urunadi);
            }
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM MUSTERI");
            while (rst.next()) {
                if (Musteri.id == rst.getInt("ID")) {
                    String musteriadi = rst.getString("ADI");
                    String musterisoyadi = rst.getString("SOYADI");
                    lblgiris.setText("Hoşgeldiniz, " + musteriadi + " " + musterisoyadi);
                }
            }
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProjeBP2PU");
            EntityManager em=emf.createEntityManager();
            Query q=em.createQuery("delete from Satis k");
            em.getTransaction().begin();
            q.executeUpdate();
            em.getTransaction().commit();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        toplamTutarGoster = new javax.swing.JButton();
        lblToplamTutar = new javax.swing.JLabel();
        SatinAl = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Ekle = new javax.swing.JButton();
        txtAdet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        DetaylariGoster = new javax.swing.JButton();
        cmb_urunler = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblgiris = new javax.swing.JLabel();
        odemeYap = new javax.swing.JButton();
        Sil = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toplamTutarGoster.setText("Toplam Odenecek Tutari Goster");
        toplamTutarGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamTutarGosterActionPerformed(evt);
            }
        });

        SatinAl.setText("Satin Al");
        SatinAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatinAlActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        Ekle.setText("Sepete Ekle");
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });

        jLabel2.setText("ADET");

        jScrollPane1.setViewportView(jList1);

        DetaylariGoster.setText("Detaylari Goster");
        DetaylariGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetaylariGosterActionPerformed(evt);
            }
        });

        cmb_urunler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_urunlerActionPerformed(evt);
            }
        });

        jLabel1.setText("URUNLER");

        odemeYap.setText("Odemelerim");
        odemeYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeYapActionPerformed(evt);
            }
        });

        Sil.setText("Sil");
        Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toplamTutarGoster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblToplamTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SatinAl)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Ekle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sil))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(odemeYap)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_urunler, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(DetaylariGoster)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(odemeYap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_urunler, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetaylariGoster))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toplamTutarGoster)
                            .addComponent(lblToplamTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SatinAl))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ekle)
                            .addComponent(Sil))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SatinAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatinAlActionPerformed
        // TODO add your handling code here:
        if(Musteri.odemeMiktari==0){
            JOptionPane.showMessageDialog(this, "Satin almadan once sepete en az bir tane urun eklemelisiniz.");
            return;
        }else{
            SatinAlma stnal = new SatinAlma();
            stnal.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_SatinAlActionPerformed

    private void toplamTutarGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamTutarGosterActionPerformed
        // TODO add your handling code here:
        lblToplamTutar.setText(Musteri.odemeMiktari+" TL");
        int odeme=(int) Musteri.odemeMiktari;
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB","sa","as");
            String query="INSERT INTO MUSTERI (ID,KULLANICIADI,ADI,SOYADI,SIFRE,ODEMELER) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(6,odeme);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_toplamTutarGosterActionPerformed

    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
        // TODO add your handling code here:
        try {
            if (txtAdet.getText() == null || txtAdet.getText().isEmpty() || Integer.parseInt(txtAdet.getText())==0 || Integer.parseInt(txtAdet.getText())<0) {
                JOptionPane.showMessageDialog(this, "Urun miktarini secmeden sepete ekleme yapamazsiniz.");
                return;
            }
            
            
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB", "sa", "as");
            Urun urun = new Urun();
            String urunadi = cmb_urunler.getSelectedItem().toString();
            int urunid = urunIdler.get(cmb_urunler.getSelectedIndex());
            int urunfiyat = fiyatlar.get(cmb_urunler.getSelectedIndex());
            int adet = Integer.parseInt(txtAdet.getText());
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ADET FROM URUN WHERE ID=" + urunid);
            while (rs.next()) {
                if (adet > rs.getInt("ADET")) {
                    JOptionPane.showMessageDialog(this, "Depodaki urun adetinden fazla adet sayisi giremezsiniz.");
                }
            }

            Statement stm1 = con.createStatement();
            ///max id bul
            String query = "SELECT MAX(ID) max_id FROM SATIS";
            stm1 = con.createStatement();

            ResultSet idMax = stm1.executeQuery(query);
            int id2 = 0;
            if (idMax.next()) {
                id2 = idMax.getInt("max_id");
            }
            id2++;

            //**********************
            query = "INSERT INTO SATIS (ID,URUNID,MUSTERIID,URUNADI,TUTAR,ADET) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id2);
            ps.setInt(2, urunid);
            urunfiyat = adet * urunfiyat;
            ps.setInt(3, Musteri.id);
            ps.setString(4, urunadi);
            ps.setInt(5, urunfiyat);
            ps.setInt(6, adet);
            ps.executeUpdate();

            float toplamOdemeMiktari = 0;
            dtm.addRow(new Object[]{id2, urunid, Musteri.id, urunadi, urunfiyat, adet});
//            for (int i = 0; i < jTable3.getRowCount(); i++) {
//                toplamOdemeMiktari += Float.parseFloat(dtm.getValueAt(i, 4).toString());
//            }
//            Musteri.odemeMiktari=toplamOdemeMiktari;

            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB","sa","as");
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT TUTAR FROM SATIS");
            while(r.next()){
                toplamOdemeMiktari+=r.getInt("TUTAR");
            }
            Musteri.odemeMiktari=toplamOdemeMiktari;

        } catch (SQLException ex) {
            Logger.getLogger(Mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EkleActionPerformed

    private void DetaylariGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetaylariGosterActionPerformed
        // TODO add your handling code here:
        try {
            dlm.removeAllElements();

            String urunAdi = cmb_urunler.getSelectedItem().toString();
            int id = urunIdler.get(cmb_urunler.getSelectedIndex());
            int fiyat = fiyatlar.get(cmb_urunler.getSelectedIndex());
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/URUNSATISDB", "sa", "as");
            Statement stmt = con.createStatement();
            ResultSet rlt = stmt.executeQuery("SELECT ADET FROM URUN WHERE ID=" + id);
            int adet = 0;
            while (rlt.next()) {
                adet = rlt.getInt("ADET");
            }

            dlm.addElement("Urun adi: " + urunAdi + " Fiyat: " + fiyat + " TL" + " Stok durumu: " + adet + " tane");
            jList1.setModel(dlm);
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_DetaylariGosterActionPerformed

    private void cmb_urunlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_urunlerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_urunlerActionPerformed

    private void odemeYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeYapActionPerformed
        // TODO add your handling code here:
        Odeme od =new Odeme();
        od.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_odemeYapActionPerformed

    private void SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilActionPerformed
        // TODO add your handling code here:
        try {
            if(jTable3.getSelectedRowCount()<1){
                JOptionPane.showMessageDialog(this, "Silmek istediginiz urunu secmelisiniz.");
                return;
            }
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProjeBP2PU");
            EntityManager em=emf.createEntityManager();
            Query q=em.createQuery("delete from Satis k WHERE k.id=:mId");
            //int id=Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString());
            int id=Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 1).toString());
            q.setParameter("mId", id); 
           
            
            em.getTransaction().begin();
            q.executeUpdate();
            em.getTransaction().commit();
            Musteri.odemeMiktari=Musteri.odemeMiktari-Double.parseDouble(jTable3.getValueAt(jTable3.getSelectedRow(), 4).toString());
            dtm.removeRow(jTable3.getSelectedRow());
        } catch (NumberFormatException e) {
            System.out.println("jfsdkjf");
        }
    }//GEN-LAST:event_SilActionPerformed
    DefaultListModel dlm = new DefaultListModel();

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DetaylariGoster;
    private javax.swing.JButton Ekle;
    private javax.swing.JButton SatinAl;
    private javax.swing.JButton Sil;
    private javax.swing.JComboBox<String> cmb_urunler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblToplamTutar;
    private javax.swing.JLabel lblgiris;
    private javax.swing.JButton odemeYap;
    private javax.swing.JButton toplamTutarGoster;
    private javax.swing.JTextField txtAdet;
    // End of variables declaration//GEN-END:variables
}
