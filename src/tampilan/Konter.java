package tampilan;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import KoneksiDB.KoneksiDB;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Konter extends javax.swing.JFrame {

DefaultTableModel model;
    public Konter() {
          initComponents();
        this.setLocationRelativeTo(null);
        tampilkan();
    }
    
private void setTableModel(){
Kd_barang.setText("");
Nama_barang.setText("");
Barcode.setText(""); 
Harga_beli.setText(""); 
Harga_jual.setText(""); 
Stok.setText("");  
model = new DefaultTableModel();    
model.addColumn("Kd_barang");
model.addColumn("Nama_barang");
model.addColumn("Barcode");
model.addColumn("Harga_beli");
model.addColumn("Harga_jua");
model.addColumn("Stok");
TabelKonter.setModel(model);
}
    
private void tampilkan() {
        setTableModel();
        Connection obj = new KoneksiDB().getConnection();
        try {
            Statement s = obj.createStatement();           
            ResultSet rs = s.executeQuery("SELECT * FROM barang");
           while(rs.next()){
               Object[] ob = new Object[6];
               ob[0] = rs.getString("KODE_BARANG");
               ob[1] = rs.getString("NAMA_BARANG");
               ob[2] = rs.getString("BARCODE");
               ob[3] = rs.getString("HARGA_BELI");
               ob[4] = rs.getString("HARGA_JUAL");
               ob[5] = rs.getString("STOCK");
              
               model.addRow(ob);
           }
           TabelKonter.setModel(model);
           s.close();
        } catch (SQLException e) {
            Logger.getLogger(Konter.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Kd_barang = new javax.swing.JTextField();
        Nama_barang = new javax.swing.JTextField();
        Barcode = new javax.swing.JTextField();
        Harga_beli = new javax.swing.JTextField();
        Harga_jual = new javax.swing.JTextField();
        Stok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelKonter = new javax.swing.JTable();
        Koneksi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Barcode");

        jLabel4.setText("Harga Beli");

        Kd_barang.setText("         ");

        Nama_barang.setText("      ");

        Barcode.setText("     ");

        Harga_beli.setText("     ");

        Harga_jual.setText("    ");

        Stok.setText("     ");

        jLabel5.setText("Harga Jual");

        jLabel6.setText("Stok Barang");

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        TabelKonter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TabelKonter);

        Koneksi.setText("Cek Koneksi");
        Koneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoneksiActionPerformed(evt);
            }
        });

        jLabel7.setText("SYARIF SODEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Stok, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(Harga_jual, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Harga_beli)
                    .addComponent(Kd_barang)
                    .addComponent(Nama_barang)
                    .addComponent(Barcode))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Koneksi)
                        .addContainerGap(218, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Kd_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tambah)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ubah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hapus)
                        .addGap(23, 23, 23)
                        .addComponent(Koneksi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(428, 428, 428))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        String valKd = Kd_barang.getText();
        String valNama = Nama_barang.getText();
        String valBarcode = Barcode.getText();
        String valHbeli = Harga_beli.getText();
        String valHjual = Harga_jual.getText();
        String valStok = Stok.getText();
        Connection objCon = new KoneksiDB().getConnection();
        try {

            String query_insert = "insert into barang values (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = objCon.prepareStatement(query_insert);

            statement.setString(1, valKd);
            statement.setString(2, valNama);
            statement.setString(3, valBarcode);
            statement.setString(4, valHbeli);
            statement.setString(5, valHjual);
            statement.setString(6, valStok);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Memasukkan Data");
            Logger.getLogger(Konter.class.getName()).log(Level.SEVERE, null, ex);
        }
        tampilkan();
    }//GEN-LAST:event_TambahActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        String valKd = Kd_barang.getText();
        String valNama = Nama_barang.getText();
        String valBarcode = Barcode.getText();
        String valHbeli = Harga_beli.getText();
        String valHjual = Harga_jual.getText();
        String valStok = Stok.getText();
        try {
            Connection objCon = new KoneksiDB().getConnection();
            String query_update = "UPDATE barang set NAMA_BARANG='" + valNama
            +"', BARCODE='" + valBarcode
            +"', HARGA_BELI='" + valHbeli
            +"', HARGA_JUAL='" + valHjual
            +"', STOCK='" + valStok
            +"' where KODE_BARANG ='" + valKd + "'";

            Statement statement = objCon.createStatement();
            statement.executeUpdate(query_update);
            statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            Logger.getLogger(Konter.class.getName()).log(Level.SEVERE, null, ex);
        }
        tampilkan();
    }//GEN-LAST:event_UbahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        String valKd = Kd_barang.getText();

        try {
            Connection objCon = new KoneksiDB().getConnection();
            String query_delete = "delete from barang where KODE_BARANG='"+valKd+"'";

            Statement s = objCon.createStatement();
            s.executeUpdate(query_delete);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(Konter.class.getName()).log(Level.SEVERE, null, ex);
        }

        tampilkan();
    }//GEN-LAST:event_HapusActionPerformed

    private void KoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoneksiActionPerformed
        try (Connection objConnection = new KoneksiDB().getConnection()){
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }//GEN-LAST:event_KoneksiActionPerformed

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
            java.util.logging.Logger.getLogger(Konter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Konter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Konter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Konter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Konter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Barcode;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Harga_beli;
    private javax.swing.JTextField Harga_jual;
    private javax.swing.JTextField Kd_barang;
    private javax.swing.JButton Koneksi;
    private javax.swing.JTextField Nama_barang;
    private javax.swing.JTextField Stok;
    private javax.swing.JTable TabelKonter;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
