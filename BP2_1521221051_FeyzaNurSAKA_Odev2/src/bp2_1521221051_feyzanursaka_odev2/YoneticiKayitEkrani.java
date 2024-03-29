/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1521221051_feyzanursaka_odev2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.swing.JOptionPane;

/**
 *
 * @author Feyza Nur Saka
 */
public class YoneticiKayitEkrani extends javax.swing.JFrame {

    /**
     * Creates new form YoneticiKayitEkrani
     */
    public YoneticiKayitEkrani() {
        initComponents();
        jBtn_kaydol1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox_onay1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_soyadi = new javax.swing.JTextField();
        jtxt_adi = new javax.swing.JTextField();
        jpassword_sifre = new javax.swing.JPasswordField();
        jBtn_kaydol1 = new javax.swing.JButton();
        jbtn_vazgec = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxt_kullaniciadi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlbluyari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(482, 492));
        setPreferredSize(new java.awt.Dimension(482, 492));

        jCheckBox_onay1.setText("Yukarıdaki bilgileri onaylıyorum.");
        jCheckBox_onay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_onay1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Adı               :");

        jLabel8.setText("Soyadı         :");

        jLabel10.setText("Şifre             :");

        jBtn_kaydol1.setText("Kaydol");
        jBtn_kaydol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_kaydol1ActionPerformed(evt);
            }
        });

        jbtn_vazgec.setText("Vazgeç");
        jbtn_vazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_vazgecActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel6.setText("Yönetici Kayıt");

        jLabel1.setText("Kullanıcı Adı  :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbluyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_vazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_onay1)
                            .addComponent(jBtn_kaydol1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpassword_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlbluyari, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtxt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxt_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jpassword_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_onay1)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_kaydol1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_vazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_kaydol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_kaydol1ActionPerformed
 BufferedReader br =null;
      
           
     try {
         br = new BufferedReader(new FileReader("c:\\dosyalar\\dosyaadresleri.txt"));
     } catch (FileNotFoundException ex) {
         Logger.getLogger(YoneticiKayitEkrani.class.getName()).log(Level.SEVERE, null, ex);
     }
        
         String a=null;
         ArrayList<String> stringler = new ArrayList<>();
     try {
         while((a=br.readLine())!=null){
             stringler.add(a);
         }
     } catch (IOException ex) {
         Logger.getLogger(YoneticiKayitEkrani.class.getName()).log(Level.SEVERE, null, ex);
     }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(stringler.get(0));
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT m from Yonetici m");
        List<Yonetici> yoneticiler = q.getResultList();
        int maxid = 0;

        for (Yonetici yonetici : yoneticiler) {
            if (yonetici.getYoneticiid() > maxid) {
                maxid = yonetici.getYoneticiid();
            }
        }
        boolean b = true;
        for (Yonetici yonetici : yoneticiler) {
            if (yonetici.getYoneticikullaniciadi().equals(jtxt_kullaniciadi.getText())) {
                
                b = false;
                JOptionPane.showMessageDialog(rootPane, "Böyle bir kullanıcı adı alınmış başka bir tane deneyiniz");
                temizle();
                break;
            }
            
        }
        
        if (b==true) {
            em.getTransaction().begin();
            Yonetici y = new Yonetici();
            y.setYoneticiadi(jtxt_adi.getText());
            y.setYoneticisoyadi(jtxt_soyadi.getText());
            y.setYoneticisifre(jpassword_sifre.getText());
            y.setYoneticikullaniciadi(jtxt_kullaniciadi.getText());
            y.setYoneticiid(maxid + 1);
            JOptionPane.showMessageDialog(rootPane, "Kayıt başarılı");
            em.persist(y);
            em.getTransaction().commit();
            em.close();
            emf.close();

            temizle();

        }
    }//GEN-LAST:event_jBtn_kaydol1ActionPerformed
    void temizle() {
        jtxt_kullaniciadi.setText("");
        jtxt_adi.setText("");
        jtxt_soyadi.setText("");
        jpassword_sifre.setText("");
    }
    private void jbtn_vazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_vazgecActionPerformed
        // TODO add your handling code here:
        YoneticiGirisEkrani girisEkrani = new YoneticiGirisEkrani();
        girisEkrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_vazgecActionPerformed

    private void jCheckBox_onay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_onay1ActionPerformed
        // TODO add your handling code here:

        if (jCheckBox_onay1.isSelected()) {
            if (jtxt_adi.getText().length() == 0 || jtxt_soyadi.getText().length() == 0 || jpassword_sifre.getPassword().length == 0 || jtxt_kullaniciadi.getText().length() == 0) {
                jBtn_kaydol1.setEnabled(false);
                JOptionPane.showMessageDialog(rootPane, "Bilgilerinizi eksiksiz doldurun!");
                jCheckBox_onay1.setSelected(false);
            } else {
                jBtn_kaydol1.setEnabled(true);
            }
        } else {
            jBtn_kaydol1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox_onay1ActionPerformed

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
            java.util.logging.Logger.getLogger(YoneticiKayitEkrani.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiKayitEkrani.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiKayitEkrani.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiKayitEkrani.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiKayitEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_kaydol1;
    private javax.swing.JCheckBox jCheckBox_onay1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbtn_vazgec;
    private javax.swing.JLabel jlbluyari;
    private javax.swing.JPasswordField jpassword_sifre;
    private javax.swing.JTextField jtxt_adi;
    private javax.swing.JTextField jtxt_kullaniciadi;
    private javax.swing.JTextField jtxt_soyadi;
    // End of variables declaration//GEN-END:variables
}
