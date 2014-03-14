import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import vn.com.dva.entities.Question;
import vn.com.dva.entities.Subject;
import vn.com.dva.entities.Users;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmKetQuaXemLai.java
 *
 * 
 */

/**
 *
 * @author duong
 */
public class FrmKetQuaXemLai extends javax.swing.JFrame {
    int n ;
    List<Question> list = new ArrayList<Question> ();
    List<String> choose = new ArrayList<String>();
    List<String> answerRandom = new ArrayList<String>();
    Subject monthi ;
    /** Creates new form FrmKetQuaXemLai */
    public FrmKetQuaXemLai(List<Question> list , List<String> da , List<String> ar, Subject s) {
        initComponents();
        this.list = list ;
        this.choose = da ;
        this.answerRandom = ar;
        monthi = s;
        this.n = list.size();
        Init();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLop = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNgayThi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblKyThi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMonThi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLanThi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblSo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTpNoiDung = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jRdA = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTpA = new javax.swing.JTextPane();
        jRdC = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTpC = new javax.swing.JTextPane();
        jRdB = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTpB = new javax.swing.JTextPane();
        jRdD = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTpD = new javax.swing.JTextPane();
        lblTongSo = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));
        jPanel1.setEnabled(false);

        jLabel1.setText("Họ Tên");

        jLabel2.setText("Lớp");

        lblLop.setText("D7CNTT15");

        jLabel7.setText("Tên Đăng nhập");

        lblUser.setText("jLabel8");

        jLabel9.setText("Ngày Sinh");

        lblNgaySinh.setText("jLabel10");

        lblHoTen.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(lblNgaySinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLop))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblUser)
                    .addComponent(jLabel1)
                    .addComponent(lblHoTen))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblNgaySinh)
                    .addComponent(jLabel2)
                    .addComponent(lblLop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kỳ Thi"));
        jPanel2.setEnabled(false);

        jLabel3.setText("Ngày Thi");

        lblNgayThi.setText("jLabel4");

        jLabel4.setText("Kỳ Thi");

        lblKyThi.setText("jLabel5");

        jLabel6.setText("Môn Thi");

        lblMonThi.setText("jLabel7");

        jLabel5.setText("Lần Thi");

        lblLanThi.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonThi))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLanThi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lblNgayThi)
                    .addComponent(lblKyThi))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblMonThi)
                    .addComponent(jLabel5)
                    .addComponent(lblLanThi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Câu hỏi : ");

        lblSo.setText("jLabel10");

        jScrollPane1.setViewportView(jTpNoiDung);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đáp Án", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        btg.add(jRdA);
        jRdA.setText("A");
        jRdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdAActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTpA);

        btg.add(jRdC);
        jRdC.setText("C");
        jRdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdCActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTpC);

        btg.add(jRdB);
        jRdB.setText("B");
        jRdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdBActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jTpB);

        btg.add(jRdD);
        jRdD.setText("D");
        jRdD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdDActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jTpD);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRdA)
                    .addComponent(jRdB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRdC)
                    .addComponent(jRdD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jRdA, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jRdC))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRdB)
                    .addComponent(jRdD)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lblTongSo.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongSo)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSo)
                    .addComponent(lblTongSo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl1.setText("Kết Quả");
        lbl1.setEnabled(false);

        lbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl.setText("...");

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(179, 179, 179)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdAActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRdAActionPerformed

    private void jRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdCActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRdCActionPerformed

    private void jRdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRdBActionPerformed

    private void jRdDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdDActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRdDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        int now = Integer.parseInt(lblSo.getText())-2;
        if (now < 0) {
            Cl_Client.ShowError("Đang ở đầu danh sách");
        } else {
            lblSo.setText(""+(now+1));
            loadCauHoi(now);
            setup(now);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        int now = Integer.parseInt(lblSo.getText());
        if (now+1 > n) {
            Cl_Client.ShowError("Hết câu hỏi");
        } else {
            lblSo.setText(""+(now+1));
            loadCauHoi(now);
            setup(now);
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRdA;
    private javax.swing.JRadioButton jRdB;
    private javax.swing.JRadioButton jRdC;
    private javax.swing.JRadioButton jRdD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTpA;
    private javax.swing.JTextPane jTpB;
    private javax.swing.JTextPane jTpC;
    private javax.swing.JTextPane jTpD;
    private javax.swing.JTextPane jTpNoiDung;
    public static javax.swing.JLabel lbl;
    public static javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblKyThi;
    private javax.swing.JLabel lblLanThi;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblMonThi;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgayThi;
    private javax.swing.JLabel lblSo;
    private javax.swing.JLabel lblTongSo;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables

    private void setup(int i){
        btg.clearSelection();
        jRdA.setForeground(Color.BLACK);
        jRdA.setSelected(false);
        jRdB.setForeground(Color.BLACK);
        jRdB.setSelected(false);
        jRdC.setForeground(Color.BLACK);
        jRdC.setSelected(false);
        jRdD.setForeground(Color.BLACK);
        jRdD.setSelected(false);
        String trueAnswer = this.getActualAnswer(list.get(i), answerRandom.get(i));
        if (trueAnswer.equals(choose.get(i))){
                lbl.setForeground(Color.RED);
                lbl.setText("Đúng");
                 if (choose.get(i).equals("A")) {
                    jRdA.setForeground(Color.RED);
                    jRdA.setSelected(true);
                }
                if (choose.get(i).equals("B")) {
                    jRdB.setForeground(Color.RED);
                    jRdB.setSelected(true);
                }
                if (choose.get(i).equals("C")) {
                    jRdC.setForeground(Color.RED);
                    jRdC.setSelected(true);
                }
                if (choose.get(i).equals("D")) {
                    jRdD.setForeground(Color.RED);
                    jRdD.setSelected(true);
                }
            }else{
                lbl.setForeground(Color.red);
                lbl.setText("Sai");
                if (choose.get(i).equals("A"))
                {
                    jRdA.setSelected(true);
                }
                else
                if (choose.get(i).equals("B"))
                {
                    jRdB.setSelected(true);
                }
                else
                if (choose.get(i).equals("C"))
                {
                    jRdC.setSelected(true);
                }
                else
                if (choose.get(i).equals("D"))
                {
                    jRdD.setSelected(true);
                }

                if (trueAnswer.equals("A"))
                {
                    jRdA.setForeground(Color.RED);
                }
                else
                if (trueAnswer.equals("B"))
                {
                    jRdB.setForeground(Color.RED);
                }
                else
                if (trueAnswer.equals("C"))
                {
                    jRdC.setForeground(Color.RED);
                }
                else
                if (trueAnswer.equals("D"))
                {
                    jRdD.setForeground(Color.RED);
                }
            }
    }
    
    
    private void Init() {        
            // Thoong tin
            Users u = Session.user ;
            lblUser.setText(u.getUserName());
            lblHoTen.setText(u.getFullName());
            lblNgaySinh.setText(u.getBirthday());
            //lblLop.setText(Cl_Client.c.getItemHoSoIDUser(Session.idUser, 6));
            
            // Ky thi
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            lblNgayThi.setText(sdf.format(new Date()));
            if (Session.kythi != null)
                lblKyThi.setText(Session.kythi.getExamName());
            else
                lblKyThi.setText("Luyện tập");
            lblMonThi.setText(monthi.getSubjectName());
            
//            if (Session.kythi.equals(""))
//                lblLanThi.setText("0");
//            else
//                lblLanThi.setText("");

            lblSo.setText("1");
            lblTongSo.setText("/"+ n);
            loadCauHoi(0);
            setup(0);
            
    }

    private void loadCauHoi(int cs) {
        Question q = list.get(cs);
        jTpNoiDung.setText(q.getContent());
        String s = answerRandom.get(cs);
        jTpA.setText(getChoose(q, s.charAt(0)));
        jTpB.setText(getChoose(q, s.charAt(1)));
        jTpC.setText(getChoose(q, s.charAt(2)));
        jTpD.setText(getChoose(q, s.charAt(3)));
    }
    
    public void resetLuachon()
    {
        btg.clearSelection();
    }
    
    
    private String getChoose(Question q , char ch){
        if (ch == 'A') return q.getChooseA();
        if (ch == 'B') return q.getChooseB();
        if (ch == 'C') return q.getChooseC();
        if (ch == 'D') return q.getChooseD();
        return "";
    }
    
    
    // Lay dap an dung sau khi da trao doi vi tri cau tra loi
    private String getActualAnswer(Question q , String s){
        int i = s.indexOf(q.getAnswer());
        String trueAnswer = "ABCD".charAt(i)+"";
        return trueAnswer;
        
    }

}
