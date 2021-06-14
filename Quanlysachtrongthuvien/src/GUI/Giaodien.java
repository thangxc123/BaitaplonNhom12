package GUI;

import Entities.docgia;
import Entities.phieumuon;
import Entities.sach;
import Proceed.Giaotiep;
import Proceed.docghifile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Trần Khắc Quân
 */
public final class Giaodien extends javax.swing.JFrame {

    DefaultTableModel model;//tạo model cho bảng sách
    DefaultTableModel model1;//tạo model cho bảng đọc giả
    DefaultTableModel model2;//tạo model cho bảng khách mượn
    private ArrayList<Giaotiep> listsach;//tạo ra danh sách sách
    private ArrayList<Giaotiep> listdocgia;//tạo danh sách đọc giả
    private ArrayList<Giaotiep> listphieumuon;
    docghifile ioFile;//khai báo phương thức ioFile là docghifile

    /*lý do có docghifile ở đây vì chúng ta cần đọc file rồi xuất thông tin ra bảng và ngược lại, lấy 
thông tin từ các textField để ghi vào File*/
    public Giaodien() {
        ioFile = new docghifile();
        listsach = new ArrayList<>();
        listdocgia = new ArrayList<>();
        listphieumuon = new ArrayList<>();
        listsach = ioFile.doc("sach.DAT");
        listdocgia = ioFile.doc("docgia.DAT");
        listphieumuon = ioFile.doc("phieumuon.DAT");
        initComponents();
        model = (DefaultTableModel) banghienthisach.getModel();
        model1 = (DefaultTableModel) banghienthidg.getModel();
        model2 = (DefaultTableModel) banghienthiphieumuon.getModel();
        hienthisach();
        hienthidocgia();
        hienthiphieumuon();
    }

