/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import Connection.LoadData;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.crypto.interfaces.DHKey;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CT_PhieuDat;
import model.DongHo;
import model.PhieuDat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class GiaoDienPhieuDat extends javax.swing.JFrame {

    /**
     * Creates new form PhieuDat
     */
    private DefaultTableModel myTable ;
    private DefaultTableModel myTable1;
    public GiaoDienPhieuDat() {
        initComponents();
        myTable  = (DefaultTableModel) tblPhieuDat.getModel();
        myTable1 = (DefaultTableModel) tblCT_PhieuDat.getModel();
        showData();
        tblPhieuDat.setDefaultEditor(Object.class, null);;
        tblPhieuDat.setSelectionMode(0);
        showData1();
        tblCT_PhieuDat.setDefaultEditor(Object.class, null);
        tblCT_PhieuDat.setSelectionMode(0);
    }
    private void showData(){
        new LoadData();
        myTable .setRowCount(0);
        int dem = 0;
        
        for (PhieuDat pd : Controller.controller.arrayListPhieuDat) {
            dem++;
           myTable .addRow(new Object[]{dem,pd.getMaPD(),pd.getMaKH(),pd.getHoKH(),pd.getTenKH(),pd.getDcKH(),pd.getSdtKH(),pd.getNgayDat(),pd.getNgayGiao()});
           
    }      
     
}
      private void showData1(){
          new LoadData();
          int dem1  = 0;
        myTable1.setRowCount(0);
        for(CT_PhieuDat ctpd : Controller.controller.arrayListCT_PhieuDat){
            dem1++;
            myTable1.addRow(new Object[]{dem1,ctpd.getMaPD(),ctpd.getMaDH(),ctpd.getSoLuong(),ctpd.getGia()});
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCT_PhieuDat = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMPD = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieuDat = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMPD_CT = new javax.swing.JTextField();
        txtMDH = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThemCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        dateGiao = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        dateDat = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        baoloi = new javax.swing.JLabel();
        sdfs = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHI???U ?????T");

        tblCT_PhieuDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? phi???u ?????t ", "M?? ?????ng h???", "S??? l?????ng", "????n gi??"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCT_PhieuDat.setToolTipText("");
        tblCT_PhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCT_PhieuDatMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblCT_PhieuDat);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("M?? phi???u ?????t:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("H??? KH:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("T??n KH:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("?????a ch??? KH:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ng??y giao:");

        txtMPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMPDActionPerformed(evt);
            }
        });

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CHI TI???T PHI???U ?????T");

        tblPhieuDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "M?? phi???u ?????t ", "M?? kh??ch h??ng", "H??? KH", "T??n KH", "?????a ch??? KH", "SDT", "Ng??y ?????t", "Ng??y giao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPhieuDatMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhieuDat);

        jLabel8.setText("M?? phi???u ?????t:");

        jLabel9.setText("M?? ?????ng h???:");

        jLabel10.setText("S??? l?????ng:");

        jLabel11.setText("????n gi??:");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button-Add-icon.png"))); // NOI18N
        btnThem.setText("Th??m ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button-Close-icon.png"))); // NOI18N
        btnXoa.setText("X??a ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pen-Red-icon.png"))); // NOI18N
        btnSua.setText("S???a");

        btnThemCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button-Add-icon.png"))); // NOI18N
        btnThemCT.setText("Th??m ");
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
            }
        });

        btnXoaCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button-Close-icon.png"))); // NOI18N
        btnXoaCT.setText("X??a ");
        btnXoaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTActionPerformed(evt);
            }
        });

        btnSuaCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pen-Red-icon.png"))); // NOI18N
        btnSuaCT.setText("S???a");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Ng??y ?????t:");

        jLabel13.setText("SDT:");

        sdfs.setText("M?? kh??ch h??ng:");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiaChi)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(btnThem)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(btnXoa)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(btnSua))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(baoloi, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(65, 65, 65)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(dateDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dateGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMPD, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sdfs)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(btnThemCT)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaCT)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSuaCT))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMDH, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtMPD_CT)
                                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(399, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sdfs)
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnXoa)
                            .addComponent(btnSua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baoloi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMPD_CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemCT)
                            .addComponent(btnXoaCT)
                            .addComponent(btnSuaCT))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMPDActionPerformed

    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
         if(txtMPD_CT.getText().equals("") || txtMDH.getText().equals("") ||txtSL.getText().equals(""))
                 baoloi.setText("Vui l??ng nh???p ?????y ????? th??ng tin chi ti???t phi???u ?????t!");
        else{
            int row = tblCT_PhieuDat.getSelectedRow();
            int SL = Integer.parseInt(txtSL.getText());
            BigDecimal Gia,gia1 ;
            for(CT_PhieuDat ct : Controller.controller.arrayListCT_PhieuDat){
                 BigDecimal SLa = new BigDecimal(SL);
                 for(DongHo dh : Controller.controller.arrayListDongHo){
                    if(dh.getMaDH().equals(txtMDH.getText())){
                     gia1 = dh.getGia();
                     Gia = gia1.multiply(SLa);
                     String G = Gia.toString();
                     txtGia.setText(G);
                 }
                }
            }
            Gia = new BigDecimal(txtGia.getText());
            CT_PhieuDat ctpd = new CT_PhieuDat(txtMPD_CT.getText(),SL, Gia, txtMDH.getText());
           if (tblCT_PhieuDat.getSelectedRow()==-1){
                for (CT_PhieuDat ctpdh : Controller.controller.arrayListCT_PhieuDat)
                    if(ctpdh.getMaPD().equals(txtMPD_CT.getText())){
                        baoloi.setText("phi???u ?????t ???? t???n t???i");
                        return;
                    }
                
                Connection.InsertData.insertCT_PhieuDat(ctpd);

                
                showData1();

                tblCT_PhieuDat.getSelectionModel().setSelectionInterval(tblCT_PhieuDat.getRowCount()-1,tblCT_PhieuDat.getRowCount()-1);

             }
            else
           {
                
                Connection.UpdateData.updateCT_PhieuDat(ctpd);
            

           }
              showData1();
              tblCT_PhieuDat.getSelectionModel().setSelectionInterval(row, row);
        }      
          
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemCTActionPerformed
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        if(txtMPD.getText().equals("") || txtDiaChi.getText().equals("") ||txtSDT.getText().equals("") || txtMaKH.getText().equals("") || dateDat.getDate().equals("") || dateGiao.getDate().equals(""))
                 baoloi.setText("Vui l??ng nh???p ?????y ????? th??ng tin phi???u ?????t!");
        else{
            int row = tblPhieuDat.getSelectedRow();
            for(PhieuDat pdhh : Controller.controller.arrayListPhieuDat){
                if(pdhh.getMaKH().equals(txtMaKH.getText())){
                txtHo.setText(pdhh.getHoKH());
                txtTen.setText(pdhh.getTenKH());}
            }
            PhieuDat pd = new PhieuDat(txtMPD.getText(), txtHo.getText(), txtTen.getText(), txtDiaChi.getText(),txtMaKH.getText() , txtSDT.getText(), dateDat.getDate(),dateGiao.getDate() );
           if (tblPhieuDat.getSelectedRow()==-1){
                for (PhieuDat pdh : Controller.controller.arrayListPhieuDat)
                    if(pdh.getMaPD().equals(txtMPD.getText())){
                        baoloi.setText("phi???u ?????t ???? t???n t???i");
                        return;
                    }
                
                Connection.InsertData.insertPhieuDat(pd);

                
                showData();

                tblPhieuDat.getSelectionModel().setSelectionInterval(tblPhieuDat.getRowCount()-1,tblPhieuDat.getRowCount()-1);

             }
            else
           {
                
                Connection.UpdateData.updatePhieuDat(pd);
                
           }
          showData();
          tblPhieuDat.getSelectionModel().setSelectionInterval(row, row);
        }        
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(tblPhieuDat.getSelectedRow()==-1){
            baoloi.setText("Vui l??ng ch???n phi???u ?????t");}
        else
        {
          int confirmed = JOptionPane.showConfirmDialog(null,
                  "X??c Nh???n X??a Phi???u ?????t?", "X??c nh???n",JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    System.out.println( tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 1));
                    Connection.DeleteData.deletePhieuDat((String) tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 1));
                      showData();
                      showData1();
                } 
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
    if(tblCT_PhieuDat.getSelectedRow()==-1){
            baoloi.setText("Vui l??ng ch???n phi???u ?????t");}
        else
        {
          int confirmed = JOptionPane.showConfirmDialog(null,
                  "X??c Nh???n X??a Phi???u ?????t?", "X??c nh???n",JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    System.out.println( tblCT_PhieuDat.getValueAt(tblCT_PhieuDat.getSelectedRow(), 1));
                    Connection.DeleteData.deleteCT_PhieuDat((String) tblCT_PhieuDat.getValueAt(tblCT_PhieuDat.getSelectedRow(), 1));
                      showData1();
                } 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void tblPhieuDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuDatMousePressed
        baoloi.setText("");// TODO add your handling code here:
        int row= tblPhieuDat.getSelectedRow();
        txtMPD.setText((String) tblPhieuDat.getValueAt(row,1));
        txtMaKH.setText((String) tblPhieuDat.getValueAt(row,2));
        txtHo.setText((String) tblPhieuDat.getValueAt(row,3));
        txtTen.setText((String) tblPhieuDat.getValueAt(row,4));
        txtDiaChi.setText((String) tblPhieuDat.getValueAt(row,5));
        txtSDT.setText((String) tblPhieuDat.getValueAt(row,6));
        String datebd =  tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 7).toString(); 
        String datekt =  tblPhieuDat.getValueAt(tblPhieuDat.getSelectedRow(), 8).toString();
        datebd=datebd.substring(8,10)+"/"+datebd.substring(5,7)+"/"+datebd.substring(0,4);
        datekt=datekt.substring(8,10)+"/"+datekt.substring(5,7)+"/"+datekt.substring(0,4);

        try {
            java.util.Date  datetmp = new SimpleDateFormat("dd/MM/yyyy").parse(datebd);
             dateDat.setDate(datetmp);
             java.util.Date  datetmp1 = new SimpleDateFormat("dd/MM/yyyy").parse(datekt);
             dateGiao.setDate(datetmp1);
         } catch (ParseException ex) {
             Logger.getLogger(GiaoDienPhieuDat.class.getName()).log(Level.SEVERE, null, ex);
         }

        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhieuDatMousePressed

    private void tblCT_PhieuDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCT_PhieuDatMousePressed
        baoloi.setText("");// TODO add your handling code here:
        int row= tblCT_PhieuDat.getSelectedRow();
        txtMPD_CT.setText((String) tblCT_PhieuDat.getValueAt(row,1));
        txtMDH.setText((String) tblCT_PhieuDat.getValueAt(row,2));
        txtSL.setText(tblCT_PhieuDat.getValueAt(row, 3).toString());    
        txtGia.setText(tblCT_PhieuDat.getValueAt(row, 4).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCT_PhieuDatMousePressed

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
            java.util.logging.Logger.getLogger(GiaoDienPhieuDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhieuDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhieuDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhieuDat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienPhieuDat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoloi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaCT;
    private com.toedter.calendar.JDateChooser dateDat;
    private com.toedter.calendar.JDateChooser dateGiao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel sdfs;
    private javax.swing.JTable tblCT_PhieuDat;
    private javax.swing.JTable tblPhieuDat;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMDH;
    private javax.swing.JTextField txtMPD;
    private javax.swing.JTextField txtMPD_CT;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
