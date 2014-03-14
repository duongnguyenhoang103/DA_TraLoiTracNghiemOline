
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import vn.com.dva.entities.DetailResultExam;
import vn.com.dva.entities.DetailTrain;
import vn.com.dva.entities.Question;
import vn.com.dva.entities.ResultExam;
import vn.com.dva.entities.Train;
import vn.com.dva.entities.Users;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmThi.java
 *
 *
 */
/**
 *
 * @author duong
 */
public class FrmThi extends javax.swing.JFrame implements ActionListener {

    static boolean isOpen = false;
    static int c;
    int n;
    Timer t;
    List<Question> list = new ArrayList<Question>();
    List<String> choose = new ArrayList<String>();
    List<String> answerRandom = new ArrayList<String>();
    Calculate calculate = new Calculate();
    /** Creates new form FrmThi */
    public FrmThi() {
        t = new Timer(1000, this);
        t.start();
        initComponents();
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
        lbl = new javax.swing.JLabel();
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
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl.setText("0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

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

        jLabel3.setText("Ngày Thi");

        lblNgayThi.setText("jLabel4");

        jLabel4.setText("Kỳ Thi");

        lblKyThi.setText("jLabel5");

        jLabel6.setText("Môn Thi");

        lblMonThi.setText("jLabel7");

        jLabel5.setText("Lần Thi");

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
                .addContainerGap(63, Short.MAX_VALUE))
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("Câu hỏi : ");

        lblSo.setText("jLabel10");

        jTpNoiDung.setEditable(false);
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRdC)
                    .addComponent(jRdD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

        jButton4.setText("Xem Ảnh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTongSo))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblSo)
                            .addComponent(lblTongSo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        jButton3.setText("Nộp Bài");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl1.setText("Thời gian còn lại :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(179, 179, 179)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.n = Session.socauhoi;
        c = Session.thoigian * 60;
        // Thoong tin
        Users user = Session.user;
        lblUser.setText(user.getUserName());
        lblHoTen.setText(user.getFullName());
        lblNgaySinh.setText(user.getBirthday());
        // Ky thi
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lblNgayThi.setText(sdf.format(new Date()));
        if (Session.kythi != null) {
            lblKyThi.setText(Session.kythi.getExamName());
            lblLanThi.setText("");
        } else {
            lblKyThi.setText("Luyện tập");
        }

        lblMonThi.setText(Session.monthi.getSubjectName());
        
        loadDSCauHoi();
        // tai 1 cau hoi đầu tiên
        tai1cauhoi(0);

    }//GEN-LAST:event_formWindowOpened

    public void loadDSCauHoi() {
        try {
            // Nếu test (ko phải thi )
            if (!Frm_SinhVien.isTest) {
                // Lấy danh sách câu hỏi theo môn thi thử
                list = Cl_Client.c.getAllQuestionBySubject(Session.monthi.getSubjecId());
                // Lọc danh sách câu hỏi lây số câu hỏi theo độ khó 
                list = Calculate.getListNQuestionByLevel(list, n, Session.dokho);                
            } else {
                list = Cl_Client.c.getListQuestionByExam(Session.kythi.getExamID(), n);
            }
            if (list == null) {
                JOptionPane.showMessageDialog(null, "Không đủ câu hỏi để làm");
                return;
            }
            JOptionPane.showMessageDialog(null, "so cau hoi = " + list.size());
            for (Question q : list) {
                JOptionPane.showMessageDialog(null, " id = " + q.getQuestionID());
                String s = calculate.randomAnswer();
                answerRandom.add(s);
                choose.add("");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FrmThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tai1cauhoi(int cs) {
        JOptionPane.showMessageDialog(null, answerRandom.get(cs));
        lblSo.setText((cs + 1) + "");
        lblTongSo.setText("/" + n);
        Question q = list.get(cs);
        JOptionPane.showMessageDialog(null, "Độ khó = "+ q.getLevelID());
        jTpNoiDung.setText(q.getContent());

        String s = answerRandom.get(cs);
        jTpA.setText(calculate.getChoose(q, s.charAt(0)));
        jTpB.setText(calculate.getChoose(q, s.charAt(1)));
        jTpC.setText(calculate.getChoose(q, s.charAt(2)));
        jTpD.setText(calculate.getChoose(q, s.charAt(3)));

        // Nếu xem lại , đã điền đáp án
        if (choose.get(cs).equals("A")) {
            jRdA.setSelected(true);
        } else if (choose.get(cs).equals("B")) {
            jRdB.setSelected(true);
        } else if (choose.get(cs).equals("C")) {
            jRdC.setSelected(true);
        } else if (choose.get(cs).equals("D")) {
            jRdD.setSelected(true);
        } else {
            this.resetLuachon();
        }
    }
    private void jRdDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        int now = Integer.parseInt(lblSo.getText()) - 1;
        if (now - 1 < 0) {
            Cl_Client.ShowError("Đang ở đầu danh sách");
        } else {
            if (jRdA.isSelected()) {
                choose.set(now, "A");
            } else if (jRdB.isSelected()) {
                choose.set(now, "B");
            } else if (jRdC.isSelected()) {
                choose.set(now, "C");
            } else if (jRdD.isSelected()) {
                choose.set(now, "D");
            } else {
                choose.set(now, " ");
            }
            resetLuachon();
            tai1cauhoi(now - 1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdBActionPerformed

    private void jRdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdAActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        int now = Integer.parseInt(lblSo.getText()) - 1;
        if (now + 2 > n) {
            Cl_Client.ShowError("Hết câu hỏi");
        } else {
            if (jRdA.isSelected()) {
                choose.set(now, "A");
            } else if (jRdB.isSelected()) {
                choose.set(now, "B");
            } else if (jRdC.isSelected()) {
                choose.set(now, "C");
            } else if (jRdD.isSelected()) {
                choose.set(now, "D");
            } else {
                choose.set(now, " ");
            }
            resetLuachon();
            tai1cauhoi(now + 1);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdCActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FrmThi.isOpen = false;
        int now = Integer.parseInt(lblSo.getText()) - 1;
        if (jRdA.isSelected()) {
            choose.set(now, "A");
        } else if (jRdB.isSelected()) {
            choose.set(now, "B");
        } else if (jRdC.isSelected()) {
            choose.set(now, "C");
        } else if (jRdD.isSelected()) {
            choose.set(now, "D");
        } else {
            choose.set(now, " ");
        }

        int dung = 0;
        int sai = 0;
        for (int i = 0; i < list.size(); i++) {
            if (calculate.getActualAnswer(list.get(i), answerRandom.get(i)).equals(choose.get(i))) {
                dung++;
            } else {
                sai++;
            }
        }
        Session.diemso = (dung * 100 / (dung + sai));
        Session.socaudung = dung;
        Session.socausai = sai;
        JOptionPane.showMessageDialog(null, "So cau dung = " + dung);
        JOptionPane.showMessageDialog(null, "So cau sai = " + sai);
        FrmKetQuaThi kq = new FrmKetQuaThi(list, choose, answerRandom,Session.monthi,list.size(),dung, false);
        kq.setVisible(true);
        t.stop();

        // Luu thong tin thi thu xuong csdl
        if (Session.kythi == null)
            saveTrain();
        else saveResultExam();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void saveTrain() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Train bean = new Train();
            bean.setUserID(Session.user.getUserID());
            bean.setSubjectID(Session.monthi.getSubjecId());
            bean.setLevelID(Session.dokho.getLevelAllID());
            bean.setTimes(Session.thoigian);
            bean.setTotalQuestion(Session.socauhoi);
            bean.setDate_Train(sdf.format(new Date()));
            bean.setScore(Session.diemso);
            bean = Cl_Client.c.insertTrainGetId(bean);
            JOptionPane.showMessageDialog(null, "Train ID =  " + bean.getTrainID());

            // Luu chi tiet thi
            DetailTrain bean1 = new DetailTrain();
            bean1.setTrainID(bean.getTrainID());
            List<Long> listIdQuestion = new ArrayList<Long>();
            List<String> listAnswer = new ArrayList<String>();
            List<String> listTrueAnswer = new ArrayList<String>();

            for (int i = 0; i < list.size(); i++) {
                listIdQuestion.add(list.get(i).getQuestionID());
                listAnswer.add(choose.get(i));
                listTrueAnswer.add(calculate.getActualAnswer(list.get(i), answerRandom.get(i)));
                JOptionPane.showMessageDialog(null, "Add Id = " + list.get(i).getQuestionID() + ", Answer = " + choose.get(i) + ", Answer true= " + calculate.getActualAnswer(list.get(i), answerRandom.get(i)));
            }
            bean1.setListIdQuestion(listIdQuestion);
            bean1.setListIdAnswer(listAnswer);
            bean1.setListAnswerRandom(answerRandom);
            if (Cl_Client.c.insertDetailTrain(bean1)) {
                JOptionPane.showMessageDialog(null, "Insert ok");
            } else {
                JOptionPane.showMessageDialog(null, "Insert faild");
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FrmThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveResultExam() {
        try {
            ResultExam bean = new ResultExam();
            bean.setExamID(Session.kythi.getExamID());
            bean.setUserID(Session.user.getUserID());
            bean.setTimes(Session.thoigian);
            bean.setScore(Session.diemso);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date d = new Date();
            String s = sdf.format(d);
            Date ds = new Date();
            try {
                ds = sdf.parse(s);
            } catch (ParseException ex) {
            }
            Calendar c = Calendar.getInstance();
            c.setTime(ds);
            bean.setDateTest(c);
            bean = Cl_Client.c.insertResultExam(bean);
            saveDetailResultExam(bean);
        } catch (RemoteException ex) {
            Logger.getLogger(FrmThi.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    private void saveDetailResultExam(ResultExam re){
        try {
            // Luu chi tiet thi
                DetailResultExam bean = new DetailResultExam();
                bean.setResultExamID(re.getId());
                List<Long> listIdQuestion = new ArrayList<Long>();
                List<String> listAnswer = new ArrayList<String>();
                List<String> listTrueAnswer = new ArrayList<String>();

                for (int i = 0; i < list.size(); i++) {
                    listIdQuestion.add(list.get(i).getQuestionID());
                    listAnswer.add(choose.get(i));
                    listTrueAnswer.add(calculate.getActualAnswer(list.get(i), answerRandom.get(i)));
                    JOptionPane.showMessageDialog(null, "Add Id = " + list.get(i).getQuestionID() + ", Answer = " + choose.get(i) + ", Answer true= " + calculate.getActualAnswer(list.get(i), answerRandom.get(i)));
                }
                bean.setListIdQuestion(listIdQuestion);
                bean.setListIdAnswer(listAnswer);
                bean.setListAnswerRandom(answerRandom);
                if (Cl_Client.c.insertDetailResultExam(bean)){
                    JOptionPane.showMessageDialog(null, "Insert ok");
                } else {
                    JOptionPane.showMessageDialog(null, "Insert faild");
                }
        } catch (RemoteException ex) {
            Logger.getLogger(FrmThi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //initComponents();
        //jScrollPane1.removeAll();
        this.jScrollPane1.setVisible(false);
       //jScrollPane1.setVisible(false);
//       jScrollPane1.setSize(30, 100);
//       jScrollPane1.removeAll();
//        jTpNoiDung.setVisible(false);
        JOptionPane.showMessageDialog(null, "click");
//        jScrollPane1.resize(100, 120);
        //jScrollPane1.re
       // jTpNoiDung.setSize(100, 100);
 //       jScrollPane1.setVisible(true);
//        jTpNoiDung.setVisible(true);
        
        jScrollPane1.removeAll();
        jScrollPane1.setSize(100, 100);
        jScrollPane1.setPreferredSize(new Dimension(200, 200));

        this.repaint();
       this.jScrollPane1.setVisible(true);
       //this.add(jScrollPane1);

        this.repaint();
        pack();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Frm_SinhVien.isTest = false;
    }//GEN-LAST:event_formWindowClosed

    public void resetLuachon() {
        btg.clearSelection();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmThi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == t) {
            if (c > 60) {
                int m = c / 60;
                int s = c % 60;
                lbl.setText(m + "phút ," + s + " giây");
                c--;
            }
            if (c > 0 && c <= 60) {
                lbl.setText("" + c + "giây");
                c--;
            }
            if (c == 0) {
                lbl.setText("Hết giờ");
                this.jButton3ActionPerformed(e);
            }
        }
    }

}