    public void hienthisach() {
        listsach.stream().map((g) -> (sach) g).forEachOrdered((s) -> {
            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()
            });
        });
    }

    public void hienthidocgia() {
        listdocgia.stream().map((g) -> (docgia) g).forEachOrdered((dg) -> {
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()
            });
        });
    }

    public void hienthiphieumuon() {
        listphieumuon.stream().map((g) -> (phieumuon) g).forEachOrdered((pm) -> {
            model2.addRow(new Object[]{
                pm.getMadausach(), pm.getMaphieumuon(), pm.getMadocgia(), pm.getNgaymuon()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaptheloaisach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutsuasach = new javax.swing.JButton();
        luusach = new javax.swing.JButton();
        nuthuy1 = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        nutThoat1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nhaptukhoasach = new javax.swing.JTextField();
        nuttimsach = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        suadg = new javax.swing.JButton();
        luudg = new javax.swing.JButton();
        themdg = new javax.swing.JButton();
        nuthuy2 = new javax.swing.JButton();
        xoadg = new javax.swing.JButton();
        nutThoat2 = new javax.swing.JButton();
        nhapsdt = new javax.swing.JTextField();
        nhapemail = new javax.swing.JTextField();
        nhapdiachi = new javax.swing.JTextField();
        nhaptendg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        banghienthidg = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nhaptukhoadg = new javax.swing.JTextField();
        nuttimdg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nútuakhachmuon = new javax.swing.JButton();
        nutluukhachmuon = new javax.swing.JButton();
        nutthemkhach = new javax.swing.JButton();
        nuthuy3 = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        NutThoat3 = new javax.swing.JButton();
        nhapngay = new javax.swing.JTextField();
        nhapmaspm = new javax.swing.JTextField();
        nhapmadgpm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        nhaptukhoapm = new javax.swing.JTextField();
        nuttimpm = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tongsosach = new javax.swing.JTextField();
        tongsodg = new javax.swing.JTextField();
        tongsopm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện ");

        jTabbedPane1.setName("Nhóm 4"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Thể loại");

        nhaptheloaisach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptheloaisachActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tác giả");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Số lượng");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtrangsachActionPerformed(evt);
            }
        });

        themsach.setBackground(new java.awt.Color(255, 255, 255));
        themsach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        themsach.setForeground(new java.awt.Color(102, 0, 0));
        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutsuasach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutsuasach.setForeground(new java.awt.Color(102, 0, 0));
        nutsuasach.setText("Sửa");
        nutsuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuasachActionPerformed(evt);
            }
        });

        luusach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        luusach.setForeground(new java.awt.Color(102, 0, 0));
        luusach.setText("Lưu");
        luusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luusachActionPerformed(evt);
            }
        });

        nuthuy1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuthuy1.setForeground(new java.awt.Color(102, 0, 0));
        nuthuy1.setText("Hủy");
        nuthuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy1ActionPerformed(evt);
            }
        });

        nutxoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutxoa.setForeground(new java.awt.Color(102, 0, 0));
        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutThoat1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutThoat1.setForeground(new java.awt.Color(102, 0, 0));
        nutThoat1.setText("Thoát chương trình");
        nutThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setText("Tìm Kiếm");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Từ Khóa");

        nuttimsach.setText("Tìm");
        nuttimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimsachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nhaptensach, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(nhaptheloaisach)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel25)
                                        .addGap(31, 31, 31)
                                        .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 51, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(151, 151, 151))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(nuttimsach)
                                                .addGap(169, 169, 169)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nutThoat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(luusach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(themsach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nutsuasach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuthuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhaptheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(themsach)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nuttimsach)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nutsuasach)
                                .addGap(18, 18, 18)
                                .addComponent(luusach)
                                .addGap(18, 18, 18)
                                .addComponent(nutxoa)
                                .addGap(18, 18, 18)
                                .addComponent(nuthuy1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nutThoat1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        suadg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        suadg.setText("Sửa");
        suadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suadgActionPerformed(evt);
            }
        });

        luudg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        luudg.setText("Lưu");
        luudg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudgActionPerformed(evt);
            }
        });

        themdg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        themdg.setText("Thêm");
        themdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdgActionPerformed(evt);
            }
        });

        nuthuy2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuthuy2.setText("Hủy");
        nuthuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy2ActionPerformed(evt);
            }
        });

        xoadg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        xoadg.setText("Xóa");
        xoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadgActionPerformed(evt);
            }
        });

        nutThoat2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutThoat2.setText("Thoát chương trình");
        nutThoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat2ActionPerformed(evt);
            }
        });

        nhapdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachiActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên đọc giả");

        jLabel12.setText("Địa chỉ");

        jLabel13.setText("Email");

        jLabel14.setText("Số điện thoại");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đọc giả", "Tên đọc giả", "Địa chỉ", "email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(banghienthidg);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tìm kiếm");

        jLabel26.setText("Từ Khóa");

        nuttimdg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuttimdg.setText("Tìm");
        nuttimdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimdgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nhapemail, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(nhaptendg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nhapdiachi, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nhapsdt)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 183, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(nuttimdg, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130)
                                        .addComponent(suadg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(272, 272, 272))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel26)
                                .addGap(27, 27, 27)
                                .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(themdg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(luudg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nutThoat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuthuy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xoadg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(nhapemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themdg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuttimdg)
                            .addComponent(suadg))
                        .addGap(18, 18, 18)
                        .addComponent(luudg)))
                .addGap(18, 18, 18)
                .addComponent(xoadg)
                .addGap(18, 18, 18)
                .addComponent(nuthuy2)
                .addGap(18, 18, 18)
                .addComponent(nutThoat2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý đọc giả", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        nútuakhachmuon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nútuakhachmuon.setText("Sửa");
        nútuakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nútuakhachmuonActionPerformed(evt);
            }
        });

        nutluukhachmuon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutluukhachmuon.setText("Lưu");
        nutluukhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluukhachmuonActionPerformed(evt);
            }
        });

        nutthemkhach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutthemkhach.setText("Thêm Mượn");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nuthuy3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuthuy3.setText("Hủy");
        nuthuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy3ActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nutxoakhachmuon.setText("Đã Trả");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        NutThoat3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NutThoat3.setText("Thoát chương trình");
        NutThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutThoat3ActionPerformed(evt);
            }
        });

        nhapngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapngayActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Mã đọc giả");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Mã sách mượn");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Ngày mượn");

        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã đọc giả mượn", "Mã sách mượn", "Ngày mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(banghienthiphieumuon);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Seach");

        nuttimpm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuttimpm.setText("Tìm");
        nuttimpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimpmActionPerformed(evt);
            }
        });

        jLabel27.setText("Từ khóa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(339, 339, 339))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel27)
                                .addGap(35, 35, 35)
                                .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(nuttimpm))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nútuakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nutxoakhachmuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nutluukhachmuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NutThoat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuthuy3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nutthemkhach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel27))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nutthemkhach))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuttimpm)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nutxoakhachmuon)
                                .addGap(18, 18, 18)
                                .addComponent(nútuakhachmuon)
                                .addGap(18, 18, 18)
                                .addComponent(nutluukhachmuon)))
                        .addGap(18, 18, 18)
                        .addComponent(nuthuy3)
                        .addGap(18, 18, 18)
                        .addComponent(NutThoat3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý mượn sách", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("Thống kê số liệu");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Tổng số sách trong kho");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Tổng số đọc giả đã đăng ký");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Số sách đang cho mượn");

        tongsosach.setEditable(false);

        tongsodg.setEditable(false);

        tongsopm.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tongsodg)
                                .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tongsodg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 255));
        jLabel29.setText("TRƯỜNG ĐẠI HỌC TÀI CHÍNH-NGÂN HÀNG HÀ NỘI");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("KHOA CÔNG NGHỆ THÔNG TIN");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("BÀI TẬP LỚN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NHÓM 12");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Vũ Hữu Quang Anh");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Dương Đức Thắng");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Đặng Văn Hanh");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("(Trưởng Nhóm)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(179, 179, 179))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel30))
                            .addComponent(jLabel15))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin nhóm tác giả", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhaptheloaisachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptheloaisachActionPerformed

    }//GEN-LAST:event_nhaptheloaisachActionPerformed

    private void nhapdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapdiachiActionPerformed

    }//GEN-LAST:event_nhapdiachiActionPerformed

    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoakhachmuonActionPerformed
 int hangpm = banghienthiphieumuon.getSelectedRow();
       if (hangpm != -1) {
           model2.removeRow(hangpm);//xóa thông tin trong hàng đã chọn
            listphieumuon.remove(hangpm);//xóa thông tin trong list
           ioFile.ghi(listphieumuon, "phieumuon.DAT");//xóa thông tin trong file lưu trữ
        }else{
           JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
       }
    
    }//GEN-LAST:event_nutxoakhachmuonActionPerformed

    public boolean khongtrungmasach(int masach) { //tao ra hàm với kiểu dữ liệu boolean
        //kiểu dữ liệu boolean chỉ trả về 2 giá trị là True hoặc False
        if (!listsach.stream().map((g) -> (sach) g).noneMatch((s) -> (s.getMasach() == masach))) {
            return false;
        } //vòng lặp để đảm bảo test hết dãy mã sách
        //nếu mã sách trùng với 1 mã nào đó thì trả về false
        return true;//nếu không trùng thì trả về true
    }

    /*để các mã đọc giả được tạo tự động và không trùng nhau, cũng như các mã đã bị xóa có thể được sử dụng lại, chúng ta tạo
    ra hàm khongtrungmasach như trình bày ở trên.
    VD: mã tự động tạo tăng dần từ 10001 đến 10009. nhưng trong quá trình quản lý ta xóa mất đọc giả có mã 10005.
    nếu có hàm như trên, đọc giả khi được tạo sẽ có mã là 10005 chứ không phải 10010*/
    //tương tự ta tạo ra hàm khongtrungmadg để đảm bảo cho mã đọc giả không trùng nhau
    public boolean khongtrungmadg(int madg) {
        if (!listdocgia.stream().map((g) -> (docgia) g).noneMatch((dg) -> (dg.getMadg() == madg))) {
            return false;
        } //nếu mã đọc giả trùng với 1 mã nào đó thì trả về false
        return true;//nếu không trùng thì trả về true
    }

    public boolean khongtrungmapm(int mapm) { //tao ra hàm với kiểu dữ liệu boolean
        //kiểu dữ liệu boolean chỉ trả về 2 giá trị là True hoặc False
        if (!listphieumuon.stream().map((g) -> (phieumuon) g).noneMatch((pm) -> (pm.getMaphieumuon() == mapm))) {
            return false;
        } //vòng lặp để đảm bảo test hết dãy mã phiếu mượn
        //nếu mã PM trùng với 1 mã nào đó thì trả về false
        return true;//nếu không trùng thì trả về true
    }
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themsachActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT "THÊM SÁCH"/
        
        /*trước tiên ta cần xét diều kiện là trong ô nhập tên sách, người dùng phải
        nhập tên mới có thể thêm sách vào kho. Để làm được điều này, ta dùng cấu trúc if else*/
        if (nhaptensach.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int ma = 10000;//khởi tạo mã sách là 10000
            while (true) {//vòng lặp while được thực hiện nếu có giá trị là true ở hàm khongtrungmasach đã nêu ở trên
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;//mã sách tăng dần
            }
            //ta thực hiện get các thông tin của sách
            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            /*trong quá trình làm, khi nhập vào số lượng sách,kiểu dữ liệu int mà văn bản trong textField luôn là kiểu chuỗi
      vì vậy xảy ra lỗi. Nhóm đã sử dụng phương thức biến đổi chuỗi String thành Int như trình bày ở dòng (1). Tuy nhiên
      nếu người dùng không biết sách có số lượng là bao nhiêu nên vô tình không nhập số lượng thì chương trình sẽ lỗi bởi
      (nhapsoluongsach.getText) bị lỗi. 
      Sau khi suy nghĩ tìm cách giải quyết, nhóm đã sử dụng cấu trúc if else để khắc phục. khi người dùng không nhập
      số lượng sách vào thì chương trình sẽ mặc định giá trị của Soluong là 0*/
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));//(1)
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());//phương thức toString để biến các item trong comboBox thành chuỗi
            listsach.add(s);//ghi thông tin ra mảng list sách
            ioFile.ghi(listsach, "sach.DAT");//Ghi thông tin ra file

            model.addRow(new Object[]{//Ghi thông tin ra bảng hiển thị sách
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()});
    }//GEN-LAST:event_themsachActionPerformed
     else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }/*như đã giải thích ở trên, khi người dùng không nhập tên sách thì 1 bảng thông báo hiện ra là Bạn cần phải nhập tên sách*/
    }
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaptensachActionPerformed

    }//GEN-LAST:event_nhaptensachActionPerformed

    private void nutThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat1ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_nutThoat1ActionPerformed

    private void nutThoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutThoat2ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_nutThoat2ActionPerformed

    private void NutThoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutThoat3ActionPerformed
        System.exit(0);//thoát hoàn toàn chương trình
    }//GEN-LAST:event_NutThoat3ActionPerformed

    private void tinhtrangsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtrangsachActionPerformed

    }//GEN-LAST:event_tinhtrangsachActionPerformed

    private void nutsuasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsuasachActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT "SỬA SÁCH"*/

        //Để sửa 1 sách, người dùng phải chọn dòng chứa sách cần sửa. để xác định được dòng người dùng đã chọn, ta tạo ra biến hangchon
        int hangchon;//tạo ra biến hangchon để xác định hàng mà người dùng đang chọn
        hangchon = banghienthisach.getSelectedRow(); //biến sẽ là giá trị trả về của hàm "getSelectedRow". 
        if (hangchon != -1) {/*mặc định nếu không chọn hàng nào thì giá trị của hàm getSelectedRow sẽ trả về là -1.
                            vì vậy ta cần xét 2 trường hợp qua cấu trúc if else. Nếu người dùng chọn hàng thì có
                            thể tiến hành sửa. Nếu chưa chọn hàng nào thì không thể sửa được!*/
            nhaptensach.setText(model.getValueAt(hangchon, 1).toString());/*đưa thông tin từ dòng hangchon và vị trí
                                                                        cột 1 ra trường nhập tên sách. Bởi mặc định
                                                                        khi chọn hàng là object nên cần dùng toString
                                                                        để biến sang dạng chuỗi*/
            nhaptheloaisach.setText(model.getValueAt(hangchon, 2).toString());
            nhaptacgia.setText(model.getValueAt(hangchon, 3).toString());
            nhapsoluongsach.setText(model.getValueAt(hangchon, 4).toString());
            tinhtrangsach.setSelectedItem(model.getValueAt(hangchon, 5).toString());//đây là combobox nên dùng setSelectedItem
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn sửa!");/*như đã giải thích ở trên, khi người dùng không chọn dòng nào thì
                                                                                    1 bảng thông báo hiện ra là Bạn cần phải chọn dòng muốn sửa!*/
        }
    }//GEN-LAST:event_nutsuasachActionPerformed

    private void luusachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luusachActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT "LƯU SÁCH"*/

 /*sau khi đưa được các thông tin từ bảng ra các textfiel và sửa, chúng ta
        cần lưu thông tin vừa sửa lại đúng vị trí của dòng đang chọn*/
        if (nhaptensach.getText().length() != 0) {
            int hang = banghienthisach.getSelectedRow();
            /*cách lưu thông tin tương tự như thêm thông tin mới
            tuy nhiên để mã sách không bị thay đổi, ta cần lấy thông tin từ dòng hang,
            cột 0 (cột thứ nhất) để set cho Masach mới (2)*/
            sach s = new sach();
            s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));//(2)
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.set(hang, s);
            /*nếu như thêm sách thì ta dùng listsach.add(s) tức thêm phần tử mới; thì ở đây ta sửa lại giá trị của dòng hang*/

            ioFile.ghi(listsach, "sach.DAT");//Ghi thông tin ra file

            model.setValueAt(s.getMasach(), hang, 0);//ghi thông tin ra từng cột trong hàng
            model.setValueAt(s.getTensach(), hang, 1);
            model.setValueAt(s.getTheloai(), hang, 2);
            model.setValueAt(s.getTacgia(), hang, 3);
            model.setValueAt(s.getSoluong(), hang, 4);
            model.setValueAt(s.getTinhtrang(), hang, 5);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luusachActionPerformed

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoaActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " XÓA SÁCH"*/
 /* để xóa thông tin ta cần thao tác:
        1.xóa thông tin trong bảng
        2.xóa thông tin trong list
        3.xóa thông tin trong file lưu trữ*/
        int hang = banghienthisach.getSelectedRow();
        if (hang != -1) {
            model.removeRow(hang);//xóa thông tin trong hàng đã chọn
            listsach.remove(hang);//xóa thông tin trong list
            ioFile.ghi(listsach, "sach.DAT");//xóa thông tin trong file lưu trữ
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
        }
    }//GEN-LAST:event_nutxoaActionPerformed

    private void nuthuy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy1ActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " HỦY TRONG QUẢN LÝ SÁCH"*/
 /*nút hủy có chức năng xóa hết thông tin đang nhập dở trong các TextFiel*/
        nhaptensach.setText("");
        nhaptukhoasach.setText("");
        nhaptheloaisach.setText("");
        nhaptacgia.setText("");
        nhapsoluongsach.setText("");
        tinhtrangsach.setSelectedIndex(0);//đưa combobox về vị trí item đầu tiên
    }//GEN-LAST:event_nuthuy1ActionPerformed

    private void nuthuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy2ActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " HỦY TRONG QUẢN LÝ ĐỌC GIẢ"*/

        nhaptendg.setText("");
        nhaptukhoadg.setText("");
        nhapdiachi.setText("");
        nhapemail.setText("");
        nhapsdt.setText("");
    }//GEN-LAST:event_nuthuy2ActionPerformed

    private void nuthuy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuy3ActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " HỦY TRONG QUẢN LÝ PHIẾU MƯỢN"*/

 /*nút hủy có chức năng xóa hết thông tin đang nhập dở trong các TextFiel*/
        nhapmadgpm.setText("");
        nhapmaspm.setText("");
        nhapngay.setText("");
        nhaptukhoapm.setText("");
    }//GEN-LAST:event_nuthuy3ActionPerformed

    private void themdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themdgActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " THÊM ĐỌC GIẢ"*/
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int madg = 10000;//khởi tạo mã sách là 10000
            while (true) {//vòng lặp while được thực hiện nếu có giá trị là true ở hàm khongtrungmadg đã nêu ở trên
                if (khongtrungmadg(madg)) {
                    break;
                }
                madg++;//mã đọc giả tăng dần
            }
            docgia dg = new docgia();
            dg.setMadg(madg);
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            listdocgia.add(dg);//Ghi thông tin vào list
            ioFile.ghi(listdocgia, "docgia.DAT");//Ghi thông tin ra file
            model1.addRow(new Object[]{//Ghi thông tin ra bảng
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }//GEN-LAST:event_themdgActionPerformed

    private void suadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suadgActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " SỬA ĐỌC GIẢ"*/
        int hangdg;//tạo ra biến hangdg để xác định hàng mà người dùng đang chọn
        hangdg = banghienthidg.getSelectedRow(); //biến sẽ là giá trị trả về của hàm getSelectedRow. 
        if (hangdg != -1) {/*mặc định nếu không chọn hàng nào thì giá trị của hàm getSelectedRow sẽ trả về là -1.
                            vì vậy ta cần xét 2 trường hợp qua cấu trúc if else. Nếu người dùng chọn hàng thì có
                           thể tiến hành sửa. Nếu chưa chọn hàng nào thì không thể sửa được!*/
            nhaptendg.setText(model1.getValueAt(hangdg, 1).toString());/*đưa thông tin từ dòng hangchon và vị trí
                                                                        cột 1 ra trường nhập tên đọc giả. Bởi mặc định
                                                                       khi chọn hàng là object nên cần dùng toString
                                                                      để biến sang dạng chuỗi*/
            nhapdiachi.setText(model1.getValueAt(hangdg, 2).toString());
            nhapemail.setText(model1.getValueAt(hangdg, 3).toString());
            nhapsdt.setText(model1.getValueAt(hangdg, 4).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn sửa!");
        }

    }//GEN-LAST:event_suadgActionPerformed

    private void xoadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoadgActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " XÓA ĐỌC GIẢ"*/

        int hangdg = banghienthidg.getSelectedRow();
        if (hangdg != -1) {
            model1.removeRow(hangdg);//xóa thông tin trong hàng đã chọn
            listdocgia.remove(hangdg);//xóa thông tin trong list
            ioFile.ghi(listdocgia, "docgia.DAT");//xóa thông tin trong file lưu trữ
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn xóa!");
        }
    }//GEN-LAST:event_xoadgActionPerformed

    private void luudgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luudgActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " LƯU ĐỌC GIẢ"*/

 /*sau khi đưa được các thông tin từ bảng ra các textfiel và sửa, chúng ta
        cần lưu thông tin vừa sửa lại đúng vị trí của dòng đang chọn*/
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {
            int hangdg = banghienthidg.getSelectedRow();
            /*cách lưu thông tin tương tự như thêm thông tin mới
            tuy nhiên để mã đọc giả không bị thay đổi, ta cần lấy thông tin từ dòng hangdg
            và cột 0 để set cho Madg mới((3)*/
            docgia dg = new docgia();
            dg.setMadg(Integer.parseInt(model1.getValueAt(hangdg, 0).toString()));//(3)
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));

            listdocgia.set(hangdg, dg);//sửa thông tin trong list
            ioFile.ghi(listdocgia, "docgia.DAT");//Ghi thông tin ra file
            model1.setValueAt(dg.getMadg(), hangdg, 0);//ghi thông tin ra từng cột trong hàng
            model1.setValueAt(dg.getTendg(), hangdg, 1);
            model1.setValueAt(dg.getDiachi(), hangdg, 2);
            model1.setValueAt(dg.getEmaildg(), hangdg, 3);
            model1.setValueAt(dg.getSdtdg(), hangdg, 4);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }//GEN-LAST:event_luudgActionPerformed

    private void nuthuytim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuthuytim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuthuytim1ActionPerformed

    private void chontimsach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chontimsach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chontimsach1ActionPerformed

    private void nuttimsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimsachActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " TÌM SÁCH"*/

        model.fireTableDataChanged();//cập nhật lại toàn bộ dữ liệu bảng khi nút tìm được nhấn để hiển thị kết quả
        /* Sử dụng table sorter ở đây để lọc ra dòng có chứa từ khóa đã được nhập và giữ lại dòng có chứ từ khóa đó sau khi cập nhật bảng ở trên*/
        TableRowSorter sorter = new TableRowSorter(model);
        banghienthisach.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoasach.getText()));//lọc thông tin từ từ khóa được nhập ở "nhaptukhoasach"
    }//GEN-LAST:event_nuttimsachActionPerformed

    private void nuttimdgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimdgActionPerformed
        /*PHẦN CODE DƯỚI NÀY THỰC HIỆN CHỨC NĂNG CHO NÚT " TÌM ĐỌC GIẢ"*/

        model1.fireTableDataChanged();//cập nhật lại toàn bộ dữ liệu bảng khi nút tìm được nhấn để hiển thị kết quả
        /* Sử dụng table sorter ở đây để lọc ra dòng có chứa từ khóa đã được nhập và giữ lại dòng có chứ từ khóa đó sau khi cập nhật bảng ở trên*/
        TableRowSorter sorter = new TableRowSorter(model1);
        banghienthidg.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoadg.getText()));//lọc thông tin từ từ khóa được nhập ở "nhaptukhoadg"
    }//GEN-LAST:event_nuttimdgActionPerformed

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutthemkhachActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int mapm = 10000;//khởi tạo mã sách là 10000
            while (true) {//vòng lặp while được thực hiện nếu có giá trị là true ở hàm khongtrungmadg đã nêu ở trên
                if (khongtrungmapm(mapm)) {
                    break;
                }
                mapm++;//mã PM tăng dần
            }
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(mapm);
            pm.setNgaymuon(nhapngay.getText());
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            listphieumuon.add(pm);//Ghi thông tin vào list
            ioFile.ghi(listphieumuon, "phieumuon.DAT");//Ghi thông tin ra file
            model2.addRow(new Object[]{//Ghi thông tin ra bảng
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }//GEN-LAST:event_nutthemkhachActionPerformed

    private void nútuakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nútuakhachmuonActionPerformed
        int hangpm;//tạo ra biến hangdg để xác định hàng mà người dùng đang chọn
        hangpm = banghienthiphieumuon.getSelectedRow(); //biến sẽ là giá trị trả về của hàm getSelectedRow. 
        if (hangpm != -1) {/*mặc định nếu không chọn hàng nào thì giá trị của hàm getSelectedRow sẽ trả về là -1.
                            vì vậy ta cần xét 2 trường hợp qua cấu trúc if else. Nếu người dùng chọn hàng thì có
                           thể tiến hành sửa. Nếu chưa chọn hàng nào thì không thể sửa được!*/
            nhapmadgpm.setText(model2.getValueAt(hangpm, 1).toString());/*đưa thông tin từ dòng hangchon và vị trí
                                                                        cột 1 ra trường nhập tên đọc giả. Bởi mặc định
                                                                       khi chọn hàng là object nên cần dùng toString
                                                                      để biến sang dạng chuỗi*/
            nhapmaspm.setText(model2.getValueAt(hangpm, 2).toString());
            nhapngay.setText(model2.getValueAt(hangpm, 3).toString());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn phiếu mượn muốn sửa!");
        }
    }//GEN-LAST:event_nútuakhachmuonActionPerformed

    private void nutluukhachmuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutluukhachmuonActionPerformed
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int hangpm = banghienthiphieumuon.getSelectedRow();
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(Integer.parseInt(model2.getValueAt(hangpm, 0).toString()));
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            pm.setNgaymuon(nhapngay.getText());

            listphieumuon.set(hangpm, pm);//sửa thông tin trong list
            ioFile.ghi(listphieumuon, "phieumuon.DAT");//Ghi thông tin ra file
            model2.setValueAt(pm.getMadocgia(), hangpm, 1);//ghi thông tin ra từng cột trong hàng
            model2.setValueAt(pm.getMadausach(), hangpm, 2);
            model2.setValueAt(pm.getNgaymuon(), hangpm, 3);
            model2.setValueAt(pm.getMaphieumuon(), hangpm, 0);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");

        }
    }//GEN-LAST:event_nutluukhachmuonActionPerformed

    private void nuttimpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuttimpmActionPerformed
          model2.fireTableDataChanged();//cập nhật lại toàn bộ dữ liệu bảng khi nút tìm được nhấn để hiển thị kết quả
        /* Sử dụng table sorter ở đây để lọc ra dòng có chứa từ khóa đã được nhập và giữ lại dòng có chứ từ khóa đó sau khi cập nhật bảng ở trên*/
        TableRowSorter sorter = new TableRowSorter(model2);
        banghienthiphieumuon.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoapm.getText()));
        
    }//GEN-LAST:event_nuttimpmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sosach = banghienthisach.getRowCount();
        int sodocgia = banghienthidg.getRowCount();
        int sopm = banghienthiphieumuon.getRowCount();
          tongsosach.setText  (""+sosach);
          tongsodg.setText  (""+sodocgia);
          tongsopm.setText  (""+sopm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nhapngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapngayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapngayActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NutThoat3;
    private javax.swing.JTable banghienthidg;
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JTable banghienthisach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luudg;
    private javax.swing.JButton luusach;
    private javax.swing.JTextField nhapdiachi;
    private javax.swing.JTextField nhapemail;
    private javax.swing.JTextField nhapmadgpm;
    private javax.swing.JTextField nhapmaspm;
    private javax.swing.JTextField nhapngay;
    private javax.swing.JTextField nhapsdt;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptendg;
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JTextField nhaptheloaisach;
    private javax.swing.JTextField nhaptukhoadg;
    private javax.swing.JTextField nhaptukhoapm;
    private javax.swing.JTextField nhaptukhoasach;
    private javax.swing.JButton nutThoat1;
    private javax.swing.JButton nutThoat2;
    private javax.swing.JButton nuthuy1;
    private javax.swing.JButton nuthuy2;
    private javax.swing.JButton nuthuy3;
    private javax.swing.JButton nutluukhachmuon;
    private javax.swing.JButton nutsuasach;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nuttimdg;
    private javax.swing.JButton nuttimpm;
    private javax.swing.JButton nuttimsach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton nútuakhachmuon;
    private javax.swing.JButton suadg;
    private javax.swing.JButton themdg;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;
    private javax.swing.JTextField tongsodg;
    private javax.swing.JTextField tongsopm;
    private javax.swing.JTextField tongsosach;
    private javax.swing.JButton xoadg;
    // End of variables declaration//GEN-END:variables

    private Object getValueAt(int sosach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    private boolean AND(boolean b, boolean b0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
